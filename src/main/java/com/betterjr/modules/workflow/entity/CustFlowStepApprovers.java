package com.betterjr.modules.workflow.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_step_approvers")
public class CustFlowStepApprovers implements BetterjrEntity {
    public static final String selectKey="CustFlowStepApprovers.id";
    public static final Integer MaxWeight=100;
    public static final Integer MinWeight=1;
    /**
     * 编号
     */
//    @JsonIgnore
    @Id
    @Column(name = "ID",  columnDefinition="INTEGER" )
    @MetaData( value="编号", comments = "编号")
    private Long id;
    /**
     * 流程step编号
     */
    @Column(name = "L_STEP_ID",  columnDefinition="INTEGER" )
    @MetaData( value="流程step编号", comments = "流程step编号")
    private Long stepId;

    /**
     * 审批人编号
     */
    @Column(name = "L_OPERID",  columnDefinition="INTEGER" )
    @MetaData( value="审批人编号", comments = "审批人编号")
    private Long auditOperId;
    
    /**
     * 审批人名称
     */
    @Id
    @Column(name = "C_OPERNAME",  columnDefinition="VARCHAR" )
    @MetaData( value="审批人名称", comments = "审批人名称")
    private String auditOperName;

    /**
     * 审批金额段编号
     */
    @Column(name = "L_MONEY_ID",  columnDefinition="INTEGER" )
    @MetaData( value="审批金额段编号", comments = "审批金额段编号")
    private Long auditMoneyId;
    
    /**
     * 审批权重,取值范围为>=0,<=100; 同一个审批step，多个审批人的总权重>=100立即进入下一步，任意一个审批人驳回，则驳回，任意一个审批人不通过则审批业务终止
     */
    @Column(name = "N_WEIGHT",  columnDefinition="INTEGER" )
    @MetaData( value="审批权重,取值范围为>=0,<=100; 同一个审批step", comments = "审批权重,取值范围为>=0,<=100; 同一个审批step，多个审批人的总权重>=100立即进入下一步，任意一个审批人驳回，则驳回，任意一个审批人不通过则审批业务终止")
    private Integer weight;
    
    @Transient
    @JsonIgnore
    private CustFlowMoney money;
    
    private static final long serialVersionUID = 1469677920734L;

    public Long getStepId() {
        return stepId;
    }

    public void setStepId(Long stepId) {
        this.stepId = stepId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuditOperId() {
        return auditOperId;
    }

    public void setAuditOperId(Long auditOperId) {
        this.auditOperId = auditOperId;
    }

    public Long getAuditMoneyId() {
        return auditMoneyId;
    }

    public void setAuditMoneyId(Long auditMoneyId) {
        this.auditMoneyId = auditMoneyId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public CustFlowMoney getMoney() {
        return money;
    }

    public void setMoney(CustFlowMoney money) {
        this.money = money;
    }

    public String getAuditOperName() {
        return auditOperName;
    }

    public void setAuditOperName(String auditOperName) {
        this.auditOperName = auditOperName;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stepId=").append(stepId);
        sb.append(", auditOperId=").append(auditOperId);
        sb.append(", auditOperName=").append(auditOperName);
        sb.append(", auditMoneyId=").append(auditMoneyId);
        sb.append(", weight=").append(weight);
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
        CustFlowStepApprovers other = (CustFlowStepApprovers) that;
        return (this.getStepId() == null ? other.getStepId() == null : this.getStepId().equals(other.getStepId()))
            && (this.getAuditOperId() == null ? other.getAuditOperId() == null : this.getAuditOperId().equals(other.getAuditOperId()))
            && (this.getAuditMoneyId() == null ? other.getAuditMoneyId() == null : this.getAuditMoneyId().equals(other.getAuditMoneyId()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStepId() == null) ? 0 : getStepId().hashCode());
        result = prime * result + ((getAuditOperId() == null) ? 0 : getAuditOperId().hashCode());
        result = prime * result + ((getAuditMoneyId() == null) ? 0 : getAuditMoneyId().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return result;
    }
}