package com.betterjr.modules.customer;

import java.util.Map;

public interface ICustInsteadService2 {
    /**
     * PC申请代录
     * @return
     */
    public String webAddInsteadApply(String anCustName, Long anOperId, String anFileList);

    /**
     * 微信申请代录
     * @return
     */
    public String webWechatAddInsteadApply(Map<String, Object> anMap, Long anId, String anFileList);

    /**
     * 查询代录申请
     */
    public String webFindInsteadApplyByAccountTmpId(Long anId);
}
