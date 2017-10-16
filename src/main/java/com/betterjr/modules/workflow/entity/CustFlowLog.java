package com.betterjr.modules.workflow.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.entity.BetterjrEntity;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_log")
public class CustFlowLog implements BetterjrEntity {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    @MetaData(value = "编号", comments = "编号")
    private Long id;

    /**
     * 审批动作
     */
    @Column(name = "C_ACTION", columnDefinition = "VARCHAR")
    @MetaData(value = "审批动作", comments = "审批动作")
    private String action;

    /**
     * 审批意见
     */
    @Column(name = "C_OPINION", columnDefinition = "VARCHAR")
    @MetaData(value = "审批意见", comments = "审批意见")
    private String opinion;

    /**
     * 审批日期
     */
    @Column(name = "D_REG_DATE", columnDefinition = "VARCHAR")
    @MetaData(value = "审批日期", comments = "审批日期")
    private String regDate;

    /**
     * 审批人名称
     */
    @Column(name = "C_OPERNAME", columnDefinition = "VARCHAR")
    @MetaData(value = "审批人名称", comments = "审批人名称")
    private String operName;

    /**
     * 审批人编号
     */
    @Column(name = "L_OPERID", columnDefinition = "INTEGER")
    @MetaData(value = "审批人编号", comments = "审批人编号")
    private Long operId;

    /**
     * 组织机构
     */
    @Column(name = "C_OPERORG", columnDefinition = "VARCHAR")
    @MetaData(value = "组织机构", comments = "组织机构")
    private String operOrg;

    /**
     * 任务编号
     */
    @Column(name = "C_TASK_ID", columnDefinition = "VARCHAR")
    @MetaData(value = "任务编号", comments = "任务编号")
    private String taskId;

    /**
     * 任务名称
     */
    @Column(name = "C_TASK_NAME", columnDefinition = "VARCHAR")
    @MetaData(value = "任务名称", comments = "任务名称")
    private String taskName;

    /**
     * 流程实例编号
     */
    @Column(name = "C_PROC_INST_ID", columnDefinition = "VARCHAR")
    @MetaData(value = "流程实例编号", comments = "流程实例编号")
    private String procInstId;

    /**
     * 表单编号
     */
    @Column(name = "L_BUSINESSID", columnDefinition = "INTEGER")
    @MetaData(value = "表单编号", comments = "表单编号")
    private Long businId;

    /**
     * 流程类型
     */
    @Column(name = "C_FLOW_TYPE", columnDefinition = "VARCHAR")
    @MetaData(value = "流程类型", comments = "流程类型")
    private String flowType;

    private static final long serialVersionUID = -6335770109426577424L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion == null ? null : opinion.trim();
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate == null ? null : regDate.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(String operOrg) {
        this.operOrg = operOrg == null ? null : operOrg.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId == null ? null : procInstId.trim();
    }

    public Long getBusinId() {
        return businId;
    }

    public void setBusinId(Long businId) {
        this.businId = businId;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", action=").append(action);
        sb.append(", opinion=").append(opinion);
        sb.append(", regDate=").append(regDate);
        sb.append(", operName=").append(operName);
        sb.append(", operId=").append(operId);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", taskId=").append(taskId);
        sb.append(", taskName=").append(taskName);
        sb.append(", procInstId=").append(procInstId);
        sb.append(", businId=").append(businId);
        sb.append(", flowType=").append(flowType);
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
        CustFlowLog other = (CustFlowLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAction() == null ? other.getAction() == null : this.getAction().equals(other.getAction()))
                && (this.getOpinion() == null ? other.getOpinion() == null
                        : this.getOpinion().equals(other.getOpinion()))
                && (this.getRegDate() == null ? other.getRegDate() == null
                        : this.getRegDate().equals(other.getRegDate()))
                && (this.getOperName() == null ? other.getOperName() == null
                        : this.getOperName().equals(other.getOperName()))
                && (this.getOperId() == null ? other.getOperId() == null : this.getOperId().equals(other.getOperId()))
                && (this.getOperOrg() == null ? other.getOperOrg() == null
                        : this.getOperOrg().equals(other.getOperOrg()))
                && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
                && (this.getTaskName() == null ? other.getTaskName() == null
                        : this.getTaskName().equals(other.getTaskName()))
                && (this.getProcInstId() == null ? other.getProcInstId() == null
                        : this.getProcInstId().equals(other.getProcInstId()))
                && (this.getBusinId() == null ? other.getBusinId() == null
                        : this.getBusinId().equals(other.getBusinId()))
                && (this.getFlowType() == null ? other.getFlowType() == null
                        : this.getFlowType().equals(other.getFlowType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAction() == null) ? 0 : getAction().hashCode());
        result = prime * result + ((getOpinion() == null) ? 0 : getOpinion().hashCode());
        result = prime * result + ((getRegDate() == null) ? 0 : getRegDate().hashCode());
        result = prime * result + ((getOperName() == null) ? 0 : getOperName().hashCode());
        result = prime * result + ((getOperId() == null) ? 0 : getOperId().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getProcInstId() == null) ? 0 : getProcInstId().hashCode());
        result = prime * result + ((getBusinId() == null) ? 0 : getBusinId().hashCode());
        result = prime * result + ((getFlowType() == null) ? 0 : getFlowType().hashCode());
        return result;
    }
}