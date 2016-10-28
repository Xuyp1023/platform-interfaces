package com.betterjr.modules.wechat;

import java.util.Map;

public interface IWeChatCustEnrollService {
    /**
     * 获取当前微信用户开户信息
     */
    public String webFindCustEnroll(String anOpenId);

    /**
     * 客户微信端开户
     */
    public String webAddCustEnroll(Map<String, Object> anMap, String anOpenId, String anFileList);

}
