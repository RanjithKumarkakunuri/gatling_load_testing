package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

@JacksonXmlRootElement(localName = "TransactionInfo")
public class ResponseTransactionInfo implements Serializable {

    private static final long serialVersionUID = 8563018136022269084L;

    @JacksonXmlProperty(localName = "Pan")
    protected String pan;

    @JacksonXmlProperty(localName = "Proc_Code")
    protected String procCode;

    @JacksonXmlProperty(localName = "Transm_Date_time")
    protected String transDate;

    @JacksonXmlProperty(localName = "Stan")
    protected String stan;

    @JacksonXmlProperty(localName = "Local_Trans_Time")
    protected String localTranTime;

    @JacksonXmlProperty(localName = "Local_date")
    protected String localDate;

    @JacksonXmlProperty(localName = "AcqId")
    protected String acqId;

    @JacksonXmlProperty(localName = "RRN")
    protected String rrn;

    @JacksonXmlProperty(localName = "CA_Tid")
    protected String tid;

    @JacksonXmlProperty(localName = "CA_ID")
    protected String mid;

    @JacksonXmlProperty(localName = "CA_TA")
    protected String terminalAddress;

    @JacksonXmlProperty(localName = "ResponseCode")
    protected String responseCode;

    @JacksonXmlProperty(localName = "ResponseMsg")
    protected String responseMsg;

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getProcCode() {
		return procCode;
	}

	public void setProcCode(String procCode) {
		this.procCode = procCode;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

	public String getLocalTranTime() {
		return localTranTime;
	}

	public void setLocalTranTime(String localTranTime) {
		this.localTranTime = localTranTime;
	}

	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	public String getAcqId() {
		return acqId;
	}

	public void setAcqId(String acqId) {
		this.acqId = acqId;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getTerminalAddress() {
		return terminalAddress;
	}

	public void setTerminalAddress(String terminalAddress) {
		this.terminalAddress = terminalAddress;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
    
    
    

}
