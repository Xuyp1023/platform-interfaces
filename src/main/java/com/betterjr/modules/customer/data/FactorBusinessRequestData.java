package com.betterjr.modules.customer.data;

import java.io.Serializable;
/***
 * 保理业务申请数据
 * @author hubl
 *
 */
public class FactorBusinessRequestData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5031722144428932905L;

    private Long custNo;
    private String custName;
    private String identNo;
    private String identType;
    private String lawName;
    private String operName;
    private String operIdentNo;
    private String operIdentType;
    private String phone;
    private String mobileNo;
    private String email;
    private String address;
    private String zipCode;
    private String orgCode;
    private String taxCode;
    private String bankAccount;
    private String bankName;
    private String bankAccountName;
    private String fax;
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
    public String getIdentNo() {
        return this.identNo;
    }
    public void setIdentNo(String anIdentNo) {
        this.identNo = anIdentNo;
    }
    public String getIdentType() {
        return this.identType;
    }
    public void setIdentType(String anIdentType) {
        this.identType = anIdentType;
    }
    public String getLawName() {
        return this.lawName;
    }
    public void setLawName(String anLawName) {
        this.lawName = anLawName;
    }
    public String getOperName() {
        return this.operName;
    }
    public void setOperName(String anOperName) {
        this.operName = anOperName;
    }
    public String getOperIdentNo() {
        return this.operIdentNo;
    }
    public void setOperIdentNo(String anOperIdentNo) {
        this.operIdentNo = anOperIdentNo;
    }
    public String getOperIdentType() {
        return this.operIdentType;
    }
    public void setOperIdentType(String anOperIdentType) {
        this.operIdentType = anOperIdentType;
    }
    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String anPhone) {
        this.phone = anPhone;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }
    public void setMobileNo(String anMobileNo) {
        this.mobileNo = anMobileNo;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String anEmail) {
        this.email = anEmail;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String anAddress) {
        this.address = anAddress;
    }
    public String getZipCode() {
        return this.zipCode;
    }
    public void setZipCode(String anZipCode) {
        this.zipCode = anZipCode;
    }
    
    public String getOrgCode() {
        return this.orgCode;
    }
    public void setOrgCode(String anOrgCode) {
        this.orgCode = anOrgCode;
    }
    
    public String getTaxCode() {
        return this.taxCode;
    }
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }
    public void setBankAccount(String anBankAccount) {
        this.bankAccount = anBankAccount;
    }
    public String getBankName() {
        return this.bankName;
    }
    public void setBankName(String anBankName) {
        this.bankName = anBankName;
    }
    public String getBankAccountName() {
        return this.bankAccountName;
    }
    public void setBankAccountName(String anBankAccountName) {
        this.bankAccountName = anBankAccountName;
    }
    public String getFax() {
        return this.fax;
    }
    public void setFax(String anFax) {
        this.fax = anFax;
    }
    
    
    public FactorBusinessRequestData(){
        
    }
    
}
