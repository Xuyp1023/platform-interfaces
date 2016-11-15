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
    public String webSaveOpenAccountApply(Map<String, Object> anMap, String anFileList);

    /**
     * 开户信息修改保存
     */
    public String webSaveModifyOpenAccount(Map<String, Object> anAnMap, Long anId, String anFileList);

}
