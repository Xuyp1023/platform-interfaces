package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 联系人
 * @author liuwl
 *
 */
public interface ICustMechContacterService {

    /**
     * 查询联系人列表
     */
    public String webQueryContacter(Long anCustNo);

    /**
     * 查询联系人详情
     */
    public String webFindContacter(Long anId);

    /**
     * 查询联系人流水详情
     */
    public String webFindContacterTmp(Long anId);

    /**
     * 修改代录临时流水
     */
    public String webSaveContacterTmp(Map<String, Object> anParam, Long anId, String anFileList);

    /**
     * 变更联系人-添加变更申请
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);

    /**
     * 变更联系人-修改变更申请
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId);

    /**
     * 查询变更联系人详情-变更临时流水表
     */
    public String webFindChangeApply(Long anApplyId, Long anTmpId);

    /**
     * 查询联系人变更列表
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 变更添加   记录添加的记录
     */
    public String webAddChangeContacterTmp(Map<String, Object> anParam, String anFileList);

    /**
     * 变更修改   记录从正式表修改的记录
     */
    public String webSaveChangeContacterTmp(Map<String, Object> anParam, String anFileList);

    /**
     * 变更删除   记录从正式表删除的记录
     */
    public String webDeleteChangeContacterTmp(Long anRefId);

    /**
     * 作废变更
     */
    public String webCancelChangeContacterTmp(Long anId);

    /**
     * 查询 变更 已录入未使用记录
     */
    public String webQueryNewChangeContacterTmp(Long anCustNo);

    /**
     * 查询 变更 流水记录列表
     */
    public String webQueryChangeContacterTmp(Long anApplyId);

    /**
     * 代录添加  记录新添加的代录记录
     */
    public String webAddInsteadContacterTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 代录修改   记录从正式表中修改的记录
     */
    public String webSaveInsteadContacterTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 代录删除   记录从正式表删除的记录
     */
    public String webDeleteInsteadContacterTmp(Long anRefId, Long anInsteadRecordId);

    /**
     * 作废变更
     */
    public String webCancelInsteadContacterTmp(Long anId, Long anInsteadRecordId);

    /**
     * 查询 代录 已录入未使用记录
     */
    public String webQueryInsteadContacterTmp(Long anInsteadRecordId);

    /**
     * 添加代录记录
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);

    /**
     * 修改代录记录
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);

    /**
     * 查询联系人代表详情-临时流水表 
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);
}
