package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 银行帐户
 * @author liuwl
 *
 */
public interface ICustMechBankAccountService {

    /**
     * 查询银行账户列表
     * @param anCustNo
     * @return
     */
    public String webQueryBankAccount(Long anCustNo);
    
    /**
     * 查询银行账户详情
     * @param anId
     * @param anCustNo
     * @return
     */
    public String webFindBankAccount(Long anId, Long anCustNo);
    
    public String webCancelInsteadRecord(Long anInsteadId, Long anCustNo);

    public String webConfirmInsteadRecord(Long anInsteadId, Long anCustNo);

    public String webFindInsteadRecord(Long anCustNo, Long anId);

    public String webQueryInsteadRecord(Long anInsteadId, Long anCustNo);

    public String webAddInsteadRecord(Map<String, Object> anParam, Long anCustNo, Long anId, Long anOperType);

    public String webCancelChangeApply(Long anChangeId, Long anCustNo);

    public String webConfirmChangeApply(Long anChangeId, Long anCustNo);

    public String webQueryChangeApply(Long anCustNo);

    public String webFindChangeApply(Long anCustNo, Long anId);

    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo, Long anId, Long anOperType);
}
