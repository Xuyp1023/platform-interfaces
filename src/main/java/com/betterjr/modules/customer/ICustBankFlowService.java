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
    public String webAddBankFlowRecord(Map<String, Object> anParam, String anFileList);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryBankFlowRecordList(Long anCustNo, String anFlag, int anPageNum, int anPageSize);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveDeleteBankFlowRecord(Long anId);
}
