package com.betterjr.modules.workflow;

import java.util.List;
import java.util.Map;

import com.betterjr.mapper.pagehelper.Page;
import com.betterjr.modules.workflow.data.FlowInput;
import com.betterjr.modules.workflow.data.FlowStatus;
import com.betterjr.modules.workflow.data.TaskAuditHistory;
import com.betterjr.modules.workflow.entity.CustFlowNode;


public interface IFlowService {
    /**
     * 保存流程配置
     * @param base
     */
    public String webSaveProcess(Map base) ;
    /**
     * 所有需要审批的任务
     * @param page
     * @return
     */
    public String webQueryWorkTask(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);
    /**
     * 所有审批历史数据
     * @param page
     * @return
     */
    public String webQueryHistoryWorkTask(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询监控人所属流程
     */
    public String webQueryWorkTaskByMonitor(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize) ;
    
    /*
     * 流程监控-修改流程审批人
     */
    public String webSaveProcessAudit(String[] operators);
    
    /**
     * 新增流程节点
     */
    public String webAddFlowNode(Map<String, Object> anMap);
    
    /**
     * 编辑流程节点
     */
    public String webSaveFlowNode(Map<String, Object> anMap);
    
    /**
     * 删除流程节点
     */
    public String webDeleteFlowNode(Map<String, Object> anMap);
    
    /**
     * 当前流程已经执行的历史详情
     * @param businessId
     * @return
     */
    public String webFindExecutedHistory(Long businessId);
    /**
     * 当前流程当前节点之前的流程节点详情
     * @param businessId
     * @return
     */
    public String webFindExecutedNodes(Long businessId);
    
    /**
     * 查询金额分段
     * 
     * @param businessId
     * @return
     */
    public String webFindMoneyClass();
    /**
     * 查询系统节点
     * @param businessId
     * @return
     */
    public String webFindSysNode(String flowType);
    /**
     * 根据流程类型得到所有节点
     */
    public String webFindFlowNodesByType(String flowType); 
    /**
     * 执行任务
     * @param input
     */
    public void exec(FlowInput input);
    /**
     * 启动流程
     * @param input
     */
    public void start(FlowInput input);
    /**
     * 当前用户需要审批的任务
     * @param page
     * @return
     */
    public Page<FlowStatus> queryCurrentUserWorkTask(Page page,FlowStatus search);
    /**
     * 当前用户审批历史数据,
     * @param page
     * @return
     */
    public Page<FlowStatus> queryCurrentUserHistoryWorkTask(Page page,FlowStatus search);
    /**
     * 根据流程类型得到所有节点
     */
    public List<CustFlowNode> findFlowNodesByType(String flowType); 
}
