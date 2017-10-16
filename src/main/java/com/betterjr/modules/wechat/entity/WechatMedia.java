package com.betterjr.modules.wechat.entity;

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

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_sys_wechat_media")
public class WechatMedia implements BetterjrEntity {
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    private Long id;

    /**
     * 微信用户 OpenId
     */
    @Id
    @Column(name = "C_OPENID", columnDefinition = "VARCHAR")
    private String openId;

    /**
     * 微信 AppId
     */
    @Column(name = "C_APPID", columnDefinition = "VARCHAR")
    private String appId;

    /**
     * 文件 FileId
     */
    @Column(name = "L_FILEID", columnDefinition = "VARCHAR")
    private Long fileId;

    /**
     * 存入时间
     */
    @Column(name = "D_REG_DATE", columnDefinition = "VARCHAR")
    private String regDate;

    @Column(name = "T_REG_TIME", columnDefinition = "VARCHAR")
    private String regTime;

    /**
     * 类型 0 图片 1
     */
    @Column(name = "C_MEDIA_TYPE", columnDefinition = "VARCHAR")
    private String mediaType;

    /**
     * 操作员ID号
     */
    @Column(name = "L_OPERID", columnDefinition = "INTEGER")
    @MetaData(value = "操作员ID号", comments = "操作员ID号")
    private Long operId;

    /**
     * 操作员名字
     */
    @Column(name = "C_OPERNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "操作员名字", comments = "操作员名字")
    private String operName;

    /**
     * 客户号
     */
    @Column(name = "L_CUSTNO", columnDefinition = "INTEGER")
    @MetaData(value = "客户号", comments = "客户号")
    private Long custNo;

    /**
     * 操作员所在机构
     */
    @Column(name = "C_OPERORG", columnDefinition = "VARCHAR")
    @MetaData(value = "操作员所在机构", comments = "操作员所在机构")
    private String operOrg;

    /**
     * 使用状态:0未使用  1使用中  2已使用 供后期使用
     */
    @Column(name = "C_BUSIN_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "使用状态", comments = "使用状态:0未使用  1使用中  2已使用")
    private String businStatus;

    @Column(name = "C_LAST_STATUS", columnDefinition = "CHAR")
    @MetaData(value = "", comments = "")
    private String lastStatus;

    private static final long serialVersionUID = 4706960214937874478L;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(final String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(final String appId) {
        this.appId = appId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(final Long fileId) {
        this.fileId = fileId;
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

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(final String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(final Long anOperId) {
        operId = anOperId;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(final String anOperName) {
        operName = anOperName;
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(final Long anCustNo) {
        custNo = anCustNo;
    }

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(final String anOperOrg) {
        operOrg = anOperOrg;
    }

    public String getBusinStatus() {
        return businStatus;
    }

    public void setBusinStatus(final String anBusinStatus) {
        businStatus = anBusinStatus;
    }

    public String getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(final String anLastStatus) {
        lastStatus = anLastStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openId=").append(openId);
        sb.append(", appId=").append(appId);
        sb.append(", fileId=").append(fileId);
        sb.append(", regDate=").append(regDate);
        sb.append(", regTime=").append(regTime);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", operId=").append(operId);
        sb.append(", operName=").append(operName);
        sb.append(", custNo=").append(custNo);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", businStatus=").append(businStatus);
        sb.append(", lastStatus=").append(lastStatus);
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
        final WechatMedia other = (WechatMedia) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
                && (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
                && (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()))
                && (this.getRegTime() == null ? other.getRegTime() == null
                        : this.getRegTime().equals(other.getRegTime()))
                && (this.getOperId() == null ? other.getOperId() == null : this.getOperId().equals(other.getOperId()))
                && (this.getOperName() == null ? other.getOperName() == null
                        : this.getOperName().equals(other.getOperName()))
                && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
                && (this.getOperOrg() == null ? other.getOperOrg() == null
                        : this.getOperOrg().equals(other.getOperOrg()))
                && (this.getBusinStatus() == null ? other.getBusinStatus() == null
                        : this.getBusinStatus().equals(other.getBusinStatus()))
                && (this.getLastStatus() == null ? other.getLastStatus() == null
                        : this.getLastStatus().equals(other.getLastStatus()))
                && (this.getMediaType() == null ? other.getMediaType() == null
                        : this.getMediaType().equals(other.getMediaType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getRegTime() == null) ? 0 : getRegTime().hashCode());
        result = prime * result + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        result = prime * result + ((getOperId() == null) ? 0 : getOperId().hashCode());
        result = prime * result + ((getOperName() == null) ? 0 : getOperName().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getBusinStatus() == null) ? 0 : getBusinStatus().hashCode());
        result = prime * result + ((getLastStatus() == null) ? 0 : getLastStatus().hashCode());
        return result;
    }

    public void initDefValue(final String anAppId, final String anOpenId, final String anMediaType,
            final Long anFileId) {
        this.id = SerialGenerator.getLongValue("WechatMedia.id");
        this.regDate = BetterDateUtils.getNumDate();
        this.regTime = BetterDateUtils.getNumTime();

        this.appId = anAppId;
        this.openId = anOpenId;
        this.mediaType = anMediaType;
        this.fileId = anFileId;
    }
}