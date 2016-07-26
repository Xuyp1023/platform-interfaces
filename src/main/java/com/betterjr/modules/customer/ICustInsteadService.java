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
    public String webAddInsteadApply(Map<String, Object> anParam);
    
    /**
     * 查询代录申请列表 全部
     */
    public String webQueryInsteadApplyList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
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
     * 代录申请 审核通过
     * @return
     */
    public String webAuditPassInsteadApply(Long anId);
    /**
     * 代录申请 审核驳回
     * @return
     */
    public String webAuditRejectInsteadApply(Long anId);
    
    /**
     * 代录申请 复核通过
     * @return
     */
    public String webReviewPassInsteadApply(Long anId);
    
    /**
     * 代录申请 复核驳回
     * @return
     */
    public String webReviewRejectInsteadReject(Long anId);
    
    /**
     * 代录申请 确认通过
     * @return
     */
    public String webConfirmPassInsteadApply(Long anId);
    
    /**
     * 代录申请 确认驳回
     * @return
     */
    public String webConfirmRejectInsteadApply(Long anId);
    
    /**
     * 代录申请 作废
     * @return
     */
    public String webCancelInsteadApply(Long anId);
    
    /**
     * 代录项目 复核通过
     */
    public String webReviewPassInsteadRecord(Long anId);
    
    /**
     * 代录项目 复核驳回
     * @return
     */
    public String webReviewRejectInsteadRecord(Long anId);
    
    /**
     * 代录项目 确认通过
     * @return
     */
    public String webConfirmPassInsteadRecord(Long anId);
    
    /**
     * 代录项目 确认驳回
     * @return
     */
    public String webConfirmRejectInsteadRecord(Long anId);
    
    /**
     * 代录项目 作废
     * @return
     */
    public String webCancelInsteadRecord(Long anId);
}
