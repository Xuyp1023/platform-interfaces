package com.betterjr.modules.customer.data;

import java.io.Serializable;

public class CustRelationData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 25920040279443753L;

    private Long id;
    private Long custNo;
    private String custName;
    private String bankAcco;
    private String bankAccoName;
    private String custType;
    private String btNo;
    private String corpId;
    private Long relateCustno;
    private String relateCustname;
    private String relateType;
    private Long operId;
    private String operName;
    private Long regOperId;
    private String regOperName;
    private String regDate;
    private String regTime;
    private Long modiOperId;
    private String modiOperName;
    private String modiDate;
    private String modiTime;
    private String operOrg;
    private String businStatus;
    private String lastStatus;
    public Long getId() {
        return this.id;
    }
    public void setId(Long anId) {
        this.id = anId;
    }
    public Long getCustNo() {
        return this.custNo;
    }
    public void setCustNo(Long anCustNo) {
        this.custNo = anCustNo;
    }
    public String getCustName() {
        return this.custName;
    }
    public void setCustName(String anCustName) {
        this.custName = anCustName;
    }
    public String getBankAcco() {
        return this.bankAcco;
    }
    public void setBankAcco(String anBankAcco) {
        this.bankAcco = anBankAcco;
    }
    public String getBankAccoName() {
        return this.bankAccoName;
    }
    public void setBankAccoName(String anBankAccoName) {
        this.bankAccoName = anBankAccoName;
    }
    public String getCustType() {
        return this.custType;
    }
    public void setCustType(String anCustType) {
        this.custType = anCustType;
    }
    public String getBtNo() {
        return this.btNo;
    }
    public void setBtNo(String anBtNo) {
        this.btNo = anBtNo;
    }
    public String getCorpId() {
        return this.corpId;
    }
    public void setCorpId(String anCorpId) {
        this.corpId = anCorpId;
    }
    public Long getRelateCustno() {
        return this.relateCustno;
    }
    public void setRelateCustno(Long anRelateCustno) {
        this.relateCustno = anRelateCustno;
    }
    public String getRelateCustname() {
        return this.relateCustname;
    }
    public void setRelateCustname(String anRelateCustname) {
        this.relateCustname = anRelateCustname;
    }
    public String getRelateType() {
        return this.relateType;
    }
    public void setRelateType(String anRelateType) {
        this.relateType = anRelateType;
    }
    public Long getOperId() {
        return this.operId;
    }
    public void setOperId(Long anOperId) {
        this.operId = anOperId;
    }
    public String getOperName() {
        return this.operName;
    }
    public void setOperName(String anOperName) {
        this.operName = anOperName;
    }
    public Long getRegOperId() {
        return this.regOperId;
    }
    public void setRegOperId(Long anRegOperId) {
        this.regOperId = anRegOperId;
    }
    public String getRegOperName() {
        return this.regOperName;
    }
    public void setRegOperName(String anRegOperName) {
        this.regOperName = anRegOperName;
    }
    public String getRegDate() {
        return this.regDate;
    }
    public void setRegDate(String anRegDate) {
        this.regDate = anRegDate;
    }
    public String getRegTime() {
        return this.regTime;
    }
    public void setRegTime(String anRegTime) {
        this.regTime = anRegTime;
    }
    public Long getModiOperId() {
        return this.modiOperId;
    }
    public void setModiOperId(Long anModiOperId) {
        this.modiOperId = anModiOperId;
    }
    public String getModiOperName() {
        return this.modiOperName;
    }
    public void setModiOperName(String anModiOperName) {
        this.modiOperName = anModiOperName;
    }
    public String getModiDate() {
        return this.modiDate;
    }
    public void setModiDate(String anModiDate) {
        this.modiDate = anModiDate;
    }
    public String getModiTime() {
        return this.modiTime;
    }
    public void setModiTime(String anModiTime) {
        this.modiTime = anModiTime;
    }
    public String getOperOrg() {
        return this.operOrg;
    }
    public void setOperOrg(String anOperOrg) {
        this.operOrg = anOperOrg;
    }
    public String getBusinStatus() {
        return this.businStatus;
    }
    public void setBusinStatus(String anBusinStatus) {
        this.businStatus = anBusinStatus;
    }
    public String getLastStatus() {
        return this.lastStatus;
    }
    public void setLastStatus(String anLastStatus) {
        this.lastStatus = anLastStatus;
    }
}
