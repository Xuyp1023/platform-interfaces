package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 代录服务
 * @author liuwl
 *
 */
public interface ICustInsteadService {
    
    /**
     * 申请代录
     * @return
     */
    public String webAddInsteadApply(Map<String, Object> anParam, String anFileList);
    
    /**
     * 代录申请-修改
     * @param anAnParam
     * @param anApplyId
     * @param anFileList
     * @return
     */
    public String webSaveInsteadApply(Map<String, Object> anParam, Long anApplyId, String anFileList);
    
    /**
     * 代录申请-详情
     * @param anApplyId
     * @return
     */
    public String webFindInsteadApply(Long anApplyId);
    
    /**
     * 查询代录申请列表 全部
     */
    public String webQueryInsteadApplyList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询代录申请列表 全部
     */
    public String webQueryInsteadApplyOwnList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询代录申请列表  待审核
     * @return
     */
    public String webQueryInsteadApplyAuditList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询代录申请列表 待复核
     * @return
     */
    public String webQueryInsteadApplyReviewList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询代录申请列表 待确认
     * @return
     */
    public String webQueryInsteadApplyConfirmList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查找代录项目列表
     * @param anId
     * @return
     */
    public String webQueryInsteadRecordByApply(Long anId);
    
    /**
     * 代录申请 审核通过
     * @return
     */
    public String webAuditPassInsteadApply(Long anId, String anReason);
    /**
     * 代录申请 审核驳回
     * @return
     */
    public String webAuditRejectInsteadApply(Long anId, String anReason);
    
    /**
     * 代录申请 复核提交
     * @return
     */
    public String webSubmitReviewInsteadApply(Long anId);
    
    /**
     * 代录申请 确认提交
     * @return
     */
    public String webSubmitConfirmInsteadApply(Long anId);
    
    /**
     * 代录申请 录入提交
     * @param anId
     * @return
     */
    public String webSubmitTypeInInsteadApply(Long anId);
    
    /**
     * 代录申请 复核通过
     * @return
     */
    public String webReviewPassInsteadApply(Long anId, String anReason);
    
    /**
     * 代录申请 复核驳回
     * @return
     */
    public String webReviewRejectInsteadApply(Long anId, String anReason);
    
    /**
     * 代录申请 确认通过
     * @return
     */
    public String webConfirmPassInsteadApply(Long anId, String anReason);
    
    /**
     * 代录申请 确认驳回
     * @return
     */
    public String webConfirmRejectInsteadApply(Long anId, String anReason);
    
    /**
     * 代录申请 作废
     * @return
     */
    public String webCancelInsteadApply(Long anId, String anReason);
    
    /**
     * 代录项目 复核通过
     */
    public String webReviewPassInsteadRecord(Long anId, String anReason);
    
    /**
     * 代录项目 复核驳回
     * @return
     */
    public String webReviewRejectInsteadRecord(Long anId, String anReason);
    
    /**
     * 代录项目 确认通过
     * @return
     */
    public String webConfirmPassInsteadRecord(Long anId, String anReason);
    
    /**
     * 代录项目 确认驳回
     * @return
     */
    public String webConfirmRejectInsteadRecord(Long anId, String anReason);
    
    /**
     * 代录项目 作废
     * @return
     */
    public String webCancelInsteadRecord(Long anId, String anReason);

}
