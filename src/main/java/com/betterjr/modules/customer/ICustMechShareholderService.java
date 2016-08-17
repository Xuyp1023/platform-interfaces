package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 股东
 * 
 * @author liuwl
 *
 */
public interface ICustMechShareholderService {

    /**
     * 查询股东列表
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryShareholder(Long anCustNo);
    
    /**
     * 查询股东详情
     */
    public String webFindShareholder(Long anId);
    
    /**
     * 查询股东流水详情
     */
    public String webFindShareholderTmp(Long anId);

    /**
     * 修改代录临时流水
     */
    public String webSaveShareholderTmp(Map<String, Object> anParam, Long anId, String anFileList);
    
    /**
     * 提交股东变更申请
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);
    
    /**
     * 变更股东-修改变更申请
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId);
    
    /**
     * 查询股东变更详情-变更临时流水表
     */
    public String webFindChangeApply(Long anApplyId, Long anTmpId);

    /**
     * 查询股东变更列表
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 变更添加   记录添加的记录
     */
    public String webAddChangeShareholderTmp(Map<String, Object> anParam, String anFileList);
    
    /**
     * 变更修改   记录从正式表修改的记录
     */
    public String webSaveChangeShareholderTmp(Map<String, Object> anParam, String anFileList);
    
    /**
     * 变更删除   记录从正式表删除的记录
     */
    public String webDeleteChangeShareholderTmp(Long anRefId);
    
    /**
     * 作废变更
     */
    public String webCancelChangeShareholderTmp(Long anId);
    
    /**
     * 查询股东变更记录,已录入未使用记录
     */
    public String webQueryNewChangeShareholderTmp(Long anCustNo);

    /**
     * 查询股东变更记录,流水记录列表
     */
    public String webQueryChangeShareholderTmp(Long anApplyId);


    /**
     * 代录添加  记录新添加的代录记录
     */
    public String webAddInsteadShareholderTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);
    
    /**
     * 代录修改   记录从正式表中修改的记录
     */
    public String webSaveInsteadShareholderTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);
    
    /**
     * 代录删除   记录从正式表删除的记录
     */
    public String webDeleteInsteadShareholderTmp(Long anRefId, Long anInsteadRecordId);
    
    /**
     * 作废变更
     */
    public String webCancelInsteadShareholderTmp(Long anId, Long anInsteadRecordId);
    
    /**
     * 查询 代录 已录入未使用记录
     */
    public String webQueryInsteadShareholderTmp(Long anInsteadRecordId);
    
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
