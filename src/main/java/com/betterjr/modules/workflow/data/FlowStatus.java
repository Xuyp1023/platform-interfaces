package com.betterjr.modules.workflow.data;

import java.util.Date;

import com.betterjr.common.utils.reflection.ReflectionUtils;

/**
 * 流程状态
1.流程名称
2.流程类型
3.启动时间
4.处理时间
5.启动人
6.当前处理人
7.当前任务
 * @author hewei
 *
 */
public class FlowStatus {
    String flowName;
    String flowType;
    Date createTime;
    Date lastUpdateTime;
    String createOperator;
    String operator;
    String currentTaskName;
    
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
    public String getCurrentTaskName() {
        return currentTaskName;
    }
    public void setCurrentTaskName(String currentTaskName) {
        this.currentTaskName = currentTaskName;
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
