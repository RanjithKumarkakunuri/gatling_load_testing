package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "OtpRes")
public class OtpResp {

    @JacksonXmlProperty(localName = "Responsecode")
    protected String responsecode;

    @JacksonXmlProperty(localName = "Responsemsg")
    protected String responsemsg;

    @JacksonXmlProperty(localName = "ret")
    protected String ret;

    @JacksonXmlProperty(localName = "status")
    protected String status;

    @JacksonXmlProperty(localName = "code")
    protected String code;

    @JacksonXmlProperty(localName = "txn")
    protected String txn;

    @JacksonXmlProperty(localName = "err")
    protected String err;

    // Getters and setters
    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(String responsecode) {
        this.responsecode = responsecode;
    }

    public String getResponsemsg() {
        return responsemsg;
    }

    public void setResponsemsg(String responsemsg) {
        this.responsemsg = responsemsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }
}
