package com.olive.gatlingdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ReqPay {
	
	String txnId;
	String beneAcct;
	String remiAcct;
	
	

}
