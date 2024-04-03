package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "OtpRequest")
public class OtpRequest {

    @JacksonXmlProperty(localName = "TransactionInfo")
    protected TransactionInfo transactionInfo;

    @JacksonXmlProperty(localName = "Otp")
    protected OtpReq otpReq;

    // Base64Encoded payLoad
    @JacksonXmlProperty(localName = "Rad")
    protected byte[] rad;

    // Getters and setters
    public TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(TransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public OtpReq getOtpReq() {
        return otpReq;
    }

    public void setOtpReq(OtpReq otpReq) {
        this.otpReq = otpReq;
    }

    public byte[] getRad() {
        return rad;
    }

    public void setRad(byte[] rad) {
        this.rad = rad;
    }
}
