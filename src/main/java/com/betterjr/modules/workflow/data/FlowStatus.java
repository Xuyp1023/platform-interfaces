package com.betterjr.modules.workflow.data;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.betterjr.common.mapper.CustDateJsonSerializer;
import com.betterjr.common.mapper.CustDateToStrJsonSerializer;
import com.betterjr.common.utils.reflection.ReflectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 流程状态
1.流程名称
2.流程类型
3.启动时间
4.处理时间
5.启动人
6.当前处理人
7.当前任务
8.businessId
 * @author hewei
 *
 */
public class FlowStatus implements Serializable{
    String flowName;
    String flowType;
    @JsonSerialize(using = CustDateToStrJsonSerializer.class)
    Date createTime;
    @JsonSerialize(using = CustDateToStrJsonSerializer.class)
    Date lastUpdateTime;
    String createOperator;
    String operator;
    String currentNodeName;//等于流程节点自定义名称
    Long currentNodeId;//节点id 
    Long businessId;
    
    //查询启动时间 起止
    String GTFlowDate;
    String LTFlowDate;
    
    public String getFlowName() {
        return flowName;
    }
    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }
    public String getFlowType() {
        return flowType;
    }
    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public String getCreateOperator() {
        return createOperator;
    }
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public String getCurrentNodeName() {
        return currentNodeName;
    }
    public void setCurrentNodeName(String currentNodeName) {
        this.currentNodeName = currentNodeName;
    }
    public Long getBusinessId() {
        return businessId;
    }
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }
    public Long getCurrentNodeId() {
        return currentNodeId;
    }
    public void setCurrentNodeId(Long currentNodeId) {
        this.currentNodeId = currentNodeId;
    }
    public String getGTFlowDate() {
        return GTFlowDate;
    }
    public void setGTFlowDate(String gTFlowDate) {
        GTFlowDate = gTFlowDate;
    }
    public String getLTFlowDate() {
        return LTFlowDate;
    }
    public void setLTFlowDate(String lTFlowDate) {
        LTFlowDate = lTFlowDate;
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
