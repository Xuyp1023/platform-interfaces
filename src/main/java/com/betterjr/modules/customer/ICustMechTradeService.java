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
    public String webAddTradeRecord(Map<String, Object> anParam, Long anCustNo);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindTradeRecord(Long anCustNo, Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryTradeRecordList(Long anCustNo);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveTradeRecord(Map<String, Object> anParam, Long anCustNo, Long anId);
}
