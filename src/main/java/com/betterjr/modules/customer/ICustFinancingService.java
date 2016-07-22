package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 融资情况
 * @author liuwl
 *
 */
public interface ICustFinancingService {
    /**
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddFinancing(Map<String, Object> anParam, Long anCustNo);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindFinancing(Long anCustNo, Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryFinancingList(Long anCustNo);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveFinancing(Map<String, Object> anParam, Long anCustNo, Long anId);
}
