package com.betterjr.modules.workflow;

import java.util.List;
import java.util.Map;

import com.betterjr.mapper.pagehelper.Page;
import com.betterjr.modules.workflow.data.CustFlowNodeData;
import com.betterjr.modules.workflow.data.FlowInput;
import com.betterjr.modules.workflow.data.FlowStatus;

public interface IFlowService {
    /**
     * 保存流程配置
     * @param base
     */
    public String webSaveProcess(Map base);

    /**
     * 读取流程配置，根据流程类型
     */
    public String webFindProcessByType(String flowType);

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
     * 所有需要审批的任务-当前用户
     * @param page
     * @return
     */
    public String webQueryCurrentUserWorkTask(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 所有审批历史数据-当前用户
     * @param page
     * @return
     */
    public String webQueryCurrentUserHistoryWorkTask(Map<String, Object> anMap, int anFlag, int anPageNum,
            int anPageSize);

    /**
     * 查询监控人所属流程
     */
    public String webQueryWorkTaskByMonitor(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /*
     * 流程监控-修改流程审批人
     */
    public String webChangeProcessAudit(String[] actorIds, String flowOrderId);

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
     * 显示流程图当前节点tips（操作人，抵达时间）
     */
    public String webFindTipsJson(String businessId, String taskName);

    /**
     * 显示流程图
     */
    public String webFindFlowJson(String businessId);

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
    public Page<FlowStatus> queryCurrentUserWorkTask(Page page, FlowStatus search);

    /**
     * 当前需要审批的任务-流程
     * @param page
     * @return
     */
    public Page<FlowStatus> queryCurrentWorkTask(Page page, FlowStatus search);

    /**
     * 当前用户审批历史数据,
     * @param page
     * @return
     */
    public Page<FlowStatus> queryCurrentUserHistoryWorkTask(Page page, FlowStatus search);

    /**
     * 根据流程类型得到所有节点
     */
    public List<CustFlowNodeData> findFlowNodesByType(String flowType);
}
