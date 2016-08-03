package com.betterjr.modules.customer;

/**
 * 审核日志 服务
 * @author liuwl
 *
 */
public interface ICustAuditLogService {
    /**
     * 查询审核记录列表
     * @param anBusinId
     * @param anAuditType
     * @return
     */
    public String webQueryAuditLogList(Long anBusinId, String anAuditType, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 审核记录详情
     * @param anId
     * @return
     */
    public String webFindAuditLog(Long anId);
}
