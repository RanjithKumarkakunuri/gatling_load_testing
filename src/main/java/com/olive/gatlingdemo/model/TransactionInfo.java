package com.olive.gatlingdemo.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

@JacksonXmlRootElement(localName = "TransactionInfo")
@JsonPropertyOrder({"pan", "procCode", "transDate", "stan", "localTranTime", "localDate", "mcc", "acqId", "posEntryMode", "posCode",
        "rrn", "switchrrn", "tid", "mid", "terminalAddress", "vendorCode", "txnType", "consent", "checksum", "sourceIp", "beneAadhaar",
        "responseCode", "responseMsg", "custBalance", "uidAuthCode", "amount", "lot", "lov", "apc", "apa", "agentID"})
public class TransactionInfo implements Serializable {

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

    @JacksonXmlProperty(localName = "Mcc")
    protected String mcc;

    @JacksonXmlProperty(localName = "AcqId")
    protected String acqId;

    @JacksonXmlProperty(localName = "Pos_entry_mode")
    protected String posEntryMode;

    @JacksonXmlProperty(localName = "Pos_code")
    protected String posCode;

    @JacksonXmlProperty(localName = "RRN")
    protected String rrn;

    @JacksonXmlProperty(localName = "Switch_RRN")
    protected String switchrrn;

    @JacksonXmlProperty(localName = "CA_Tid")
    protected String tid;

    @JacksonXmlProperty(localName = "CA_ID")
    protected String mid;

    @JacksonXmlProperty(localName = "CA_TA")
    protected String terminalAddress;

    @JacksonXmlProperty(localName = "Vendor_Code")
    protected String vendorCode;

    @JacksonXmlProperty(localName = "Txn_Type")
    protected String txnType;

    @JacksonXmlProperty(localName = "Consent")
    protected String consent;

    @JacksonXmlProperty(localName = "Checksum")
    protected String checksum;

    @JacksonXmlProperty(localName = "Source_IP")
    protected String sourceIp;

    @JacksonXmlProperty(localName = "Bene_Aadhaar")
    protected String beneAadhaar;

    @JacksonXmlProperty(localName = "ResponseCode")
    protected String responseCode;

    @JacksonXmlProperty(localName = "ResponseMsg")
    protected String responseMsg;

    @JacksonXmlProperty(localName = "Customer_Balance")
    protected String custBalance;

    @JacksonXmlProperty(localName = "UIDAI_AuthCode")
    protected String uidAuthCode;

    @JacksonXmlProperty(localName = "Amount")
    protected String amount;

    @JacksonXmlProperty(localName = "lot")
    protected String lot;

    @JacksonXmlProperty(localName = "lov")
    protected String lov;

    @JacksonXmlProperty(localName = "apa")
    protected String apa;

    @JacksonXmlProperty(localName = "apc")
    protected String apc;

    @JacksonXmlProperty(localName = "AGENT_ID")
    protected String agentID;

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

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getAcqId() {
		return acqId;
	}

	public void setAcqId(String acqId) {
		this.acqId = acqId;
	}

	public String getPosEntryMode() {
		return posEntryMode;
	}

	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}

	public String getPosCode() {
		return posCode;
	}

	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	public String getSwitchrrn() {
		return switchrrn;
	}

	public void setSwitchrrn(String switchrrn) {
		this.switchrrn = switchrrn;
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

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public String getConsent() {
		return consent;
	}

	public void setConsent(String consent) {
		this.consent = consent;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getBeneAadhaar() {
		return beneAadhaar;
	}

	public void setBeneAadhaar(String beneAadhaar) {
		this.beneAadhaar = beneAadhaar;
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

	public String getCustBalance() {
		return custBalance;
	}

	public void setCustBalance(String custBalance) {
		this.custBalance = custBalance;
	}

	public String getUidAuthCode() {
		return uidAuthCode;
	}

	public void setUidAuthCode(String uidAuthCode) {
		this.uidAuthCode = uidAuthCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getLov() {
		return lov;
	}

	public void setLov(String lov) {
		this.lov = lov;
	}

	public String getApa() {
		return apa;
	}

	public void setApa(String apa) {
		this.apa = apa;
	}

	public String getApc() {
		return apc;
	}

	public void setApc(String apc) {
		this.apc = apc;
	}

	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

   
}
