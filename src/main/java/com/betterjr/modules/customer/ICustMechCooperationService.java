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
    public String webAddCooperation(Map<String, Object> anParam);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryCooperationList(Long anCustNo, String anFlag, int anPageNum, int anPageSize);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveCooperation(Map<String, Object> anParam, Long anId);

    public String webSaveDeleteCooperation(Long anId);
}
