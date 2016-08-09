package com.betterjr.modules.workflow.data;

import java.util.Date;

import com.betterjr.common.utils.reflection.ReflectionUtils;

/*
 * 流程审批历史：
1.流程节点
2.流程审批人
3.审批结果
4.审批意见
5.审批时间
 */
public class TaskAuditHistory {
	private String flowNodeName;
	private String operator;
	private FlowCommand command;
	private String reason;
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
