package com.betterjr.modules.customer.data;

public interface ICustAuditEntityFace {

    /**
     * 获取关联的实体ID信息
     * 
     * @return
     */
    Long getParentId();

    /**
     * 获取客户信息
     * 
     * @return
     */
    Long getCustNo();

    /**
     * 获取变更的附件ID信息
     * 
     * @return
     */
    Long getBatchNo();
}
