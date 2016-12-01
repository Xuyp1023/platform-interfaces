package com.betterjr.modules.customer;

import java.util.Map;

public interface ICustOpenAccountService2 {
    
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
     * 开户申请提交
     */
    public String webSaveOpenAccountApply(Map<String, Object> anMap, Long anOperId, String anFileList);

    /**
     * 开户信息修改保存
     */
    public String webSaveModifyOpenAccount(Map<String, Object> anAnMap, Long anId, String anFileList);

    /**
     * 代录开户资料申请提交
     */
    public String webSaveOpenAccountInfoByInstead(Map<String, Object> anMap, Long anInsteadRecordId, String anFileList);

    /**
     * 开户资料暂存
     */
    public String webSaveOpenAccountInfo(Map<String, Object> anMap, Long anId, String anFileList);

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
}
