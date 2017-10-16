package com.betterjr.modules.workflow.data;

import java.io.Serializable;

import com.betterjr.common.mapper.BeanMapper;
import com.betterjr.modules.workflow.entity.CustFlowNode;

public class CustFlowNodeData implements Serializable {

    /**
     * 节点编号
     */
    private Long id;

    /**
     * 系统节点编号
     */
    private Long sysNodeId;

    /**
     * 系统节点名称
     */
    private String sysNodeName;

    /**
     * 自定义节点名称
     */
    private String nodeCustomName;

    /**
     * 是否必选，0=不是必选，1=必选
     */
    private String must;

    /**
     * 类型名称 (当前系统中， 类型名称=流程类型)
     */
    private String flowTypeName;

    /**
     * 流程类型
     */
    private String flowType;

    /**
     * 系统节点角色
     */
    private String nodeRole;

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
        this.nodeCustomName = nodeCustomName;
    }

    public String getMust() {
        return must;
    }

    public void setMust(String must) {
        this.must = must;
    }

    public String getFlowTypeName() {
        return flowTypeName;
    }

    public void setFlowTypeName(String flowTypeName) {
        this.flowTypeName = flowTypeName;
    }

    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public CustFlowNode toEntity() {
        return BeanMapper.map(this, CustFlowNode.class);
    }
}
