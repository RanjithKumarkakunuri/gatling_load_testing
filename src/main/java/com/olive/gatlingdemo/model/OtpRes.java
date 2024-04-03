package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
//import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlAccessorType;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import javax.xml.datatype.XMLGregorianCalendar;

@JacksonXmlRootElement(localName = "OtpRes")
//@JacksonXmlAccessorType(JacksonXmlAccessType.FIELD)
public class OtpRes {

    @JacksonXmlProperty(localName = "responsemsg", isAttribute = true)
    protected String responseMsg;

    @JacksonXmlProperty(localName = "responsecode", isAttribute = true)
    protected String responseCode;

    @JacksonXmlProperty(isAttribute = true)
    protected String txn;

    @JacksonXmlProperty(isAttribute = true)
    protected String err;

    @JacksonXmlProperty(isAttribute = true)
    protected String code;

    @JacksonXmlProperty(isAttribute = true)
    protected XMLGregorianCalendar ts;

    @JacksonXmlProperty(isAttribute = true)
    protected String ret;

    public String getTxn() {
        return txn;
    }

    public void setTxn(String txn) {
        this.txn = txn;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public XMLGregorianCalendar getTs() {
        return ts;
    }

    public void setTs(XMLGregorianCalendar ts) {
        this.ts = ts;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
