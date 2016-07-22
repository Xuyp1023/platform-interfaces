package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 联系人
 * @author liuwl
 *
 */
public interface ICustMechContacterService {

    /**
     * 查询联系人列表
     * @param anCustNo
     * @return
     */
    public String webQueryCustContacter(Long anCustNo);
    
    /**
     * 查询联系人详情
     * @param anId
     * @param anCustNo
     * @return
     */
    public String webFindCustContacter(Long anId, Long anCustNo);
    
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
