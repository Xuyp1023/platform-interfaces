package com.betterjr.modules.customer;

/**
 * 审核日志 服务
 * @author liuwl
 *
 */
public interface ICustAuditLogService {
    /**
     * 查询开户审核记录列表
     * @param anBusinId
     * @return
     */
    public String webQueryAuditLogOpenAccountList(Long anBusinId);

    /**
     * 查询代录申请审核记录列表
     * @param anBusinId
     * @return
     */
    public String webQueryAuditLogInsteadApplyList(Long anBusinId);

    /**
     * 查询代录记录审核记录列表
     * @param anBusinId
     * @return
     */
    public String webQueryAuditLogInsteadRecordList(Long anBusinId);

    /**
     * 查询变更申请审核记录列表
     * @param anBusinId
     * @return
     */
    public String webQueryAuditLogChangeApplyList(Long anBusinId);

    /**
     * 审核记录详情
     * @param anId
     * @return
     */
    public String webFindAuditLog(Long anId);
}
