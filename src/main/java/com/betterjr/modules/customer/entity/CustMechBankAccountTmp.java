package com.betterjr.modules.customer.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.selectkey.SerialGenerator;
import com.betterjr.common.utils.BetterDateUtils;
import com.betterjr.common.utils.UserUtils;
import com.betterjr.modules.customer.constants.CustomerConstants;
import com.betterjr.modules.customer.data.ICustAuditEntityFace;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_mech_bankacco_tmp")
public class CustMechBankAccountTmp implements BetterjrEntity, ICustAuditEntityFace {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    @MetaData(value = "编号", comments = "编号")
    private Long id;

    /**
     * 代录记录/变更申请 编号
     */
    @Column(name = "L_PARENTID", columnDefinition = "INTEGER")
    @MetaData(value = "代录记录/变更申请 编号", comments = "代录记录/变更申请 编号")
    private Long parentId;

    /**
     * 数据版本号
     */
    @JsonIgnore
    @Column(name = "N_VERSION", columnDefinition = "INTEGER")
    @MetaData(value = "数据版本号", comments = "数据版本号")
    private Long version;

    /**
     * 是否默认账户 0否 1是
     */
    @Column(name = "C_IS_DEFAULT", columnDefinition = "CHAR")
    @MetaData(value = "是否默认账户 0否 1是", comments = "是否默认账户 0否 1是")
    private Boolean isDefault;

    /**
     * 交易账户
     */
    @JsonIgnore
    @Column(name = "C_TRADE_ACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "交易账户", comments = "交易账户")
    private String tradeAcco;

    /**
     * 银行编码
     */
    @Column(name = "C_BANK_NO", columnDefinition = "VARCHAR")
    @MetaData(value = "银行编码", comments = "银行编码")
    private String bankNo;

    /**
     * 银行全称
     */
    @Column(name = "C_BANK_NAME", columnDefinition = "VARCHAR")
    @MetaData(value = "银行全称", comments = "银行全称")
    private String bankName;

    /**
     * 银行账户
     */
    @Column(name = "C_BANK_ACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "银行账户", comments = "银行账户")
    private String bankAcco;

    /**
     * 银行户名；个人户的信息必须和客户信息一致，机构户可以不一致
     */
    @Column(name = "C_BANK_ACCONAME", columnDefinition = "VARCHAR")
    @MetaData(value = "银行户名", comments = "银行户名；个人户的信息必须和客户信息一致，机构户可以不一致")
    private String bankAccoName;

    /**
     * 联行号
     */
    @JsonIgnore
    @Column(name = "C_BANK_BRANCH", columnDefinition = "VARCHAR")
    @MetaData(value = "联行号", comments = "联行号")
    private String bankBranch;

    /**
     * 网点编码
     */
    @JsonIgnore
    @Column(name = "C_NET_NO", columnDefinition = "VARCHAR")
    @MetaData(value = "网点编码", comments = "网点编码")
    private String netNo;

    /**
     * 分中心
     */
    @JsonIgnore
    @Column(name = "C_PAY_CENTER", columnDefinition = "VARCHAR")
    @MetaData(value = "分中心", comments = "分中心")
    private String payCenter;

    /**
     * 冻结截止日期
     */
    @JsonIgnore
    @Column(name = "D_END_FROZEN_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "冻结截止日期", comments = "冻结截止日期")
    private String endFrozenDate;

    /**
     * 签约协议号
     */
    @JsonIgnore
    @Column(name = "C_CONTRACT_NO", columnDefinition = "VARCHAR")
    @MetaData(value = "签约协议号", comments = "签约协议号")
    private String contractNo;

    /**
     * 鉴权标志(0 未鉴权，1 已鉴权)
     */
    @JsonIgnore
    @Column(name = "C_AUTH_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "鉴权标志(0 未鉴权", comments = "鉴权标志(0 未鉴权，1 已鉴权)")
    private String authStatus;

    /**
     * 签约状态
     */
    @JsonIgnore
    @Column(name = "C_SIGN_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "签约状态", comments = "签约状态")
    private String signStatus;

    /**
     * 客户在银行证件类型
     */
    @JsonIgnore
    @Column(name = "C_IDENTTYPE", columnDefinition = "CHAR")
    @MetaData(value = "客户在银行证件类型", comments = "客户在银行证件类型")
    private String identType;

    /**
     * 客户在银行的证件号码，主要解决15位18位身份证的问题
     */
    @JsonIgnore
    @Column(name = "C_IDENTNO", columnDefinition = "VARCHAR")
    @MetaData(value = "客户在银行的证件号码", comments = "客户在银行的证件号码，主要解决15位18位身份证的问题")
    private String identNo;

    /**
     * 特殊控制标志
     */
    @JsonIgnore
    @Column(name = "C_FLAG", columnDefinition = "VARCHAR")
    @MetaData(value = "特殊控制标志", comments = "特殊控制标志")
    private String flag;

    /**
     * 旧卡信息
     */
    @JsonIgnore
    @Column(name = "C_BAKUP_ACCO", columnDefinition = "VARCHAR")
    @MetaData(value = "旧卡信息", comments = "旧卡信息")
    private String bakupAcco;

    /**
     * 区/县名称
     */
    @JsonIgnore
    @Column(name = "C_COUNTY_NAME", columnDefinition = "VARCHAR")
    @MetaData(value = "区/县名称", comments = "区/县名称")
    private String countyName;

    /**
     * 城市地区名称
     */
    @JsonIgnore
    @Column(name = "C_CITY_NAME", columnDefinition = "VARCHAR")
    @MetaData(value = "城市地区名称", comments = "城市地区名称")
    private String cityName;

    /**
     * 城市地区代码
     */
    @Column(name = "C_CITYNO", columnDefinition = "VARCHAR")
    @MetaData(value = "城市地区代码", comments = "城市地区代码")
    private String cityNo;

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
    @JsonIgnore
    @Column(name = "D_REG_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "创建日期", comments = "创建日期")
    private String regDate;

    /**
     * 创建时间
     */
    @JsonIgnore
    @Column(name = "T_REG_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "创建时间", comments = "创建时间")
    private String regTime;

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
    @JsonIgnore
    @Column(name = "D_MODI_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "修改日期", comments = "修改日期")
    private String modiDate;

    /**
     * 修改时间
     */
    @JsonIgnore
    @Column(name = "T_MODI_TIME", columnDefinition = "VARCHAR")
    @MetaData(value = "修改时间", comments = "修改时间")
    private String modiTime;

    /**
     * 操作机构
     */
    @JsonIgnore
    @Column(name = "C_OPERORG", columnDefinition = "VARCHAR")
    @MetaData(value = "操作机构", comments = "操作机构")
    private String operOrg;

    /**
     * 账户状态（0 正常 1 销户中 2 销户，3冻结，4待复核）
     */
    @Column(name = "C_ACCO_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "账户状态（0 正常  1 销户中  2 销户", comments = "账户状态（0 正常  1 销户中  2 销户，3冻结，4待复核）")
    private String accoStatus;

    /**
     * 使用状态:0未使用 1使用中 2已使用
     */
    @Column(name = "C_BUSIN_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "使用状态:0未使用  1使用中  2已使用", comments = "使用状态:0未使用  1使用中  2已使用")
    private String businStatus;

    @JsonIgnore
    @Column(name = "C_LAST_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "", comments = "")
    private String lastStatus;

    /**
     * 客户编号
     */
    @Column(name = "L_CUSTNO", columnDefinition = "INTEGER")
    @MetaData(value = "客户编号", comments = "客户编号")
    private Long custNo;

    /**
     * 引用编号
     */
    @Column(name = "L_REF_ID", columnDefinition = "INTEGER")
    @MetaData(value = "引用编号", comments = "引用编号")
    private Long refId;

    /**
     * 流水类型:0 代录 1 变更 2 暂存
     */
    @Column(name = "C_TMP_TYPE", columnDefinition = "CHAR")
    @MetaData(value = "流水类型:0 代录  1 变更  2 暂存", comments = "流水类型:0 代录  1 变更  2 暂存")
    private String tmpType;

    /**
     * 流水操作类型:0 新增 1 修改 2 删除
     */
    @Column(name = "C_TMP_OPER_TYPE", columnDefinition = "CHAR")
    @MetaData(value = "流水操作类型:0 新增  1 修改  2 删除", comments = "流水操作类型:0 新增  1 修改  2 删除")
    private String tmpOperType;

    /**
     * 附件
     */
    @Column(name = "N_BATCHNO", columnDefinition = "INTEGER")
    @MetaData(value = "附件", comments = "附件")
    private Long batchNo;

    /**
     * 开户许可证核准号
     */
    @Column(name = "C_OPEN_LICENSE", columnDefinition = "VARCHAR")
    @MetaData(value = "开户许可证核准号", comments = "开户许可证核准号")
    private String openLicense;

    private static final long serialVersionUID = 1468812783852L;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(final Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getTradeAcco() {
        return tradeAcco;
    }

    public void setTradeAcco(final String tradeAcco) {
        this.tradeAcco = tradeAcco == null ? null : tradeAcco.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(final String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(final String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
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

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(final String bankBranch) {
        this.bankBranch = bankBranch == null ? null : bankBranch.trim();
    }

    public String getNetNo() {
        return netNo;
    }

    public void setNetNo(final String netNo) {
        this.netNo = netNo == null ? null : netNo.trim();
    }

    public String getPayCenter() {
        return payCenter;
    }

    public void setPayCenter(final String payCenter) {
        this.payCenter = payCenter == null ? null : payCenter.trim();
    }

    public String getEndFrozenDate() {
        return endFrozenDate;
    }

    public void setEndFrozenDate(final String endFrozenDate) {
        this.endFrozenDate = endFrozenDate == null ? null : endFrozenDate.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(final String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public String getAuthStatus() {
        return authStatus;
    }

    public void setAuthStatus(final String authStatus) {
        this.authStatus = authStatus == null ? null : authStatus.trim();
    }

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(final String signStatus) {
        this.signStatus = signStatus == null ? null : signStatus.trim();
    }

    public String getIdentType() {
        return identType;
    }

    public void setIdentType(final String identType) {
        this.identType = identType == null ? null : identType.trim();
    }

    public String getIdentNo() {
        return identNo;
    }

    public void setIdentNo(final String identNo) {
        this.identNo = identNo == null ? null : identNo.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(final String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getBakupAcco() {
        return bakupAcco;
    }

    public void setBakupAcco(final String bakupAcco) {
        this.bakupAcco = bakupAcco == null ? null : bakupAcco.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(final String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(final String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityNo() {
        return cityNo;
    }

    public void setCityNo(final String cityNo) {
        this.cityNo = cityNo == null ? null : cityNo.trim();
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

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(final String operOrg) {
        this.operOrg = operOrg == null ? null : operOrg.trim();
    }

    public String getAccoStatus() {
        return accoStatus;
    }

    public void setAccoStatus(final String accoStatus) {
        this.accoStatus = accoStatus == null ? null : accoStatus.trim();
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

    @Override
    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(final Long custNo) {
        this.custNo = custNo;
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(final Long refId) {
        this.refId = refId;
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

    @Override
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(final Long anParentId) {
        parentId = anParentId;
    }

    @Override
    public Long getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(final Long batchNo) {
        this.batchNo = batchNo;
    }

    public String getOpenLicense() {
        return this.openLicense;
    }

    public void setOpenLicense(final String anOpenLicense) {
        this.openLicense = anOpenLicense;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", version=").append(version);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", tradeAcco=").append(tradeAcco);
        sb.append(", bankNo=").append(bankNo);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankAcco=").append(bankAcco);
        sb.append(", bankAccoName=").append(bankAccoName);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", netNo=").append(netNo);
        sb.append(", payCenter=").append(payCenter);
        sb.append(", endFrozenDate=").append(endFrozenDate);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", authStatus=").append(authStatus);
        sb.append(", signStatus=").append(signStatus);
        sb.append(", identType=").append(identType);
        sb.append(", identNo=").append(identNo);
        sb.append(", flag=").append(flag);
        sb.append(", bakupAcco=").append(bakupAcco);
        sb.append(", countyName=").append(countyName);
        sb.append(", cityName=").append(cityName);
        sb.append(", cityNo=").append(cityNo);
        sb.append(", regOperId=").append(regOperId);
        sb.append(", regOperName=").append(regOperName);
        sb.append(", regDate=").append(regDate);
        sb.append(", regTime=").append(regTime);
        sb.append(", modiOperId=").append(modiOperId);
        sb.append(", modiOperName=").append(modiOperName);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", modiTime=").append(modiTime);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", accoStatus=").append(accoStatus);
        sb.append(", businStatus=").append(businStatus);
        sb.append(", lastStatus=").append(lastStatus);
        sb.append(", custNo=").append(custNo);
        sb.append(", refId=").append(refId);
        sb.append(", tmpType=").append(tmpType);
        sb.append(", tmpOperType=").append(tmpOperType);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", openLicense=").append(openLicense);
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
        final CustMechBankAccountTmp other = (CustMechBankAccountTmp) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getParentId() == null ? other.getParentId() == null
                        : this.getParentId().equals(other.getParentId()))
                && (this.getVersion() == null ? other.getVersion() == null
                        : this.getVersion().equals(other.getVersion()))
                && (this.getIsDefault() == null ? other.getIsDefault() == null
                        : this.getIsDefault().equals(other.getIsDefault()))
                && (this.getTradeAcco() == null ? other.getTradeAcco() == null
                        : this.getTradeAcco().equals(other.getTradeAcco()))
                && (this.getBankNo() == null ? other.getBankNo() == null : this.getBankNo().equals(other.getBankNo()))
                && (this.getBankName() == null ? other.getBankName() == null
                        : this.getBankName().equals(other.getBankName()))
                && (this.getBankAcco() == null ? other.getBankAcco() == null
                        : this.getBankAcco().equals(other.getBankAcco()))
                && (this.getBankAccoName() == null ? other.getBankAccoName() == null
                        : this.getBankAccoName().equals(other.getBankAccoName()))
                && (this.getBankBranch() == null ? other.getBankBranch() == null
                        : this.getBankBranch().equals(other.getBankBranch()))
                && (this.getNetNo() == null ? other.getNetNo() == null : this.getNetNo().equals(other.getNetNo()))
                && (this.getPayCenter() == null ? other.getPayCenter() == null
                        : this.getPayCenter().equals(other.getPayCenter()))
                && (this.getEndFrozenDate() == null ? other.getEndFrozenDate() == null
                        : this.getEndFrozenDate().equals(other.getEndFrozenDate()))
                && (this.getContractNo() == null ? other.getContractNo() == null
                        : this.getContractNo().equals(other.getContractNo()))
                && (this.getAuthStatus() == null ? other.getAuthStatus() == null
                        : this.getAuthStatus().equals(other.getAuthStatus()))
                && (this.getSignStatus() == null ? other.getSignStatus() == null
                        : this.getSignStatus().equals(other.getSignStatus()))
                && (this.getIdentType() == null ? other.getIdentType() == null
                        : this.getIdentType().equals(other.getIdentType()))
                && (this.getIdentNo() == null ? other.getIdentNo() == null
                        : this.getIdentNo().equals(other.getIdentNo()))
                && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
                && (this.getBakupAcco() == null ? other.getBakupAcco() == null
                        : this.getBakupAcco().equals(other.getBakupAcco()))
                && (this.getCountyName() == null ? other.getCountyName() == null
                        : this.getCountyName().equals(other.getCountyName()))
                && (this.getCityName() == null ? other.getCityName() == null
                        : this.getCityName().equals(other.getCityName()))
                && (this.getCityNo() == null ? other.getCityNo() == null : this.getCityNo().equals(other.getCityNo()))
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
                && (this.getOperOrg() == null ? other.getOperOrg() == null
                        : this.getOperOrg().equals(other.getOperOrg()))
                && (this.getAccoStatus() == null ? other.getAccoStatus() == null
                        : this.getAccoStatus().equals(other.getAccoStatus()))
                && (this.getBusinStatus() == null ? other.getBusinStatus() == null
                        : this.getBusinStatus().equals(other.getBusinStatus()))
                && (this.getLastStatus() == null ? other.getLastStatus() == null
                        : this.getLastStatus().equals(other.getLastStatus()))
                && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
                && (this.getRefId() == null ? other.getRefId() == null : this.getRefId().equals(other.getRefId()))
                && (this.getTmpType() == null ? other.getTmpType() == null
                        : this.getTmpType().equals(other.getTmpType()))
                && (this.getTmpOperType() == null ? other.getTmpOperType() == null
                        : this.getTmpOperType().equals(other.getTmpOperType()))
                && (this.getOpenLicense() == null ? other.getOpenLicense() == null
                        : this.getOpenLicense().equals(other.getOpenLicense()))
                && (this.getBatchNo() == null ? other.getBatchNo() == null
                        : this.getBatchNo().equals(other.getBatchNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        result = prime * result + ((getTradeAcco() == null) ? 0 : getTradeAcco().hashCode());
        result = prime * result + ((getBankNo() == null) ? 0 : getBankNo().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankAcco() == null) ? 0 : getBankAcco().hashCode());
        result = prime * result + ((getBankAccoName() == null) ? 0 : getBankAccoName().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        result = prime * result + ((getNetNo() == null) ? 0 : getNetNo().hashCode());
        result = prime * result + ((getPayCenter() == null) ? 0 : getPayCenter().hashCode());
        result = prime * result + ((getEndFrozenDate() == null) ? 0 : getEndFrozenDate().hashCode());
        result = prime * result + ((getContractNo() == null) ? 0 : getContractNo().hashCode());
        result = prime * result + ((getAuthStatus() == null) ? 0 : getAuthStatus().hashCode());
        result = prime * result + ((getSignStatus() == null) ? 0 : getSignStatus().hashCode());
        result = prime * result + ((getIdentType() == null) ? 0 : getIdentType().hashCode());
        result = prime * result + ((getIdentNo() == null) ? 0 : getIdentNo().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getBakupAcco() == null) ? 0 : getBakupAcco().hashCode());
        result = prime * result + ((getCountyName() == null) ? 0 : getCountyName().hashCode());
        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());
        result = prime * result + ((getCityNo() == null) ? 0 : getCityNo().hashCode());
        result = prime * result + ((getRegOperId() == null) ? 0 : getRegOperId().hashCode());
        result = prime * result + ((getRegOperName() == null) ? 0 : getRegOperName().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getModiOperId() == null) ? 0 : getModiOperId().hashCode());
        result = prime * result + ((getModiOperName() == null) ? 0 : getModiOperName().hashCode());
        result = prime * result + ((getModiDate() == null) ? 0 : getModiDate().hashCode());
        result = prime * result + ((getModiTime() == null) ? 0 : getModiTime().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getAccoStatus() == null) ? 0 : getAccoStatus().hashCode());
        result = prime * result + ((getBusinStatus() == null) ? 0 : getBusinStatus().hashCode());
        result = prime * result + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getRefId() == null) ? 0 : getRefId().hashCode());
        result = prime * result + ((getTmpType() == null) ? 0 : getTmpType().hashCode());
        result = prime * result + ((getTmpOperType() == null) ? 0 : getTmpOperType().hashCode());
        result = prime * result + ((getOpenLicense() == null) ? 0 : getOpenLicense().hashCode());
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        return result;
    }

    public void initAddValue(final String anBusinStatus) {
        this.initAddValue(anBusinStatus, null, null);
    }

    public void initAddValue(final CustMechBankAccount anBankAccount, final String anBusinStatus) {
        this.initAddValue(anBusinStatus, null, null);

        this.custNo = anBankAccount.getCustNo();
        this.identType = anBankAccount.getIdentType();
        this.identNo = anBankAccount.getIdentNo();
        this.batchNo = anBankAccount.getBatchNo();
        this.bankAcco = anBankAccount.getBankAcco();
        this.bankAccoName = anBankAccount.getBankAccoName();
        this.bankNo = anBankAccount.getBankNo();
        this.bankName = anBankAccount.getBankName();
        this.isDefault = anBankAccount.getIsDefault();
        this.cityNo = anBankAccount.getCityNo();
        this.openLicense = anBankAccount.getOpenLicense();
    }

    public void initAddValue(final String anBusinStatus, final String anTmpType, final Long anVersion) {
        this.id = SerialGenerator.getLongValue("CustMechBankAccountTmp.id");

        this.regOperId = UserUtils.getOperatorInfo().getId();
        this.regOperName = UserUtils.getOperatorInfo().getName();
        this.regDate = BetterDateUtils.getNumDate();
        this.regTime = BetterDateUtils.getNumTime();

        this.modiOperId = UserUtils.getOperatorInfo().getId();
        this.modiOperName = UserUtils.getOperatorInfo().getName();
        this.modiDate = BetterDateUtils.getNumDate();
        this.modiTime = BetterDateUtils.getNumTime();

        this.operOrg = UserUtils.getOperatorInfo().getOperOrg();
        this.businStatus = anBusinStatus;
        this.version = anVersion;

        this.tmpType = anTmpType;
    }

    public void initModifyValue(final CustMechBankAccountTmp anBankAccountTmp) {
        this.modiOperId = UserUtils.getOperatorInfo().getId();
        this.modiOperName = UserUtils.getOperatorInfo().getName();
        this.modiDate = BetterDateUtils.getNumDate();
        this.modiTime = BetterDateUtils.getNumTime();

        this.identType = anBankAccountTmp.getIdentType();
        this.identNo = anBankAccountTmp.getIdentNo();
        this.batchNo = anBankAccountTmp.getBatchNo();
        this.bankAcco = anBankAccountTmp.getBankAcco();
        this.bankAccoName = anBankAccountTmp.getBankAccoName();
        this.bankNo = anBankAccountTmp.getBankNo();
        this.bankName = anBankAccountTmp.getBankName();
        this.isDefault = anBankAccountTmp.getIsDefault();
        this.cityNo = anBankAccountTmp.getCityNo();
        this.openLicense = anBankAccountTmp.getOpenLicense();

        this.tmpOperType = anBankAccountTmp.getTmpOperType();
        this.tmpType = anBankAccountTmp.getTmpType();
    }

    public void initModifyValue(final CustMechBankAccountTmp anCustMechBankAccountTmp, final String anBusinStatus,
            final Long anVersion) {
        this.initModifyValue(anCustMechBankAccountTmp);

        this.businStatus = anBusinStatus;
        this.version = anVersion;
    }

    public void initModifyValue(final CustMechBankAccount anBankAccount, final String anBusinStatus) {
        this.modiOperId = UserUtils.getOperatorInfo().getId();
        this.modiOperName = UserUtils.getOperatorInfo().getName();
        this.modiDate = BetterDateUtils.getNumDate();
        this.modiTime = BetterDateUtils.getNumTime();

        this.identType = anBankAccount.getIdentType();
        this.identNo = anBankAccount.getIdentNo();
        this.batchNo = anBankAccount.getBatchNo();
        this.bankAcco = anBankAccount.getBankAcco();
        this.bankAccoName = anBankAccount.getBankAccoName();
        this.bankNo = anBankAccount.getBankNo();
        this.bankName = anBankAccount.getBankName();
        this.isDefault = anBankAccount.getIsDefault();
        this.cityNo = anBankAccount.getCityNo();
        this.openLicense = anBankAccount.getOpenLicense();

        this.businStatus = anBusinStatus;
    }

    /**
     * @param anBankAccount
     * @param anTmpTypeInitdata
     * @param anTmpStatusUsed
     */
    public void initAddValue(final CustMechBankAccount anBankAccount, final String anTmpType,
            final String anBusinStatus) {
        this.id = SerialGenerator.getLongValue("CustMechBankAccountTmp.id");

        this.regOperId = UserUtils.getOperatorInfo().getId();
        this.regOperName = UserUtils.getOperatorInfo().getName();
        this.regDate = BetterDateUtils.getNumDate();
        this.regTime = BetterDateUtils.getNumTime();

        this.modiOperId = UserUtils.getOperatorInfo().getId();
        this.modiOperName = UserUtils.getOperatorInfo().getName();
        this.modiDate = BetterDateUtils.getNumDate();
        this.modiTime = BetterDateUtils.getNumTime();

        this.operOrg = UserUtils.getOperatorInfo().getOperOrg();
        this.businStatus = anBusinStatus;
        this.tmpType = anTmpType;
        this.tmpOperType = CustomerConstants.TMP_OPER_TYPE_ADD;

        this.identType = anBankAccount.getIdentType();
        this.identNo = anBankAccount.getIdentNo();
        this.batchNo = anBankAccount.getBatchNo();
        this.bankAcco = anBankAccount.getBankAcco();
        this.bankAccoName = anBankAccount.getBankAccoName();
        this.bankNo = anBankAccount.getBankNo();
        this.bankName = anBankAccount.getBankName();
        this.isDefault = anBankAccount.getIsDefault();
        this.cityNo = anBankAccount.getCityNo();
        this.custNo = anBankAccount.getCustNo();
        this.openLicense = anBankAccount.getOpenLicense();
    }
}