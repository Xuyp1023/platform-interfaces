package com.betterjr.modules.workflow.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.modules.workflow.data.AuditType;
import com.betterjr.modules.workflow.data.CustFlowNodeData;
import com.betterjr.modules.workflow.data.FlowNodeRole;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_steps")
public class CustFlowStep implements BetterjrEntity,Comparable{
    public static final String selectKey="CustFlowStep.id";
    /**
     * 流程step编号
     */
    @JsonIgnore
    @Id
    @Column(name = "ID",  columnDefinition="INTEGER" )
    @MetaData( value="流程step编号", comments = "流程step编号")
    private Long id;

    /**
     * 流程基本信息编号
     */
    @Column(name = "L_FLOWBASE_ID",  columnDefinition="INTEGER" )
    @MetaData( value="流程基本信息编号", comments = "流程基本信息编号")
    private Long flowBaseId;

    /**
     * 节点名称
     */
    @Column(name = "C_NODE_NAME",  columnDefinition="VARCHAR" )
    @MetaData( value="节点名称", comments = "节点名称")
    private String nodeName;

    /**
     * 节点编号
     */
    @Column(name = "L_NODE_ID",  columnDefinition="INTEGER" )
    @MetaData( value="节点编号", comments = "节点编号")
    private Long nodeId;
    
    /**
     * 节点角色
     */
    @Column(name = "C_NODE_ROLE",  columnDefinition="VARCHAR" )
    @MetaData( value="节点角色", comments = "节点角色")
    private String nodeRole;

    /**
     * 审批方式 01 串行 02 并行
     */
    @Column(name = "C_AUDIT_TYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="审批方式 serial, 串行 parallel 并行", comments = "审批方式 serial, 串行 parallel 并行")
    private String auditType;

    /**
     * step顺序
     */
    @Column(name = "N_ORDER_NUM",  columnDefinition="INTEGER" )
    @MetaData( value="step顺序", comments = "step顺序")
    private Integer orderNum;
    
    @Transient
    private List<CustFlowStepApprovers> stepApprovers;
    @Transient
    @JsonIgnore
    private CustFlowNodeData stepNode;

    private static final long serialVersionUID = 1469677920734L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFlowBaseId() {
        return flowBaseId;
    }

    public void setFlowBaseId(Long flowBaseId) {
        this.flowBaseId = flowBaseId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType ;
    }
    


    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public List<CustFlowStepApprovers> getStepApprovers() {
        return stepApprovers;
    }

    public void setStepApprovers(List<CustFlowStepApprovers> stepApprovers) {
        this.stepApprovers = stepApprovers;
    }

    public CustFlowNodeData getStepNode() {
        return stepNode;
    }

    public void setStepNode(CustFlowNodeData stepNode) {
        this.stepNode = stepNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowBaseId=").append(flowBaseId);
        sb.append(", nodeName=").append(nodeName);
        sb.append(", nodeRole=").append(nodeRole);
        sb.append(", nodeId=").append(nodeId);
        sb.append(", auditType=").append(auditType);
        sb.append(", orderNum=").append(orderNum);
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
        CustFlowStep other = (CustFlowStep) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowBaseId() == null ? other.getFlowBaseId() == null : this.getFlowBaseId().equals(other.getFlowBaseId()))
            && (this.getNodeName() == null ? other.getNodeName() == null : this.getNodeName().equals(other.getNodeName()))
            && (this.getNodeId() == null ? other.getNodeId() == null : this.getNodeId().equals(other.getNodeId()))
            && (this.getAuditType() == null ? other.getAuditType() == null : this.getAuditType().equals(other.getAuditType()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowBaseId() == null) ? 0 : getFlowBaseId().hashCode());
        result = prime * result + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        result = prime * result + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        result = prime * result + ((getAuditType() == null) ? 0 : getAuditType().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        return result;
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof CustFlowStep){
			return this.getOrderNum().compareTo(((CustFlowStep)o).getOrderNum());
		}
		return 1;
	}
}