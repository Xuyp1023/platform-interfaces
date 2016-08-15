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
    public String webAddTaxRecord(Map<String, Object> anParam, String anFileList);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindTaxRecord(Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryTaxRecordList(Long anCustNo, String anFlag, int anPageSize, int anPagenum);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveTaxRecord(Map<String, Object> anParam, Long anId, String anFlieList);
}
