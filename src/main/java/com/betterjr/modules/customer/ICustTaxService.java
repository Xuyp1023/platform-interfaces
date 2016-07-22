package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 纳税信息上传记录
 * 
 * @author liuwl
 *
 */
public interface ICustTaxService {
    /**
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddTaxRecord(Map<String, Object> anParam, Long anCustNo);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindTaxRecord(Long anCustNo, Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryTaxRecordList(Long anCustNo);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveTaxRecord(Map<String, Object> anParam, Long anCustNo, Long anId);
}
