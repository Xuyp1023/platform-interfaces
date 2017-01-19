package com.betterjr.modules.customer;

import java.util.Map;

import com.betterjr.common.annotation.NoSession;
import com.betterjr.modules.customer.entity.CustOpenAccountTmp;

/**
 * 开户流水
 *
 * @author liuwl
 *
 */
public interface ICustOpenAccountService {
    
    /**
     * 检查申请机构名称是否存在
     */
    public String webCheckCustExistsByCustName(String anCustName);
    
    /**
     * 检查组织机构代码证是否存在
     */
    public String webCheckCustExistsByIdentNo(String anIdentNo);
    
    /**
     * 检查营业执照号码是否存在
     */
    public String webCheckCustExistsByBusinLicence(String anBusinLicence);
    
    /**
     * 检查银行账号是否存在
     */
    public String webCheckCustExistsByBankAccount(String anBankAccount);

    /**
     * 检查邮箱是否已注册
     */
    public String webCheckCustExistsByEmail(String anEmail);

    /**
     * 检查手机号码是否已注册
     */
    public String webCheckCustExistsByMobileNo(String anMobileNo);

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
    public String webSaveOpenAccountInfoByInstead(Map<String, Object> anMap, Long anInsteadRecordId, String anFileList);

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
    
    /**
     *读取开户的临时文件信息，用于远程开通业务
     * @param anCustNo 客户编号
     * @return
     */
    @NoSession
    public Map<String, Object> findOpenTempAccountInfo(Long anCustNo);
    
    
    /**
     * 开户申请提交
     */
    public String webSaveOpenAccountApplySubmit(Map<String, Object> anMap, Long anOperId, String anFileList);
    
    /**
     * 查询开户资料
     */
    public String webFindAccountTmpInfo(String anOpenId);
    
    /**
     * 根据开户id和文件id保存附件
     */
    public String webSaveSingleFileLink(Long anId,String anFileTypeName, String anFileMediaId);

    /**
     * 根据batchNo生成对应文件类型Map Json对象(微信使用)
     */
    public String webFindAccountFileByBatChNo(Long anBatchNo);
    
    public String findOpenAccountStatus(String anOpenId);

    /**
     * 发送手机短信验证码
     */
    public String webSendValidMessage(String anMobileNo);
    
    /**
     * 根据operOrg查询apply状态
     */
    public String webFindInsteadApplyStatus();

    /**
     * 查询开户信息 根据operOrg
     */
    public String webFindOpenAccoutnTmp();

    /**
     * 删除附件(微信)
     */
    public String webDeleteSingleFile(Long anId);

    /**
     * 微信查询开户成功后资料
     * --不能直接通过wechat标识去查询tmp表，因为若是微信绑定已开户账户，则tmp表中wechat标识为空--
     */
    public String webFindSuccessAccountInfo(String anOpenId);

    /**
     * 根据custNo查询开户信息
     */
    public CustOpenAccountTmp findAccountInfoByCustNo(Long anCustNo);

    /**
     * 保理公司查询客户信息
     */
    public String webQueryCustInfoByPlatform(String anFlag, int anPageNum, int anPageSize);
    
}
