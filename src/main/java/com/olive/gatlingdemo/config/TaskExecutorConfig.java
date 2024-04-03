package com.olive.gatlingdemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class TaskExecutorConfig {
	
	
	
	public static final String CORE_POOL_SIZE = "100";

	public static final String MAX_POOL_SIZE = "1000";

	public static final String QUEUE_POOL_SIZE = "3000";

	@Autowired
	private Environment env;
	
	 @Bean(name="inReqPay",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor6() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("in-ReqPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("in-ReqPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("inReqPayExecutor-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"inReqPayExecutor");
	            
	    }
	 
	 @Bean(name="inRespPay",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor7() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("in-RespPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("in-RespPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("inRespPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"inRespPay");
	            
	    }
	 
	 
	 
	 
	 @Bean(name="inReqBalEnq",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor8() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("in-ReqBalEnq", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("in-ReqBalEnq", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("inReqBalEnqExecutor-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"inReqBalEnqExecutor");
	            
	    }
	 
	 @Bean(name="inRespBalEnq",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor9() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("in-RespBalEnq", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("in-RespBalEnq", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("inRespBalEnq-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"inRespBalEnq");
	            
	    }
	 
	 
	 
	
	 
	 
	 @Bean(name="outReqBioAuth",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor10() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-ReqBioAuth", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-ReqBioAuth", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outReqBioAuth-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outReqBioAuth");
	            
	    }
	 
	 @Bean(name="outRespBioAuth",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor11() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespBioAuth", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespBioAuth", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespBioAuth-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespBioAuth");
	            
	    }
	 
	 @Bean(name="outReqBalEnq",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor12() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-ReqBalEnq", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-ReqBalEnq", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outReqBalEnq-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outReqBalEnq");
	            
	    }
	 @Bean(name="outRespBalEnq",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor13() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespBalEnq", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespBalEnq", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespBalEnq-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespBalEnq");
	            
	    }
	 
	 
	 @Bean(name="outReqPay",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor14() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-ReqPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-ReqPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity",QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outReqPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outReqPay");
	            
	    }
	 
	 
	 @Bean(name="outRespPay",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor15() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespPay");
	            
	    }
	 
	 @Bean(name="outReqChkTxn",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor16() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespPay");
	            
	    }
	 
	 @Bean(name="outRespChkTxn",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor17() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespPay");
	            
	    }
	 
	 @Bean(name="inReqChkTxn",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor18() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespPay");
	            
	    }
	 
	 @Bean(name="inRespChkTxn",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor19() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("out-RespPay", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("outRespPay-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"outRespPay");
	            
	    }
	 
	 @Bean(name="vault",destroyMethod="destroy")
	    public OliveAsyncTaskExecutor getAsyncExecutor20() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(Integer.parseInt(this.env.getProperty("VaultRequest", CORE_POOL_SIZE)));
	        executor.setMaxPoolSize(Integer.parseInt(this.env.getProperty("VaultResponse", MAX_POOL_SIZE)));
	        executor.setQueueCapacity(Integer.parseInt(this.env.getProperty("queue-capacity", QUEUE_POOL_SIZE)));
	        executor.setThreadNamePrefix("VaultRequest-");
	        executor.initialize();
	        executor.setAllowCoreThreadTimeOut(true);
	          return new OliveAsyncTaskExecutor(executor,"VaultRequest");
	            
	    }
	
	 
}
