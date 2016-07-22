package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 银行流水
 * @author liuwl
 *
 */
public interface ICustBankFlowService {
    /**
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddBankFlowRecord(Map<String, Object> anParam, Long anCustNo);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindBankFlowRecord(Long anCustNo, Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryBankFlowRecordList(Long anCustNo);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveBankFlowRecord(Map<String, Object> anParam, Long anCustNo, Long anId);
}
