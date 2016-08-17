package com.betterjr.modules.workflow.entity;

import com.betterjr.common.annotation.*;
import com.betterjr.common.entity.BetterjrEntity;
import javax.persistence.*;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_node")
public class CustFlowNode implements BetterjrEntity {
    
    public static final String selectKey="CustFlowNode.id";
    /**
     * 节点编号
     */
    @Id
    @Column(name = "ID",  columnDefinition="INTEGER" )
    @MetaData( value="节点编号", comments = "节点编号")
    private Long id;

    /**
     * 系统节点编号
     */
    @Column(name = "L_SYS_NODE_ID",  columnDefinition="INTEGER" )
    @MetaData( value="系统节点编号", comments = "系统节点编号")
    private Long sysNodeId;
    
    /**
     * 系统节点名称
     */
    @Column(name = "C_SYS_NODE_NAME",  columnDefinition="VARCHAR" )
    @MetaData( value="系统节点名称", comments = "系统节点名称")
    private String sysNodeName;

    /**
     * 自定义节点名称
     */
    @Column(name = "C_NODE_CUSTOM_NAME",  columnDefinition="VARCHAR" )
    @MetaData( value="自定义节点名称", comments = "自定义节点名称")
    private String nodeCustomName;

    /**
     * 是否必选，0=不是必选，1=必选
     */
    @Column(name = "C_MUST",  columnDefinition="VARCHAR" )
    @MetaData( value="是否必选", comments = "是否必选，0=不是必选，1=必选")
    private String must;

    private static final long serialVersionUID = 1469677920732L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysNodeId() {
        return sysNodeId;
    }

    public void setSysNodeId(Long sysNodeId) {
        this.sysNodeId = sysNodeId;
    }

    public String getSysNodeName() {
        return sysNodeName;
    }

    public void setSysNodeName(String sysNodeName) {
        this.sysNodeName = sysNodeName;
    }

    public String getNodeCustomName() {
        return nodeCustomName;
    }

    public void setNodeCustomName(String nodeCustomName) {
        this.nodeCustomName = nodeCustomName == null ? null : nodeCustomName.trim();
    }

    public String getMust() {
        return must;
    }

    public void setMust(String must) {
        this.must = must == null ? null : must.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysNodeId=").append(sysNodeId);
        sb.append(", nodeCustomName=").append(nodeCustomName);
        sb.append(", sysNodeName=").append(sysNodeName);
        sb.append(", must=").append(must);
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
        CustFlowNode other = (CustFlowNode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSysNodeId() == null ? other.getSysNodeId() == null : this.getSysNodeId().equals(other.getSysNodeId()))
            && (this.getNodeCustomName() == null ? other.getNodeCustomName() == null : this.getNodeCustomName().equals(other.getNodeCustomName()))
            && (this.getMust() == null ? other.getMust() == null : this.getMust().equals(other.getMust()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSysNodeId() == null) ? 0 : getSysNodeId().hashCode());
        result = prime * result + ((getNodeCustomName() == null) ? 0 : getNodeCustomName().hashCode());
        result = prime * result + ((getMust() == null) ? 0 : getMust().hashCode());
        return result;
    }
}