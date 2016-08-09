package com.betterjr.modules.workflow.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_sys_node")
public class CustFlowSysNode implements BetterjrEntity {
    /**
     * 系统节点编号
     */
    @Id
    @Column(name = "ID",  columnDefinition="INTEGER" )
    @MetaData( value="系统节点编号", comments = "系统节点编号")
    private Long id;

    /**
     * 类型名称 (当前系统中， 类型名称=流程类型)
     */
    @Column(name = "C_FLOW_TYPE_NAME",  columnDefinition="VARCHAR" )
    @MetaData( value="类型名称", comments = "类型名称")
    private String flowTypeName;

    /**
     * 流程类型
     */
    @Column(name = "C_FLOW_TYPE",  columnDefinition="VARCHAR" )
    @MetaData( value="流程类型", comments = "流程类型")
    private String flowType;

    /**
     * 系统节点名称
     */
    @Column(name = "C_NODE_NAME",  columnDefinition="VARCHAR" )
    @MetaData( value="系统节点名称", comments = "系统节点名称")
    private String nodeName;
    
    /**
     * 系统节点角色
     */
    @Column(name = "C_NODE_ROLE",  columnDefinition="VARCHAR" )
    @MetaData( value="系统节点角色", comments = "系统节点角色")
    private String nodeRole;

    private static final long serialVersionUID = 1469677920732L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlowTypeName() {
        return flowTypeName;
    }

    public void setFlowTypeName(String flowTypeName) {
        this.flowTypeName = flowTypeName == null ? null : flowTypeName.trim();
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType == null ? null : flowType.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flowTypeName=").append(flowTypeName);
        sb.append(", flowType=").append(flowType);
        sb.append(", nodeName=").append(nodeName);
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
        CustFlowSysNode other = (CustFlowSysNode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlowTypeName() == null ? other.getFlowTypeName() == null : this.getFlowTypeName().equals(other.getFlowTypeName()))
            && (this.getFlowType() == null ? other.getFlowType() == null : this.getFlowType().equals(other.getFlowType()))
            && (this.getNodeName() == null ? other.getNodeName() == null : this.getNodeName().equals(other.getNodeName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlowTypeName() == null) ? 0 : getFlowTypeName().hashCode());
        result = prime * result + ((getFlowType() == null) ? 0 : getFlowType().hashCode());
        result = prime * result + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        return result;
    }
}