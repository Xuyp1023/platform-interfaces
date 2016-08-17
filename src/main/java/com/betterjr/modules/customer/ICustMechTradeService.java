package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 贸易信息
 * 
 * @author liuwl
 *
 */
public interface ICustMechTradeService {
    /**
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddTradeRecord(Map<String, Object> anParam, String anFileList);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryTradeRecordList(Long anCustNo, String anFlag, int anPageNum, int anPageSize);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveDeleteTradeRecord(Long anId);
}
