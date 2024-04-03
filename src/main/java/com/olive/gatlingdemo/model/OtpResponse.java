package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "OtpResponse")
public class OtpResponse {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "TransactionInfo")
    protected ResponseTransactionInfo transactionInfo;

    @JacksonXmlProperty(localName = "OtpRes")
    protected OtpRes otpRes;

    public ResponseTransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(ResponseTransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public OtpRes getOtpRes() {
        return otpRes;
    }

    public void setOtpRes(OtpRes otpRes) {
        this.otpRes = otpRes;
    }
}
