package com.olive.gatlingdemo.config;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class OliveAsyncTaskExecutor implements AsyncTaskExecutor,
        InitializingBean, DisposableBean {

    private final Logger log = LoggerFactory.getLogger(OliveAsyncTaskExecutor.class);

    private final ThreadPoolTaskExecutor executor;
    private String name;

    public OliveAsyncTaskExecutor(ThreadPoolTaskExecutor executor,String name) {
        this.executor = executor;
        this.name=name;
    }

    public ThreadPoolTaskExecutor getThreadPoolTaskExecutor(){
    	return  executor;
    }
    @Override
    public void execute(Runnable task) {
        //executor.execute(task);
    	executor.execute(createWrappedRunnable(task));
    }

    @Override
    public void execute(Runnable task, long startTimeout) {
        executor.execute(createWrappedRunnable(task), startTimeout);
    }

    private <T> Callable<T> createCallable(final Callable<T> task) {
    	final long startTime = System.currentTimeMillis();
    	Callable<T> callable=new Callable<T>() {
 			@Override
			public T call() throws Exception {
				 try {
					    final long queueDuration = System.currentTimeMillis() - startTime;
	                    log.debug("Name{} Task {} spent {}ms in queue",name, task, queueDuration);
		                return task.call();
		         } catch (Exception e) {
		                handle(e);
		                throw e;
		         }
			}
		};
		return callable;
    }

    private Runnable createWrappedRunnable(final Runnable task) {
    	final long startTime = System.currentTimeMillis();
        Runnable r=new Runnable() {
	 		@Override
			public void run() {
				 try {
					    final long queueDuration = System.currentTimeMillis() - startTime;
	                    log.debug("Task {} spent {}ms in queue", task, queueDuration);
		                task.run();
		            } catch (Exception e) {
		                handle(e);
		         }
 			}
		};
		return r;
    	/*return () -> {
            try {
                task.run();
            } catch (Exception e) {
                handle(e);
            }
        };*/
    }

    protected void handle(Exception e) {
        log.error("Caught async exception", e);
    }

    @Override
    public Future<?> submit(Runnable task) {
        return executor.submit(createWrappedRunnable(task));
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return executor.submit(createCallable(task));
    }

    @Override
    public void destroy() throws Exception {
        if (executor instanceof DisposableBean) {
            DisposableBean bean = executor;
            bean.destroy();
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (executor instanceof InitializingBean) {
            InitializingBean bean = executor;
            bean.afterPropertiesSet();
        }
    }
}
