package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 高管
 * 
 * @author liuwl
 *
 */
public interface ICustMechManagerService {

    /**
     * 查询高管列表
     * @param anCustNo
     * @return
     */
    public String webQueryManager(Long anCustNo);
    
    /**
     * 查询高管详情
     * @param anId
     * @param anCustNo
     * @return
     */
    public String webFindManager(Long anId);
    
    /**
     * 变更高管-变更临时流水表
     * anOperType: 0 新增  1 修改  2 删除
     * @param anParam
     * @param anCustNo
     * @param anId
     * @param anOperType
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);
    
    /**
     * 添加一条流水信息
     * @return
     */
    public String webAddInsteadManagerTmp(Map<String, Object> anParam);
    
    /**
     * 保存一条流水信息修改
     * @return
     */
    public String webSaveInsteadManagerTmp(Map<String, Object> anParam, Long anId);
    
    /**
     * 删除一条信息
     * @param anId
     * @return
     */
    public String webDelInsteadManagerTmp(Map<String, Object> anParam);
    
    /**
     * 添加一条流水信息
     * @return
     */
    public String webAddChangeManagerTmp(Map<String, Object> anParam);
    
    /**
     * 保存一条流水信息修改
     * @return
     */
    public String webSaveChangeManagerTmp(Map<String, Object> anParam, Long anId);
    
    /**
     * 删除一条信息
     * @param anId
     * @return
     */
    public String webDelChangeManagerTmp(Map<String, Object> anParam);
    
    /**
     * 查询已录入未使用流水列表
     * @param anCustNo
     * @return
     */
    public String webQueryManagerTmpList(Long anCustNo);
    
    /**
     * 删除已录入未使用流水列表
     * @param anCustNo
     * @return
     */
    public String webDelManagerTmpList(Long anCustNo);
    
    /**
     * 检测是否有未使用流水
     * @param anCustNo
     * @return
     */
    public String webCheckManagerTmpList(Long anCustNo);
    
    /**
     * 查询变更高管详情-变更临时流水表
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindChangeApply(Long anCustNo, Long anId);
    
    /**
     * 查询高管变更列表-临时流水表+正式表
     * @param anCustNo
     * @return
     */
    public String webQueryChangeApply(Long anCustNo);
    
    /**
     * 确认变更高管-变更正式表
     * 临时流水表->正式表
     * @param anChangeId
     * @param anCustNo
     * @return
     */
    public String webConfirmChangeApply(Long anChangeId, Long anCustNo);
    
    /**
     * 作废变更高管-变更正式表
     * @param anChangeId
     * @param anCustNo
     * @return
     */
    public String webCancelChangeApply(Long anChangeId, Long anCustNo);
    
    /**
     * 代录高管-代录临时流水表
     * anOperType: 0 新增  1 修改  2 删除
     * @param anParam
     * @param anCustNo
     * @param anId
     * @param anOperType
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anCustNo, Long anId, Long anOperType);
    
    /**
     * 查询高管代录列表-临时流水表+正式表
     * @param anInsteadId
     * @param anCustNo
     * @return
     */
    public String webQueryInsteadRecord(Long anInsteadId, Long anCustNo);
    
    /**
     * 查询高管代表详情-临时流水表 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindInsteadRecord(Long anCustNo, Long anId);
    
    /**
     * 确认代录高管-代录正式表
     * 临时流水表->正式表
     * @param anInsteadId
     * @param anCustNo
     * @return
     */
    public String webConfirmInsteadRecord(Long anInsteadId, Long anCustNo);
    
    /**
     * 作废代录高管-代录临时表
     * @param anInsteadId
     * @param anCustNo
     * @return
     */
    public String webCancelInsteadRecord(Long anInsteadId, Long anCustNo);
    
}
