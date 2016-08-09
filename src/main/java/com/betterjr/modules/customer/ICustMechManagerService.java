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
     * 查询代录临时流水
     * @param anCustNo
     * @return
     */
    public String webFindManagerTmp(Long anId);
    
    /**
     * 修改代录临时流水
     * @param anParam
     * @param anId 
     * @return
     */
    public String webSaveManagerTmp(Map<String, Object> anParam, Long anId);
    
    /**
     * 变更高管-添加变更申请
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);
    
    /**
     * 变更高管-修改变更申请
     * @return
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId);
    
    /**
     * 查询变更高管详情-变更临时流水表
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindChangeApply(Long anId);
    
    /**
     * 查询高管变更列表
     * @param anCustNo
     * @return
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 变更添加   记录添加的记录
     * @return
     */
    public String webAddChangeManagerTmp(Map<String, Object> anParam);
    
    /**
     * 变更修改   记录从正式表修改的记录
     * @return
     */
    public String webSaveChangeManagerTmp(Map<String, Object> anParam);
    
    /**
     * 变更删除   记录从正式表删除的记录
     * @param anId
     * @return
     */
    public String webDelChangeManagerTmp(Long anRefId);
    
    /**
     * 作废变更
     * @param anId
     * @return
     */
    public String webCancelChangeManagerTmp(Long anId);
    
    /**
     * 查询 变更 已录入未使用记录
     * @param anCustNo
     * @return
     */
    public String webQueryNewChangeManagerTmp(Long anCustNo);
    
    /**
     * 代录添加  记录新添加的代录记录
     * @return
     */
    public String webAddInsteadManagerTmp(Map<String, Object> anParam);
    
    /**
     * 代录修改   记录从正式表中修改的记录
     * @return
     */
    public String webSaveInsteadManagerTmp(Map<String, Object> anParam, Long anId);
    
    /**
     * 代录删除   记录从正式表删除的记录
     * @param anId
     * @return
     */
    public String webDelInsteadManagerTmp(Long anRefId);
    
    /**
     * 作废变更
     * @param anId
     * @return
     */
    public String webCancelInsteadManagerTmp(Long anId);
    
    /**
     * 查询 代录 已录入未使用记录
     * @param anCustNo
     * @return
     */
    public String webQueryNewInsteadManagerTmp(Long anCustNo);
    
    /**
     * 添加代录记录
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);
    
    /**
     * 修改代录记录
     * @param anInsteadId
     * @param anCustNo
     * @return
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);
    
    /**
     * 查询高管代表详情-临时流水表 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);
    
    
}
