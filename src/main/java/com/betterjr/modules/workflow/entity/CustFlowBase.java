package com.betterjr.modules.workflow.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.common.mapper.CustDateToStrJsonSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_base")
public class CustFlowBase implements BetterjrEntity {
    public static final String selectKey="CustFlowBase.id";
    /**
     * 流程编号
     */
//    @JsonIgnore
    @Id
    @Column(name = "ID",  columnDefinition="INTEGER" )
    @MetaData( value="流程编号", comments = "流程编号")
    private Long id;

    /**
     * 流程类型
     */
    @Column(name = "C_FLOW_TYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="流程类型", comments = "流程类型")
    private String flowType;

    /**
     * 监控人编号
     */
    @Column(name = "L_MONITOR_OPERID",  columnDefinition="INTEGER" )
    @MetaData( value="监控人编号", comments = "监控人编号")
    private Long monitorOperId;

    /**
     * 监控人名称
     */
    @Column(name = "C_MONITOR_OPERNAME",  columnDefinition="VARCHAR" )
    @MetaData( value="监控人名称", comments = "监控人名称")
    private String monitorOperName;

    /**
     * 组织机构
     */
    @Column(name = "C_OPERORG",  columnDefinition="VARCHAR" )
    @MetaData( value="组织机构", comments = "组织机构")
    private String operOrg;

    /**
     * 注册日期
     */
    @JsonSerialize(using = CustDateToStrJsonSerializer.class)
    @Column(name = "T_REGDATE",  columnDefinition="DateTime" )
    @MetaData( value="注册日期", comments = "注册日期")
    private Date regDate;

    /**
     * 修改日期
     */
    @JsonSerialize(using = CustDateToStrJsonSerializer.class)
    @Column(name = "T_MODIDATE",  columnDefinition="DateTime" )
    @MetaData( value="修改日期", comments = "修改日期")
    private Date modiDate;

    /**
     * 注册人编号
     */
    @Column(name = "L_REG_OPERID",  columnDefinition="INTEGER" )
    @MetaData( value="注册人编号", comments = "注册人编号")
    private Long regOperId;

    /**
     * 注册人姓名
     */
    @Column(name = "C_REG_OPERNAME",  columnDefinition="VARCHAR" )
    @MetaData( value="注册人姓名", comments = "注册人姓名")
    private String regOperName;
    
    @Transient
    private List<CustFlowStep> stepList;

    private static final long serialVersionUID = 1469677920733L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    public Long getMonitorOperId() {
        return monitorOperId;
    }

    public void setMonitorOperId(Long monitorOperId) {
        this.monitorOperId = monitorOperId;
    }

    public String getMonitorOperName() {
        return monitorOperName;
    }

    public void setMonitorOperName(String monitorOperName) {
        this.monitorOperName = monitorOperName == null ? null : monitorOperName.trim();
    }

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(String operOrg) {
        this.operOrg = operOrg == null ? null : operOrg.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getModiDate() {
        return modiDate;
    }

    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }

    public Long getRegOperId() {
        return regOperId;
    }

    public void setRegOperId(Long regOperId) {
        this.regOperId = regOperId;
    }

    public String getRegOperName() {
        return regOperName;
    }

    public void setRegOperName(String regOperName) {
        this.regOperName = regOperName == null ? null : regOperName.trim();
    }

    public List<CustFlowStep> getStepList() {
        return stepList;
    }

    public void setStepList(List<CustFlowStep> stepList) {
        this.stepList = stepList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowType=").append(flowType);
        sb.append(", monitorOperId=").append(monitorOperId);
        sb.append(", monitorOperName=").append(monitorOperName);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", regDate=").append(regDate);
        sb.append(", modiDate=").append(modiDate);
        sb.append(", regOperId=").append(regOperId);
        sb.append(", regOperName=").append(regOperName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
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
        CustFlowBase other = (CustFlowBase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowType() == null ? other.getFlowType() == null : this.getFlowType().equals(other.getFlowType()))
            && (this.getMonitorOperId() == null ? other.getMonitorOperId() == null : this.getMonitorOperId().equals(other.getMonitorOperId()))
            && (this.getMonitorOperName() == null ? other.getMonitorOperName() == null : this.getMonitorOperName().equals(other.getMonitorOperName()))
            && (this.getOperOrg() == null ? other.getOperOrg() == null : this.getOperOrg().equals(other.getOperOrg()))
            && (this.getRegDate() == null ? other.getRegDate() == null : this.getRegDate().equals(other.getRegDate()))
            && (this.getModiDate() == null ? other.getModiDate() == null : this.getModiDate().equals(other.getModiDate()))
            && (this.getRegOperId() == null ? other.getRegOperId() == null : this.getRegOperId().equals(other.getRegOperId()))
            && (this.getRegOperName() == null ? other.getRegOperName() == null : this.getRegOperName().equals(other.getRegOperName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowType() == null) ? 0 : getFlowType().hashCode());
        result = prime * result + ((getMonitorOperId() == null) ? 0 : getMonitorOperId().hashCode());
        result = prime * result + ((getMonitorOperName() == null) ? 0 : getMonitorOperName().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getModiDate() == null) ? 0 : getModiDate().hashCode());
        result = prime * result + ((getRegOperId() == null) ? 0 : getRegOperId().hashCode());
        result = prime * result + ((getRegOperName() == null) ? 0 : getRegOperName().hashCode());
        return result;
    }
}