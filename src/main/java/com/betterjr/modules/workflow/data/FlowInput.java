package com.betterjr.modules.workflow.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import org.snaker.engine.helper.JsonHelper;

import com.google.common.collect.Maps;

/*
 * 
 * 流程输入参数：
1.流程指令
2.流程类型
3.金额
4.当前操作人
5.业务id
6.回滚目标节点（为空则默认为回滚至上一步）
7.审批意见
 */
public class FlowInput implements Serializable{
    public static final String CommandPara="command";
    public static final String TypePara="type";
    public static final String MoneyPara="money";
    public static final String OperatorPara="operator";
    public static final String BusinessIdPara="businessId";
    public static final String RollbackNodeIdPara="rollbackNodeId";
    public static final String ReasonPara="reason";
   
   
	private FlowCommand command; //审批必填
	private FlowType type;//启动必填
	private BigDecimal money;//启动&审批必填
	private String operator;//启动&审批必填
	private Long businessId;//启动&审批必填
	private String rollbackNodeId;//审批可选
	private String reason;//审批可选

	
	public FlowCommand getCommand() {
		return command;
	}
	public void setCommand(FlowCommand command) {
		this.command = command;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getBusinessId() {
        return businessId;
    }
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }
    public String getRollbackNodeId() {
		return rollbackNodeId;
	}
	public void setRollbackNodeId(String rollbackNodeId) {
		this.rollbackNodeId = rollbackNodeId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public FlowType getType() {
        return type;
    }
    public void setType(FlowType type) {
        this.type = type;
    }

    public Map<String, Object> toExecMap(){
	    Map<String, Object> map = Maps.newHashMap();
	    map.put(FlowInput.CommandPara, this.getCommand()==null?null:this.getCommand().name());
	    map.put(FlowInput.BusinessIdPara, this.getBusinessId());
	    map.put(FlowInput.MoneyPara, this.getMoney());
	    map.put(FlowInput.OperatorPara, this.getOperator());
	    map.put(FlowInput.ReasonPara, this.getReason());
	    map.put(FlowInput.RollbackNodeIdPara, this.getRollbackNodeId());
	    return map;
	}
    
    public Map<String, Object> toStartMap(){
        Map<String, Object> map = Maps.newHashMap();
        map.put(FlowInput.TypePara,this.getType()==null?null:this.getType().name());
        map.put(FlowInput.BusinessIdPara, this.getBusinessId());
        map.put(FlowInput.MoneyPara, this.getMoney());
        map.put(FlowInput.OperatorPara, this.getOperator());
        return map;
    }
	
	public static FlowInput toObject(String variable){
	    return JsonHelper.fromJson(variable, FlowInput.class);
	}

}
