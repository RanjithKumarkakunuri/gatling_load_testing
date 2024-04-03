package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "OtpReq")
public class OtpReq {

    @JacksonXmlProperty(isAttribute = true)
    protected String uid;

    @JacksonXmlProperty(isAttribute = true)
    protected String tid;

    @JacksonXmlProperty(isAttribute = true)
    protected String ac;

    @JacksonXmlProperty(isAttribute = true)
    protected String sa;

    @JacksonXmlProperty(isAttribute = true)
    protected String ver;

    @JacksonXmlProperty(isAttribute = true)
    protected String txn;

    @JacksonXmlProperty(isAttribute = true)
    protected String lk;

    @JacksonXmlProperty(isAttribute = true)
    protected String ts;

    @JacksonXmlProperty(isAttribute = true)
    protected String type;

    @JacksonXmlProperty(localName = "Opts")
    protected OtpChannel channel;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getTxn() {
		return txn;
	}

	public void setTxn(String txn) {
		this.txn = txn;
	}

	public String getLk() {
		return lk;
	}

	public void setLk(String lk) {
		this.lk = lk;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OtpChannel getChannel() {
		return channel;
	}

	public void setChannel(OtpChannel channel) {
		this.channel = channel;
	}

    
}
