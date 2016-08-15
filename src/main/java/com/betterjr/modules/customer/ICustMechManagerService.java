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
     */
    public String webQueryManager(Long anCustNo);
    
    /**
     * 查询高管详情
     */
    public String webFindManager(Long anId);
    
    /**
     * 查询代录临时流水
     */
    public String webFindManagerTmp(Long anId);
    
    /**
     * 修改代录临时流水
     */
    public String webSaveManagerTmp(Map<String, Object> anParam, Long anId, String anFileList);
    
    /**
     * 变更高管-添加变更申请
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);
    
    /**
     * 变更高管-修改变更申请
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId);
    
    /**
     * 查询变更高管详情-变更临时流水表
     */
    public String webFindChangeApply(Long anId);
    
    /**
     * 查询高管变更列表
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 变更添加   记录添加的记录
     */
    public String webAddChangeManagerTmp(Map<String, Object> anParam, String anFileList);
    
    /**
     * 变更修改   记录从正式表修改的记录
     */
    public String webSaveChangeManagerTmp(Map<String, Object> anParam, String anFileList);
    
    /**
     * 变更删除   记录从正式表删除的记录
     */
    public String webDelChangeManagerTmp(Long anRefId);
    
    /**
     * 作废变更
     */
    public String webCancelChangeManagerTmp(Long anId);
    
    /**
     * 查询 变更 已录入未使用记录
     */
    public String webQueryNewChangeManagerTmp(Long anCustNo);
    
    /**
     * 查询 变更 流水记录列表
     */
    public String webQueryChangeManagerTmp(Long anApplyId);
    
    /**
     * 代录添加  记录新添加的代录记录
     */
    public String webAddInsteadManagerTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);
    
    /**
     * 代录修改   记录从正式表中修改的记录
     */
    public String webSaveInsteadManagerTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);
    
    /**
     * 代录删除   记录从正式表删除的记录
     */
    public String webDelInsteadManagerTmp(Long anRefId, Long anInsteadRecordId);
    
    /**
     * 作废变更
     */
    public String webCancelInsteadManagerTmp(Long anId, Long anInsteadRecordId);
    
    /**
     * 查询 代录 已录入未使用记录
     */
    public String webQueryInsteadManagerTmp(Long anInsteadRecordId);
    
    /**
     * 添加代录记录
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);
    
    /**
     * 修改代录记录
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);
    
    /**
     * 查询高管代表详情-临时流水表 
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);
}
