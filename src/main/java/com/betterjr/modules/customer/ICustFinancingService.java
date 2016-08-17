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
    public String webAddFinancing(Map<String, Object> anParam);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryFinancingList(Long anCustNo, String anFlag, int anPageNum, int anPageSize);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveFinancing(Map<String, Object> anParam, Long anId);
    
    public String webSaveDeleteFinancing(Long anId);
}
