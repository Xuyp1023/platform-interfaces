package com.betterjr.modules.customer.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.mapper.CustDateJsonSerializer;
import com.betterjr.common.mapper.CustTimeJsonSerializer;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.utils.BetterDateUtils;
import com.betterjr.common.utils.UserUtils;
import com.betterjr.modules.customer.data.ICustAuditEntityFace;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_open_account_tmp")
public class CustOpenAccountTmp implements BetterjrEntity, ICustAuditEntityFace {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    @MetaData(value = "编号", comments = "编号")
    private Long id;

    /**
     * 代录记录 编号
     */
    @Column(name = "L_PARENTID", columnDefinition = "INTEGER")
    @MetaData(value = "代录记录 编号", comments = "代录记录 编号")
    private Long parentId;

    /**
     * 申请日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_APPLY_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "申请日期", comments = "申请日期")
    private String applyDate;

    /**
     * 申请时间
     */
    @Column(name = "T_APPLY_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "申请时间", comments = "申请时间")
    private String applyTime;

    /**
     * 审核日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_AUDIT_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "审核日期", comments = "审核日期")
    private String auditDate;

    /**
     * 审核时间
     */
    @Column(name = "T_AUDIT_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "审核时间", comments = "审核时间")
    private String auditTime;

    /**
     * 客户编号
     */
    @Column(name = "L_CUSTNO", columnDefinition = "INTEGER")
    @MetaData(value = "客户编号", comments = "客户编号")
    private Long custNo;

    /**
     * 客户名称
     */
    @Column(name = "C_CUSTNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "客户名称", comments = "客户名称")
    private String custName;

    /**
     * 证件号码
     */
    @Column(name = "C_IDENTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "证件号码", comments = "证件号码")
    private String identNo;

    /**
     * 证件类型
     */
    @Column(name = "C_IDENTTYPE", columnDefinition = "CHAR")
    @MetaData(value = "证件类型", comments = "证件类型")
    private String identType;

    /**
     * 证件有效期
     */
    @Column(name = "D_VALIDDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "证件有效期", comments = "证件有效期")
    private String validDate;

    /**
     * 营业执照号码
     */
    @Column(name = "C_BUSIN_LICENCE", columnDefinition = "VARCHAR")
    @MetaData(value = "营业执照号码", comments = "营业执照号码")
    private String businLicence;

    /**
     * 营业执照登记日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_BUSIN_LICENCE_REGDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "营业执照登记日期", comments = "营业执照登记日期")
    private String businLicenceRegDate;

    /**
     * 营业执照截止日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_BUSIN_LICENCE_VALIDDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "营业执照截止日期", comments = "营业执照截止日期")
    private String businLicenceValidDate;

    /**
     * 地址
     */
    @Column(name = "C_ADDRESS", columnDefinition = "VARCHAR")
    @MetaData(value = "地址", comments = "地址")
    private String address;

    /**
     * 邮编
     */
    @Column(name = "C_ZIPCODE", columnDefinition = "VARCHAR")
    @MetaData(value = "邮编", comments = "邮编")
    private String zipCode;

    /**
     * 电话
     */
    @Column(name = "C_PHONE", columnDefinition = "VARCHAR")
    @MetaData(value = "电话", comments = "电话")
    private String phone;

    /**
     * 传真号码
     */
    @Column(name = "C_FAX", columnDefinition = "VARCHAR")
    @MetaData(value = "传真号码", comments = "传真号码")
    private String fax;

    /**
     * 电子邮件
     */
    @Column(name = "C_EMAIL", columnDefinition = "VARCHAR")
    @MetaData(value = "电子邮件", comments = "电子邮件")
    private String email;

    /**
     * 银行账户
     */
    @Column(name = "C_BANK_ACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "银行账户", comments = "银行账户")
    private String bankAcco;

    /**
     * 银行户名
     */
    @Column(name = "C_BANK_ACCONAME", columnDefinition = "VARCHAR")
    @MetaData(value = "银行户名", comments = "银行户名")
    private String bankAccoName;

    /**
     * 银行编码
     */
    @Column(name = "C_BANK_NO", columnDefinition = "VARCHAR")
    @MetaData(value = "银行编码", comments = "银行编码")
    private String bankNo;

    /**
     * 银行城市地区代码
     */
    @Column(name = "C_BANK_CITYNO", columnDefinition = "VARCHAR")
    @MetaData(value = "银行城市地区代码", comments = "银行城市地区代码")
    private String bankCityno;

    /**
     * 开户银行(全称)
     */
    @Column(name = "C_BANK_NAME", columnDefinition = "VARCHAR")
    @MetaData(value = "开户银行(全称)", comments = "开户银行(全称)")
    private String bankName;

    /**
     * 经办人姓名
     */
    @Column(name = "C_OPERNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人姓名", comments = "经办人姓名")
    private String operName;

    /**
     * 经办人证件类型
     */
    @Column(name = "C_OPER_IDENTTYPE", columnDefinition = "CHAR")
    @MetaData(value = "经办人证件类型", comments = "经办人证件类型")
    private String operIdenttype;

    /**
     * 经办人其他证件类型
     */
    @Column(name = "C_OPER_OTHER_IDENTTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人证件类型", comments = "经办人证件类型")
    private String operOtherIdenttype;

    /**
     * 经办人证件号码
     */
    @Column(name = "C_OPER_IDENTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人证件号码", comments = "经办人证件号码")
    private String operIdentno;

    /**
     * 经办人证件有效期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_OPER_VALIDDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人证件有效期", comments = "经办人证件有效期")
    private String operValiddate;

    /**
     * 经办人手机号码
     */
    @Column(name = "C_OPER_MOBILE", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人手机号码", comments = "经办人手机号码")
    private String operMobile;

    /**
     * 经办人邮箱
     */
    @Column(name = "C_OPER_EMAIL", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人邮箱", comments = "经办人邮箱")
    private String operEmail;

    /**
     * 经办人联系电话
     */
    @Column(name = "C_OPER_PHONE", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人联系电话", comments = "经办人联系电话")
    private String operPhone;

    /**
     * 经办人传真号码
     */
    @Column(name = "C_OPER_FAX_NO", columnDefinition = "VARCHAR")
    @MetaData(value = "经办人传真号码", comments = "经办人传真号码")
    private String operFaxNo;

    /**
     * 法人姓名
     */
    @Column(name = "C_LAW_NAME", columnDefinition = "VARCHAR")
    @MetaData(value = "法人姓名", comments = "法人姓名")
    private String lawName;

    /**
     * 法人证件类型
     */
    @Column(name = "C_LAW_IDENTTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "法人证件类型", comments = "法人证件类型")
    private String lawIdentType;

    /**
     * 法人其他证件类型
     */
    @Column(name = "C_LAW_OTHER_IDENTTYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "法人其他证件类型", comments = "法人其他证件类型")
    private String lawOtherIdentType;

    /**
     * 法人证件号码
     */
    @Column(name = "C_LAW_IDENTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "法人证件号码", comments = "法人证件号码")
    private String lawIdentNo;

    /**
     * 法人证件有限期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_LAW_VALIDDATE", columnDefinition = "VARCHAR")
    @MetaData(value = "法人证件有限期", comments = "法人证件有限期")
    private String lawValidDate;

    /**
     * 附件
     */
    @Column(name = "N_BATCHNO", columnDefinition = "INTEGER")
    @MetaData(value = "附件", comments = "附件")
    private Long batchNo;

    /**
     * 创建人(操作员)ID号
     */
    @JsonIgnore
    @Column(name = "L_REG_OPERID", columnDefinition = "INTEGER")
    @MetaData(value = "创建人(操作员)ID号", comments = "创建人(操作员)ID号")
    private Long regOperId;

    /**
     * 创建人(操作员)姓名
     */
    @JsonIgnore
    @Column(name = "C_REG_OPERNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "创建人(操作员)姓名", comments = "创建人(操作员)姓名")
    private String regOperName;

    /**
     * 创建日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_REG_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "创建日期", comments = "创建日期")
    private String regDate;

    /**
     * 创建时间
     */
    @JsonSerialize(using = CustTimeJsonSerializer.class)
    @Column(name = "T_REG_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "创建时间", comments = "创建时间")
    private String regTime;

    /**
     * 税务登记证号
     */
    @Column(name = "C_TAX_NO", columnDefinition = "VARCHAR")
    @MetaData(value = "税务登记证号", comments = "税务登记证号")
    private String taxNo;

    /**
     * 修改人(操作员)ID号
     */
    @JsonIgnore
    @Column(name = "L_MODI_OPERID", columnDefinition = "INTEGER")
    @MetaData(value = "修改人(操作员)ID号", comments = "修改人(操作员)ID号")
    private Long modiOperId;

    /**
     * 修改人(操作员)姓名
     */
    @JsonIgnore
    @Column(name = "C_MODI_OPERNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "修改人(操作员)姓名", comments = "修改人(操作员)姓名")
    private String modiOperName;

    /**
     * 修改日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_MODI_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "修改日期", comments = "修改日期")
    private String modiDate;

    /**
     * 修改时间
     */
    @JsonSerialize(using = CustTimeJsonSerializer.class)
    @Column(name = "T_MODI_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "修改时间", comments = "修改时间")
    private String modiTime;

    /**
     * 使用状态:0未使用 1使用中 2已使用
     */
    @Column(name = "C_BUSIN_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "使用状态:0未使用  1使用中  2已使用", comments = "使用状态:0未使用  1使用中  2已使用 3驳回4自主开户")
    private String businStatus;

    @Column(name = "C_LAST_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "", comments = "")
    private String lastStatus;

    /**
     * 操作机构
     */
    @JsonIgnore
    @Column(name = "C_OPERORG", columnDefinition = "VARCHAR")
    @MetaData(value = "操作机构", comments = "操作机构")
    private String operOrg;

    /**
     * 流水类型:0 代录 2 自己暂存 4 代录暂存
     */
    @Column(name = "C_TMP_TYPE", columnDefinition = "CHAR")
    @MetaData(value = "流水类型:", comments = "流水类型:0 代录   2 自己暂存 4 代录暂存")
    private String tmpType;

    /**
     * 流水操作类型:0 新增 1 修改 2 删除
     */
    @Column(name = "C_TMP_OPER_TYPE", columnDefinition = "CHAR")
    @MetaData(value = "流水操作类型:0 新增  1 修改  2 删除", comments = "流水操作类型:0 新增  1 修改  2 删除")
    private String tmpOperType;

    /**
     * 组织机构代码证
     */
    @Column(name = "C_ORG_CODE", columnDefinition = "VARCHAR")
    @MetaData(value = "组织机构代码证", comments = "组织机构代码证")
    private String orgCode;

    /**
     * 核心企业列表
     */
    @Column(name = "C_CORELIST", columnDefinition = "VARCHAR")
    @MetaData(value = "核心企业列表", comments = "核心企业列表")
    private String coreList;

    /**
     * 开户许可证核准号
     */
    @Column(name = "C_OPEN_LICENSE", columnDefinition = "VARCHAR")
    @MetaData(value = "开户许可证核准号", comments = "开户许可证核准号")
    private String openLicense;

    /**
     * 微信用户标识
     */
    @Column(name = "C_WECHAT_OPENID", columnDefinition = "VARCHAR")
    @MetaData(value = "微信用户标识", comments = "微信用户标识")
    @JsonIgnore
    private String wechatOpenId;

    /**
     * 交易密码(仅微信有)
     */
    @Column(name = "C_DEAL_PASSWORD", columnDefinition = "VARCHAR")
    @MetaData(value = "交易密码(仅微信有)", comments = "交易密码(仅微信有)")
    @JsonIgnore
    private String dealPassword;

    /**
     * 角色：供应商、经销商
     */
    @Column(name = "C_ROLE", columnDefinition = "VARCHAR")
    @MetaData(value = "角色：供应商、经销商", comments = "角色：供应商、经销商")
    private String role;

    /**
     * 数据来源:0:PC自主开户,1:PC平台代录,2:微信平台代录
     */
    @Column(name = "C_DATA_SOURCE", columnDefinition = "VARCHAR")
    @MetaData(value = "数据来源:0:PC自主开户,1:PC平台代录,2:微信平台代录", comments = "数据来源:0:PC自主开户,1:PC平台代录,2:微信平台代录")
    private String dataSource;

    /**
     * 激活日期
     */
    @JsonSerialize(using = CustDateJsonSerializer.class)
    @Column(name = "D_ACTIVE_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "激活日期", comments = "激活日期")
    private String activeDate;

    /**
     * 激活时间
     */
    @JsonSerialize(using = CustTimeJsonSerializer.class)
    @Column(name = "T_ACTIVE_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "激活时间", comments = "激活时间")
    private String activeTime;

    /**
     * 交易密码加密salt(仅微信有)
     */
    @Column(name = "C_DEAL_PASSWORD_SALT", columnDefinition = "VARCHAR")
    @MetaData(value = "交易密码加密salt(仅微信有)", comments = "交易密码加密salt(仅微信有)")
    @JsonIgnore
    private String dealPasswordSalt;

    /**
     * 用户登录名(仅微信有)
     */
    @Column(name = "C_LOGIN_USERNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "用户登录名(仅微信有)", comments = "用户登录名(仅微信有)")
    @JsonIgnore
    private String loginUserName;

    /**
     * 登录密码加密(仅微信有)
     */
    @Column(name = "C_LOGIN_PASSWORD", columnDefinition = "VARCHAR")
    @MetaData(value = "登录密码(仅微信有)", comments = "登录密码(仅微信有)")
    @JsonIgnore
    private String loginPassword;

    /**
     * 登录密码加密SALT(仅微信有)
     */
    @Column(name = "C_LOGIN_PASSWORD_SALT", columnDefinition = "VARCHAR")
    @MetaData(value = "登录密码加密SALT(仅微信有)", comments = "登录密码加密SALT(仅微信有)")
    @JsonIgnore
    private String loginPasswordSalt;

    @Column(name = "c_pay_sys_num", columnDefinition = "VARCHAR")
    @MetaData(value = "联行号", comments = "联行号")
    @JsonIgnore
    private String paySysNum;

    private static final long serialVersionUID = 1468812783872L;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Override
    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(final Long custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(final String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(final String identNo) {
        this.identNo = identNo == null ? null : identNo.trim();
    }

    public String getIdentType() {
        return identType;
    }

    public void setIdentType(final String identType) {
        this.identType = identType == null ? null : identType.trim();
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(final String validDate) {
        this.validDate = validDate == null ? null : validDate.trim();
    }

    public String getBusinLicence() {
        return businLicence;
    }

    public void setBusinLicence(final String businLicence) {
        this.businLicence = businLicence == null ? null : businLicence.trim();
    }

    public String getBusinLicenceRegDate() {
        return businLicenceRegDate;
    }

    public void setBusinLicenceRegDate(final String businLicenceRegDate) {
        this.businLicenceRegDate = businLicenceRegDate == null ? null : businLicenceRegDate.trim();
    }

    public String getBusinLicenceValidDate() {
        return businLicenceValidDate;
    }

    public void setBusinLicenceValidDate(final String businLicenceValidDate) {
        this.businLicenceValidDate = businLicenceValidDate == null ? null : businLicenceValidDate.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(final String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBankAcco() {
        return bankAcco;
    }

    public void setBankAcco(final String bankAcco) {
        this.bankAcco = bankAcco == null ? null : bankAcco.trim();
    }

    public String getBankAccoName() {
        return bankAccoName;
    }

    public void setBankAccoName(final String bankAccoName) {
        this.bankAccoName = bankAccoName == null ? null : bankAccoName.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(final String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getBankCityno() {
        return bankCityno;
    }

    public void setBankCityno(final String bankCityno) {
        this.bankCityno = bankCityno == null ? null : bankCityno.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(final String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(final String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperIdenttype() {
        return operIdenttype;
    }

    public void setOperIdenttype(final String operIdenttype) {
        this.operIdenttype = operIdenttype == null ? null : operIdenttype.trim();
    }

    public String getOperIdentno() {
        return operIdentno;
    }

    public void setOperIdentno(final String operIdentno) {
        this.operIdentno = operIdentno == null ? null : operIdentno.trim();
    }

    public String getOperValiddate() {
        return operValiddate;
    }

    public void setOperValiddate(final String operValiddate) {
        this.operValiddate = operValiddate == null ? null : operValiddate.trim();
    }

    public String getOperMobile() {
        return operMobile;
    }

    public void setOperMobile(final String operMobile) {
        this.operMobile = operMobile == null ? null : operMobile.trim();
    }

    public String getOperEmail() {
        return operEmail;
    }

    public void setOperEmail(final String operEmail) {
        this.operEmail = operEmail == null ? null : operEmail.trim();
    }

    public String getOperPhone() {
        return operPhone;
    }

    public void setOperPhone(final String operPhone) {
        this.operPhone = operPhone == null ? null : operPhone.trim();
    }

    public String getOperFaxNo() {
        return operFaxNo;
    }

    public void setOperFaxNo(final String operFaxNo) {
        this.operFaxNo = operFaxNo == null ? null : operFaxNo.trim();
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(final String lawName) {
        this.lawName = lawName == null ? null : lawName.trim();
    }

    public String getLawIdentType() {
        return lawIdentType;
    }

    public void setLawIdentType(final String lawIdentType) {
        this.lawIdentType = lawIdentType == null ? null : lawIdentType.trim();
    }

    public String getLawIdentNo() {
        return lawIdentNo;
    }

    public void setLawIdentNo(final String lawIdentNo) {
        this.lawIdentNo = lawIdentNo == null ? null : lawIdentNo.trim();
    }

    public String getLawValidDate() {
        return lawValidDate;
    }

    public void setLawValidDate(final String lawValidDate) {
        this.lawValidDate = lawValidDate == null ? null : lawValidDate.trim();
    }

    @Override
    public Long getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(final Long batchNo) {
        this.batchNo = batchNo;
    }

    public Long getRegOperId() {
        return regOperId;
    }

    public void setRegOperId(final Long regOperId) {
        this.regOperId = regOperId;
    }

    public String getRegOperName() {
        return regOperName;
    }

    public void setRegOperName(final String regOperName) {
        this.regOperName = regOperName == null ? null : regOperName.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(final String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(final String regTime) {
        this.regTime = regTime == null ? null : regTime.trim();
    }

    public Long getModiOperId() {
        return modiOperId;
    }

    public void setModiOperId(final Long modiOperId) {
        this.modiOperId = modiOperId;
    }

    public String getModiOperName() {
        return modiOperName;
    }

    public void setModiOperName(final String modiOperName) {
        this.modiOperName = modiOperName == null ? null : modiOperName.trim();
    }

    public String getModiDate() {
        return modiDate;
    }

    public void setModiDate(final String modiDate) {
        this.modiDate = modiDate == null ? null : modiDate.trim();
    }

    public String getModiTime() {
        return modiTime;
    }

    public void setModiTime(final String modiTime) {
        this.modiTime = modiTime == null ? null : modiTime.trim();
    }

    public String getBusinStatus() {
        return businStatus;
    }

    public void setBusinStatus(final String businStatus) {
        this.businStatus = businStatus == null ? null : businStatus.trim();
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(final String lastStatus) {
        this.lastStatus = lastStatus == null ? null : lastStatus.trim();
    }

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(final String operOrg) {
        this.operOrg = operOrg == null ? null : operOrg.trim();
    }

    public String getTmpType() {
        return tmpType;
    }

    public void setTmpType(final String tmpType) {
        this.tmpType = tmpType == null ? null : tmpType.trim();
    }

    public String getTmpOperType() {
        return tmpOperType;
    }

    public void setTmpOperType(final String tmpOperType) {
        this.tmpOperType = tmpOperType == null ? null : tmpOperType.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(final String orgCode) {
        this.orgCode = orgCode;
    }

    @Override
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(final Long anParentId) {
        parentId = anParentId;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(final String anApplyDate) {
        applyDate = anApplyDate;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(final String anApplyTime) {
        applyTime = anApplyTime;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(final String anAuditDate) {
        auditDate = anAuditDate;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(final String anAuditTime) {
        auditTime = anAuditTime;
    }

    public String getCoreList() {
        return coreList;
    }

    public void setCoreList(final String coreList) {
        this.coreList = coreList;
    }

    public String getOpenLicense() {
        return this.openLicense;
    }

    public void setOpenLicense(final String anOpenLicense) {
        this.openLicense = anOpenLicense;
    }

    public String getTaxNo() {
        return this.taxNo;
    }

    public void setTaxNo(final String anTaxNo) {
        this.taxNo = anTaxNo;
    }

    public String getWechatOpenId() {
        return this.wechatOpenId;
    }

    public void setWechatOpenId(final String anWechatOpenId) {
        this.wechatOpenId = anWechatOpenId;
    }

    public String getDealPassword() {
        return this.dealPassword;
    }

    public void setDealPassword(final String anDealPassword) {
        this.dealPassword = anDealPassword;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(final String anRole) {
        this.role = anRole;
    }

    public String getOperOtherIdenttype() {
        return this.operOtherIdenttype;
    }

    public void setOperOtherIdenttype(final String anOperOtherIdenttype) {
        this.operOtherIdenttype = anOperOtherIdenttype;
    }

    public String getLawOtherIdentType() {
        return this.lawOtherIdentType;
    }

    public void setLawOtherIdentType(final String anLawOtherIdentType) {
        this.lawOtherIdentType = anLawOtherIdentType;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(final String anDataSource) {
        this.dataSource = anDataSource;
    }

    public String getActiveDate() {
        return this.activeDate;
    }

    public void setActiveDate(final String anActiveDate) {
        this.activeDate = anActiveDate;
    }

    public String getActiveTime() {
        return this.activeTime;
    }

    public void setActiveTime(final String anActiveTime) {
        this.activeTime = anActiveTime;
    }

    public String getDealPasswordSalt() {
        return this.dealPasswordSalt;
    }

    public void setDealPasswordSalt(final String anDealPasswordSalt) {
        this.dealPasswordSalt = anDealPasswordSalt;
    }

    public String getLoginUserName() {
        return this.loginUserName;
    }

    public void setLoginUserName(final String anLoginUserName) {
        this.loginUserName = anLoginUserName;
    }

    public String getLoginPassword() {
        return this.loginPassword;
    }

    public void setLoginPassword(final String anLoginPassword) {
        this.loginPassword = anLoginPassword;
    }

    public String getLoginPasswordSalt() {
        return this.loginPasswordSalt;
    }

    public void setLoginPasswordSalt(final String anLoginPasswordSalt) {
        this.loginPasswordSalt = anLoginPasswordSalt;
    }

    public String getPaySysNum() {
        return this.paySysNum;
    }

    public void setPaySysNum(final String anPaySysNum) {
        this.paySysNum = anPaySysNum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", auditDate=").append(auditDate);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", custNo=").append(custNo);
        sb.append(", custName=").append(custName);
        sb.append(", identNo=").append(identNo);
        sb.append(", identType=").append(identType);
        sb.append(", validDate=").append(validDate);
        sb.append(", businLicence=").append(businLicence);
        sb.append(", businLicenceRegDate=").append(businLicenceRegDate);
        sb.append(", businLicenceValidDate=").append(businLicenceValidDate);
        sb.append(", address=").append(address);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", email=").append(email);
        sb.append(", bankAcco=").append(bankAcco);
        sb.append(", bankAccoName=").append(bankAccoName);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", bankCityno=").append(bankCityno);
        sb.append(", bankName=").append(bankName);
        sb.append(", operName=").append(operName);
        sb.append(", operIdenttype=").append(operIdenttype);
        sb.append(", operIdentno=").append(operIdentno);
        sb.append(", operValiddate=").append(operValiddate);
        sb.append(", operMobile=").append(operMobile);
        sb.append(", operEmail=").append(operEmail);
        sb.append(", operPhone=").append(operPhone);
        sb.append(", operFaxNo=").append(operFaxNo);
        sb.append(", lawName=").append(lawName);
        sb.append(", lawIdentType=").append(lawIdentType);
        sb.append(", lawIdentNo=").append(lawIdentNo);
        sb.append(", lawValidDate=").append(lawValidDate);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", regOperId=").append(regOperId);
        sb.append(", regOperName=").append(regOperName);
        sb.append(", regDate=").append(regDate);
        sb.append(", regTime=").append(regTime);
        sb.append(", modiOperId=").append(modiOperId);
        sb.append(", modiOperName=").append(modiOperName);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", modiTime=").append(modiTime);
        sb.append(", businStatus=").append(businStatus);
        sb.append(", lastStatus=").append(lastStatus);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", tmpType=").append(tmpType);
        sb.append(", tmpOperType=").append(tmpOperType);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", coreList=").append(coreList);
        sb.append(", openLicense=").append(openLicense);
        sb.append(", taxNo=").append(taxNo);
        sb.append(", wechatOpenId=").append(wechatOpenId);
        sb.append(", dealPassword=").append(dealPassword);
        sb.append(", role=").append(role);
        sb.append(", dataSource=").append(dataSource);
        sb.append(", operOtherIdenttype=").append(operOtherIdenttype);
        sb.append(", lawOtherIdentType=").append(lawOtherIdentType);
        sb.append(", activeDate=").append(activeDate);
        sb.append(", activeTime=").append(activeTime);
        sb.append(", dealPasswordSalt=").append(dealPasswordSalt);
        sb.append(", loginUserName=").append(loginUserName);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", loginPasswordSalt=").append(loginPasswordSalt);
        sb.append(", paySysNum=").append(paySysNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        final CustOpenAccountTmp other = (CustOpenAccountTmp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getParentId() == null ? other.getParentId() == null
                        : this.getParentId().equals(other.getParentId()))
                && (this.getApplyDate() == null ? other.getApplyDate() == null
                        : this.getApplyDate().equals(other.getApplyDate()))
                && (this.getApplyTime() == null ? other.getApplyTime() == null
                        : this.getApplyTime().equals(other.getApplyTime()))
                && (this.getAuditDate() == null ? other.getAuditDate() == null
                        : this.getAuditDate().equals(other.getAuditDate()))
                && (this.getAuditTime() == null ? other.getAuditTime() == null
                        : this.getAuditTime().equals(other.getAuditTime()))
                && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
                && (this.getCustName() == null ? other.getCustName() == null
                        : this.getCustName().equals(other.getCustName()))
                && (this.getIdentNo() == null ? other.getIdentNo() == null
                        : this.getIdentNo().equals(other.getIdentNo()))
                && (this.getIdentType() == null ? other.getIdentType() == null
                        : this.getIdentType().equals(other.getIdentType()))
                && (this.getValidDate() == null ? other.getValidDate() == null
                        : this.getValidDate().equals(other.getValidDate()))
                && (this.getBusinLicence() == null ? other.getBusinLicence() == null
                        : this.getBusinLicence().equals(other.getBusinLicence()))
                && (this.getBusinLicenceRegDate() == null ? other.getBusinLicenceRegDate() == null
                        : this.getBusinLicenceRegDate().equals(other.getBusinLicenceRegDate()))
                && (this.getBusinLicenceValidDate() == null ? other.getBusinLicenceValidDate() == null
                        : this.getBusinLicenceValidDate().equals(other.getBusinLicenceValidDate()))
                && (this.getAddress() == null ? other.getAddress() == null
                        : this.getAddress().equals(other.getAddress()))
                && (this.getZipCode() == null ? other.getZipCode() == null
                        : this.getZipCode().equals(other.getZipCode()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getBankAcco() == null ? other.getBankAcco() == null
                        : this.getBankAcco().equals(other.getBankAcco()))
                && (this.getBankAccoName() == null ? other.getBankAccoName() == null
                        : this.getBankAccoName().equals(other.getBankAccoName()))
                && (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
                && (this.getBankCityno() == null ? other.getBankCityno() == null
                        : this.getBankCityno().equals(other.getBankCityno()))
                && (this.getBankName() == null ? other.getBankName() == null
                        : this.getBankName().equals(other.getBankName()))
                && (this.getOperName() == null ? other.getOperName() == null
                        : this.getOperName().equals(other.getOperName()))
                && (this.getOperIdenttype() == null ? other.getOperIdenttype() == null
                        : this.getOperIdenttype().equals(other.getOperIdenttype()))
                && (this.getOperIdentno() == null ? other.getOperIdentno() == null
                        : this.getOperIdentno().equals(other.getOperIdentno()))
                && (this.getOperValiddate() == null ? other.getOperValiddate() == null
                        : this.getOperValiddate().equals(other.getOperValiddate()))
                && (this.getOperMobile() == null ? other.getOperMobile() == null
                        : this.getOperMobile().equals(other.getOperMobile()))
                && (this.getOperEmail() == null ? other.getOperEmail() == null
                        : this.getOperEmail().equals(other.getOperEmail()))
                && (this.getOperPhone() == null ? other.getOperPhone() == null
                        : this.getOperPhone().equals(other.getOperPhone()))
                && (this.getOperFaxNo() == null ? other.getOperFaxNo() == null
                        : this.getOperFaxNo().equals(other.getOperFaxNo()))
                && (this.getLawName() == null ? other.getLawName() == null
                        : this.getLawName().equals(other.getLawName()))
                && (this.getLawIdentType() == null ? other.getLawIdentType() == null
                        : this.getLawIdentType().equals(other.getLawIdentType()))
                && (this.getLawIdentNo() == null ? other.getLawIdentNo() == null
                        : this.getLawIdentNo().equals(other.getLawIdentNo()))
                && (this.getLawValidDate() == null ? other.getLawValidDate() == null
                        : this.getLawValidDate().equals(other.getLawValidDate()))
                && (this.getBatchNo() == null ? other.getBatchNo() == null
                        : this.getBatchNo().equals(other.getBatchNo()))
                && (this.getRegOperId() == null ? other.getRegOperId() == null
                        : this.getRegOperId().equals(other.getRegOperId()))
                && (this.getRegOperName() == null ? other.getRegOperName() == null
                        : this.getRegOperName().equals(other.getRegOperName()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()))
                && (this.getRegTime() == null ? other.getRegTime() == null
                        : this.getRegTime().equals(other.getRegTime()))
                && (this.getModiOperId() == null ? other.getModiOperId() == null
                        : this.getModiOperId().equals(other.getModiOperId()))
                && (this.getModiOperName() == null ? other.getModiOperName() == null
                        : this.getModiOperName().equals(other.getModiOperName()))
                && (this.getModiDate() == null ? other.getModiDate() == null
                        : this.getModiDate().equals(other.getModiDate()))
                && (this.getModiTime() == null ? other.getModiTime() == null
                        : this.getModiTime().equals(other.getModiTime()))
                && (this.getBusinStatus() == null ? other.getBusinStatus() == null
                        : this.getBusinStatus().equals(other.getBusinStatus()))
                && (this.getLastStatus() == null ? other.getLastStatus() == null
                        : this.getLastStatus().equals(other.getLastStatus()))
                && (this.getOperOrg() == null ? other.getOperOrg() == null
                        : this.getOperOrg().equals(other.getOperOrg()))
                && (this.getTmpType() == null ? other.getTmpType() == null
                        : this.getTmpType().equals(other.getTmpType()))
                && (this.getTmpOperType() == null ? other.getTmpOperType() == null
                        : this.getTmpOperType().equals(other.getTmpOperType()))
                && (this.getOrgCode() == null ? other.getOrgCode() == null
                        : this.getOrgCode().equals(other.getOrgCode()))
                && (this.getOpenLicense() == null ? other.getOpenLicense() == null
                        : this.getOpenLicense().equals(other.getOpenLicense()))
                && (this.getTaxNo() == null ? other.getTaxNo() == null : this.getTaxNo().equals(other.getTaxNo()))
                && (this.getWechatOpenId() == null ? other.getWechatOpenId() == null
                        : this.getWechatOpenId().equals(other.getWechatOpenId()))
                && (this.getDealPassword() == null ? other.getDealPassword() == null
                        : this.getDealPassword().equals(other.getDealPassword()))
                && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
                && (this.getDataSource() == null ? other.getDataSource() == null
                        : this.getDataSource().equals(other.getDataSource()))
                && (this.getOperOtherIdenttype() == null ? other.getOperOtherIdenttype() == null
                        : this.getOperOtherIdenttype().equals(other.getOperOtherIdenttype()))
                && (this.getLawOtherIdentType() == null ? other.getLawOtherIdentType() == null
                        : this.getLawOtherIdentType().equals(other.getLawOtherIdentType()))
                && (this.getActiveDate() == null ? other.getActiveDate() == null
                        : this.getActiveDate().equals(other.getActiveDate()))
                && (this.getActiveTime() == null ? other.getActiveTime() == null
                        : this.getActiveTime().equals(other.getActiveTime()))
                && (this.getDealPasswordSalt() == null ? other.getDealPasswordSalt() == null
                        : this.getDealPasswordSalt().equals(other.getDealPasswordSalt()))
                && (this.getLoginUserName() == null ? other.getLoginUserName() == null
                        : this.getLoginUserName().equals(other.getLoginUserName()))
                && (this.getLoginPassword() == null ? other.getLoginPassword() == null
                        : this.getLoginPassword().equals(other.getLoginPassword()))
                && (this.getLoginPasswordSalt() == null ? other.getLoginPasswordSalt() == null
                        : this.getLoginPasswordSalt().equals(other.getLoginPasswordSalt()))
                && (this.getCoreList() == null ? other.getCoreList() == null
                        : this.getCoreList().equals(other.getCoreList()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getIdentNo() == null) ? 0 : getIdentNo().hashCode());
        result = prime * result + ((getIdentType() == null) ? 0 : getIdentType().hashCode());
        result = prime * result + ((getValidDate() == null) ? 0 : getValidDate().hashCode());
        result = prime * result + ((getBusinLicence() == null) ? 0 : getBusinLicence().hashCode());
        result = prime * result + ((getBusinLicenceRegDate() == null) ? 0 : getBusinLicenceRegDate().hashCode());
        result = prime * result + ((getBusinLicenceValidDate() == null) ? 0 : getBusinLicenceValidDate().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getBankAcco() == null) ? 0 : getBankAcco().hashCode());
        result = prime * result + ((getBankAccoName() == null) ? 0 : getBankAccoName().hashCode());
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getBankCityno() == null) ? 0 : getBankCityno().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getOperName() == null) ? 0 : getOperName().hashCode());
        result = prime * result + ((getOperIdenttype() == null) ? 0 : getOperIdenttype().hashCode());
        result = prime * result + ((getOperIdentno() == null) ? 0 : getOperIdentno().hashCode());
        result = prime * result + ((getOperValiddate() == null) ? 0 : getOperValiddate().hashCode());
        result = prime * result + ((getOperMobile() == null) ? 0 : getOperMobile().hashCode());
        result = prime * result + ((getOperEmail() == null) ? 0 : getOperEmail().hashCode());
        result = prime * result + ((getOperPhone() == null) ? 0 : getOperPhone().hashCode());
        result = prime * result + ((getOperFaxNo() == null) ? 0 : getOperFaxNo().hashCode());
        result = prime * result + ((getLawName() == null) ? 0 : getLawName().hashCode());
        result = prime * result + ((getLawIdentType() == null) ? 0 : getLawIdentType().hashCode());
        result = prime * result + ((getLawIdentNo() == null) ? 0 : getLawIdentNo().hashCode());
        result = prime * result + ((getLawValidDate() == null) ? 0 : getLawValidDate().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getRegOperId() == null) ? 0 : getRegOperId().hashCode());
        result = prime * result + ((getRegOperName() == null) ? 0 : getRegOperName().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getModiOperId() == null) ? 0 : getModiOperId().hashCode());
        result = prime * result + ((getModiOperName() == null) ? 0 : getModiOperName().hashCode());
        result = prime * result + ((getModiDate() == null) ? 0 : getModiDate().hashCode());
        result = prime * result + ((getModiTime() == null) ? 0 : getModiTime().hashCode());
        result = prime * result + ((getBusinStatus() == null) ? 0 : getBusinStatus().hashCode());
        result = prime * result + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getTmpType() == null) ? 0 : getTmpType().hashCode());
        result = prime * result + ((getTmpOperType() == null) ? 0 : getTmpOperType().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getOpenLicense() == null) ? 0 : getOpenLicense().hashCode());
        result = prime * result + ((getTaxNo() == null) ? 0 : getTaxNo().hashCode());
        result = prime * result + ((getWechatOpenId() == null) ? 0 : getWechatOpenId().hashCode());
        result = prime * result + ((getDealPassword() == null) ? 0 : getDealPassword().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getCoreList() == null) ? 0 : getCoreList().hashCode());
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        result = prime * result + ((getLawOtherIdentType() == null) ? 0 : getLawOtherIdentType().hashCode());
        result = prime * result + ((getActiveDate() == null) ? 0 : getActiveDate().hashCode());
        result = prime * result + ((getActiveTime() == null) ? 0 : getActiveTime().hashCode());
        result = prime * result + ((getDealPassword() == null) ? 0 : getDealPassword().hashCode());
        result = prime * result + ((getDealPasswordSalt() == null) ? 0 : getDealPasswordSalt().hashCode());
        result = prime * result + ((getLoginUserName() == null) ? 0 : getLoginUserName().hashCode());
        result = prime * result + ((getLoginPassword() == null) ? 0 : getLoginPassword().hashCode());
        result = prime * result + ((getLoginPasswordSalt() == null) ? 0 : getLoginPasswordSalt().hashCode());
        result = prime * result + ((getOperOtherIdenttype() == null) ? 0 : getOperOtherIdenttype().hashCode());
        return result;
    }

    public void initAddValue() {
        this.id = SerialGenerator.getLongValue("CustOpenAccountTmp.id");
        this.regOperId = UserUtils.getOperatorInfo().getId();
        this.regOperName = UserUtils.getOperatorInfo().getName();
        this.regDate = BetterDateUtils.getNumDate();
        this.regTime = BetterDateUtils.getNumTime();
        this.operOrg = UserUtils.getOperatorInfo().getOperOrg();
    }

    public void initModifyValue(final CustOpenAccountTmp anOpenAccountInfo) {
        this.id = anOpenAccountInfo.getId();
        this.operOrg = anOpenAccountInfo.getOperOrg();
        this.tmpType = anOpenAccountInfo.getTmpType();
        this.modiOperId = UserUtils.getOperatorInfo().getId();
        this.modiOperName = UserUtils.getOperatorInfo().getName();
        this.modiDate = BetterDateUtils.getNumDate();
        this.modiTime = BetterDateUtils.getNumTime();
        this.businStatus = anOpenAccountInfo.getBusinStatus();
        this.lastStatus = this.businStatus;
    }

    /**
     * 初始化代录默认值(由于前端默认值实现被覆盖，不得已采用后端赋默认值)
     */
    public void initDefaultValue() {
        this.setBankNo("901");
        this.setBankCityno("110100");
        this.setLawIdentType("0");
        this.setIdentType("0");
        this.setOperIdenttype("0");
        this.setBankCityno("110100");
        this.setBankAccoName(this.getCustName());
    }
}