package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/*
  <OtpReq uid="962530121967" tid="23323" ac="1222" sa="122" ver="1.0" txn="auth:123" lk="licenseKey"> 
    <Opts ch="00"/> 
    <Signature>Digital signature of AUA</Signature>
  </OtpReq> 
 */
@JacksonXmlRootElement(localName = "OtpRequest")
public class PostOTP {
    @JacksonXmlProperty(localName = "uid")
    protected String uid;

    @JacksonXmlProperty(localName = "type")
    protected String type;

    @JacksonXmlProperty(localName = "channel")
    protected String channel;

    // Getters and setters
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
