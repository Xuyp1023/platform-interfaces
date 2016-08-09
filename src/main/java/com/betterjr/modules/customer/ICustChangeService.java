package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 变更服务
 * @author liuwl
 *
 */
public interface ICustChangeService {
    /**
     * 查询变更申请列表 供审核使用  审核状态排序
     * @return
     */
    public String webQueryChangeApplyList(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 变更申请 审核通过
     * @return
     */
    public String webAuditPassChangeApply(Long anId,  String anReason);
    
    /**
     * 变更申请 审核驳回
     * @return
     */
    public String webAuditRejectChangeApply(Long anId, String anReason);
    
    /**
     * 变更申请 作废
     * @return
     */
    public String webCancelChangeApply(Long anId, String anReason);
}
