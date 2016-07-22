package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 合作企业
 * @author liuwl
 *
 */
public interface ICustMechCooperationService {
    /**
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddCooperation(Map<String, Object> anParam, Long anCustNo);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindCooperation(Long anCustNo, Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryCooperationList(Long anCustNo);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveCooperation(Map<String, Object> anParam, Long anCustNo, Long anId);
}
