package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 开户流水
 *
 * @author liuwl
 *
 */
public interface ICustOpenAccountService {

    /**
     * 开户资料读取
     *
     * @return
     */
    public String webFindOpenAccountInfo();

    /**
     * 开户资料读取
     *
     * @return
     */
    public String webFindOpenAccountInfo(Long anId);

    /**
     * 开户资料暂存
     *
     * @param anMap
     * @return
     */
    public String webSaveOpenAccountInfo(Map<String, Object> anMap, Long anId, String anFileList);

    /**
     * 开户申请
     *
     * @param anMap
     * @param anId
     * @return
     */
    public String webSaveOpenAccountApply(Map<String, Object> anMap, Long anId, String anFileList);

    /**
     * 开户申请待审批列表
     *
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryOpenAccountApply(String anFlag, int anPageNum, int anPageSize);

    /**
     * 开户审核生效
     *
     * @param anId
     * @param anAuditOpinion
     * @return
     */
    public String webSaveAuditOpenAccountApply(Long anId, String anAuditOpinion);

    /**
     * 开户申请驳回
     *
     * @param anId
     * @param anAuditOpinion
     * @return
     */
    public String webSaveRefuseOpenAccountApply(Long anId, String anAuditOpinion);

    /**
     * 代录开户资料提交
     *
     * @param anMap
     * @param anInsteadId:代录ID
     * @param anFileList
     * @return
     */
    public String webSaveOpenAccountInfoByInstead(Map<String, Object> anMap, Long anInsteadId, String anFileList);

    /**
     * 代录开户资料读取
     *
     * @param anInsteadId:代录ID
     * @return
     */
    public String webFindOpenAccountInfoByInsteadId(Long anInsteadId);

    /**
     * 开户审批流程查询
     *
     * @param anCustNo
     * @return
     */
    public String webQueryAuditWorkflow(Long anCustNo);

    /**
     * 开户审批流程查询
     *
     * @param anOpenAccountId
     * @return
     */
    public String webQueryAuditWorkflowById(Long anOpenAccountId);

}
