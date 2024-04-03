package com.olive.gatlingdemo.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.gatlingdemo.model.PostOTP;
import com.olive.gatlingdemo.model.SampleXMLRequest;

public interface LoadService {
	
	void processLoadservice(SampleXMLRequest xmlRequest, DeferredResult<String> result);
	
	void processOtpservice(PostOTP xmlRequest, DeferredResult<String> result);
	
	void npciRequestPreparations();

}
