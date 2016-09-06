package com.betterjr.modules.workflow.data;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.betterjr.common.mapper.CustDateToStrJsonSerializer;
import com.betterjr.common.utils.reflection.ReflectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/*
 * 流程审批历史：
1.流程节点
2.流程审批人
3.审批结果
4.审批意见
5.审批时间
 */
public class TaskAuditHistory implements Serializable{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String flowNodeName;
	private Long flowNodeId;
	private String operator;
	private FlowCommand command;
	private String reason;
	
	@JsonSerialize(using = CustDateToStrJsonSerializer.class)
	private Date auditDate;
	public String getFlowNodeName() {
		return flowNodeName;
	}
	public void setFlowNodeName(String flowNodeName) {
		this.flowNodeName = flowNodeName;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public FlowCommand getCommand() {
		return command;
	}
	public void setCommand(FlowCommand command) {
		this.command = command;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	
	public Long getFlowNodeId() {
        return flowNodeId;
    }
    public void setFlowNodeId(Long flowNodeId) {
        this.flowNodeId = flowNodeId;
    }
    public String toString(){
	    StringBuilder sb=new StringBuilder();
        try {
            ReflectionUtils.fieldToString(sb, this);
            return sb.toString();
        }
        catch (Exception e) {
            return "toString error";
        }
	}

}
