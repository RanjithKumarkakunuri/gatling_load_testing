package com.olive.gatlingdemo.serviceimpl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.olive.gatlingdemo.model.OtpReq;
import com.olive.gatlingdemo.model.OtpRequest;
import com.olive.gatlingdemo.model.PostOTP;
import com.olive.gatlingdemo.model.SampleXMLRequest;
import com.olive.gatlingdemo.model.SampleXMLResponse;
import com.olive.gatlingdemo.model.TransactionInfo;
import com.olive.gatlingdemo.service.LoadService;
@Service
public class LoadServiceImpl implements LoadService{

	

	@Async(value = "outReqBioAuth")
	public void processLoadservice(SampleXMLRequest xmlRequest, DeferredResult<String> result) {
		  //SampleXMLResponse response = new SampleXMLResponse();
	        
	       // System.out.println("SUCESS");
	        
		
	        SampleXMLResponse myObject = new SampleXMLResponse();
	        myObject.setMessage("Hello " + xmlRequest.getName() + "!");
	        // Set properties if needed

	        // Create XmlMapper
	        XmlMapper xmlMapper = new XmlMapper();

	        try {
	            // Serialize the object to XML string
	            String xmlString = xmlMapper.writeValueAsString(myObject);
	            
	            // Print or use the XML string as needed
	            System.out.println(xmlString);
	            result.setResult(xmlString);
	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }
		
	}

	@Override
	@Async(value = "outReqBioAuth")
	public void processOtpservice(PostOTP xmlRequest, DeferredResult<String> result) {
		
		//NpciRequest Processing
		npciRequestPreparations();
		
		
		//NpciResponse Processing 

		String npciResponseProcessing="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
				+ "<OtpResponse>\r\n"
				+ "    <TransactionInfo>\r\n"
				+ "        <Pan>200131XXXX8713</Pan>\r\n"
				+ "        <Proc_Code>140000</Proc_Code>\r\n"
				+ "        <Transm_Date_time>0121054136</Transm_Date_time>\r\n"
				+ "        <Stan>003184</Stan>\r\n"
				+ "        <Local_Trans_Time>111136</Local_Trans_Time>\r\n"
				+ "        <Local_date>0121</Local_date>\r\n"
				+ "        <AcqId>200131</AcqId>\r\n"
				+ "        <RRN>202111003184</RRN>\r\n"
				+ "        <ResponseCode>00</ResponseCode>\r\n"
				+ "        <ResponseMsg>Approved</ResponseMsg>\r\n"
				+ "        <CA_Tid>register</CA_Tid>\r\n"
				+ "        <CA_ID>KLU000000818283</CA_ID>\r\n"
				+ "        <CA_TA>KLU                    MUMBAI       MHIN</CA_TA>\r\n"
				+ "    </TransactionInfo>\r\n"
				+ "    <OtpRes txn=\"003184\" code=\"1d9ed512c9b741169104aaa68adce929\" ts=\"2022-01-21T11:11:36.690+05:30\" ret=\"y\"/>\r\n"
				+ "</OtpResponse>";
		
		
		System.out.println(npciResponseProcessing);
		
		
		//Send Request To pos
		result.setResult(npciResponseProcessing);
	}
	
	
	@Override
	@Async(value = "outReqBioAuth")
	public void npciRequestPreparations() {
		TransactionInfo transactionInfo = new TransactionInfo();
		transactionInfo.setPan("200131XXXX8713");
		transactionInfo.setProcCode("140000");
		transactionInfo.setTransDate("0121054136");
		transactionInfo.setStan("003184");
		transactionInfo.setLocalTranTime("111136");
		transactionInfo.setLocalDate("0121");
		transactionInfo.setMcc("6012");
		transactionInfo.setPosEntryMode("019");
		transactionInfo.setPosCode("05");
		transactionInfo.setAcqId("200131");
		transactionInfo.setRrn("202111003184");
		transactionInfo.setTid("register");
		transactionInfo.setMid("KLU000000818283");
		transactionInfo.setTerminalAddress("KLU                    MUMBAI       MHIN");

		// Create OtpReq object and set its properties
		OtpReq otpReq = new OtpReq();
		otpReq.setUid("XXXXXXXX8713");
		otpReq.setAc("STGKMLICL1");
		otpReq.setSa("STGKMLICL1");
		otpReq.setVer("2.5");
		otpReq.setTxn("003184");
		otpReq.setLk("XXXXXX");
		otpReq.setType("A");

		// Create OtpRequest object and set its properties
		OtpRequest otpRequest = new OtpRequest();
		otpRequest.setTransactionInfo(transactionInfo);
		otpRequest.setOtpReq(otpReq);

		// Convert Java objects to JSON string
		XmlMapper objectMapper = new XmlMapper();
		try {
			String json = objectMapper.writeValueAsString(otpRequest);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
