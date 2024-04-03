package com.olive.gatlingdemo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.gatlingdemo.model.PostOTP;
import com.olive.gatlingdemo.model.SampleXMLRequest;
import com.olive.gatlingdemo.service.LoadService;

@RestController
public class XMLController {
	
	@Autowired
	LoadService loadService;

    @PostMapping(value = "/xml", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public DeferredResult<String> handleXMLRequest(@RequestBody SampleXMLRequest xmlRequest) {
    	DeferredResult<String> result = new DeferredResult<String>(120000L, sendError("91", "Time Out"));
      
        
        loadService.processLoadservice(xmlRequest,result);
        return result;
    }
    
    
    @PostMapping(value = "/otp", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public DeferredResult<String> handleOtpRequest(@RequestBody PostOTP xmlRequest) {
    	DeferredResult<String> result = new DeferredResult<String>(120000L, sendError("91", "Time Out"));
      
        
        loadService.processOtpservice(xmlRequest, result);
        return result;
    }

    
    protected String sendError(String code, String reason) {

		String data = code + "|" + reason + "|||||";
		return data;
	}
}
