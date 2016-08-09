package com.betterjr.modules.workflow;

import java.util.List;
import java.util.Map;

import com.betterjr.mapper.pagehelper.Page;
import com.betterjr.modules.workflow.data.FlowInput;
import com.betterjr.modules.workflow.data.FlowStatus;
import com.betterjr.modules.workflow.data.TaskAuditHistory;


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
     * 流程监控-查询
     */
    public String webQueryWorkTaskByMonitor(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize) ;
    
    /*
     * 流程监控-修改流程审批人
     */
    public String webSaveProcessAudit(String[] operators);
    
    /**
     * 当前流程已经执行的流程节点详情
     * @param businessId
     * @return
     */
    public List<TaskAuditHistory> getExecutedHistory(Long businessId);
    /**
     * 当前流程已经执行的流程节点名称
     * @param businessId
     * @return
     */
    public List<String> getExecutedNodes(Long businessId);
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
    public Page<FlowStatus> queryCurrentUserWorkTask(Page<FlowStatus> page);
    /**
     * 当前用户审批历史数据
     * @param page
     * @return
     */
    public Page<FlowStatus> queryCurrentUserHistoryWorkTask(Page<FlowStatus> page);


}
