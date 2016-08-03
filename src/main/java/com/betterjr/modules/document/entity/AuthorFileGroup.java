package com.betterjr.modules.document.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "T_CFG_AUTH_FILEGROUP")
public class AuthorFileGroup implements BetterjrEntity {

    /**
     * 文件信息类型
     */
    @Column(name = "C_FILEINFOTYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="文件信息类型", comments = "文件信息类")
    private String fileInfoType;

    /**
     * 业务代码
     */
    @Column(name = "C_BUSINFLAG",  columnDefinition="VARCHAR" )
    @MetaData( value="业务代码", comments = "业务代码；取文件的分割")
    private String businFlag;

    /**
     * 业务描述
     */
    @Column(name = "C_DESCRIPTION",  columnDefinition="VARCHAR" )
    @MetaData( value="业务描述", comments = "业务描述")
    private String description;
    
    /**
     * 适用范围
     */
    @Column(name = "C_SUB_RANG",  columnDefinition="VARCHAR" )
    @MetaData( value="适用范围", comments = "适用范围")
    private String workRang;
 
    /**
     * 状态，0 停用 ;1启用
     */
    @Column(name = "C_STATUS", columnDefinition = "VARCHAR")
    @MetaData(value = "状态", comments = "状态，0 停用;  1启用")
    private String groupStatus;

    /**
     * 缺少的消息提示
     */
    @Column(name = "C_DEFICIENCYINFO", columnDefinition = "VARCHAR")
    @MetaData(value = "缺少的消息提示", comments = "缺少的消息提示")
    private String deficiencyInfo;

    private static final long serialVersionUID = 1440667936389L;
 
    public String getBusinFlag() {
        return businFlag;
    }

    public void setBusinFlag(String businFlag) {
        this.businFlag = businFlag == null ? null : businFlag.trim();
    }
 
    public String getFileInfoType() {
        return this.fileInfoType;
    }

    public void setFileInfoType(String anFileInfoType) {
        this.fileInfoType = anFileInfoType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String anDescription) {
        this.description = anDescription;
    }
 
    public String getGroupStatus() {
        return this.groupStatus;
    }

    public void setGroupStatus(String anGroupStatus) {
        this.groupStatus = anGroupStatus;
    }
  
    public String getWorkRang() {
        return this.workRang;
    }

    public void setWorkRang(String anWorkRang) {
        this.workRang = anWorkRang;
    }

    public String getDeficiencyInfo() {
        return this.deficiencyInfo;
    }

    public void setDeficiencyInfo(String anDeficiencyInfo) {
        this.deficiencyInfo = anDeficiencyInfo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("fileInfoType=").append(fileInfoType);
        sb.append(", workRang=").append(workRang);
        sb.append(", businFlag=").append(businFlag);
        sb.append(", description=").append(description);
        sb.append(", deficiencyInfo=").append(deficiencyInfo);
        sb.append(", groupStatus=").append(groupStatus);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AuthorFileGroup other = (AuthorFileGroup) that;
        return (this.getFileInfoType() == null ? other.getFileInfoType() == null : this.getFileInfoType().equals(other.getFileInfoType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getWorkRang() == null ? other.getWorkRang() == null : this.getWorkRang().equals(other.getWorkRang()))
            && (this.getBusinFlag() == null ? other.getBusinFlag() == null : this.getBusinFlag().equals(other.getBusinFlag()))
            && (this.getDeficiencyInfo() == null ? other.getDeficiencyInfo() == null : this.getDeficiencyInfo().equals(other.getDeficiencyInfo()))
            && (this.getGroupStatus() == null ? other.getGroupStatus() == null : this.getGroupStatus().equals(other.getGroupStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFileInfoType() == null) ? 0 : getFileInfoType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getWorkRang() == null) ? 0 : getWorkRang().hashCode());
        result = prime * result + ((getBusinFlag() == null) ? 0 : getBusinFlag().hashCode());
        result = prime * result + ((getDeficiencyInfo() == null) ? 0 : getDeficiencyInfo().hashCode());
        result = prime * result + ((getGroupStatus() == null) ? 0 : getGroupStatus().hashCode());
        return result;
    }
}