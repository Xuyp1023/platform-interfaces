package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 财务上传记录
 * @author liuwl
 *
 */
public interface ICustMechFinanceService {
    /**
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddFinanceInfo(Map<String, Object> anParam, Long anCustNo, String anFileList);

    /**
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindFinanceInfo(Long anCustNo, Long anId);

    /**
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryFinanceList(Long anCustNo, String anFlag, int anPageNum, int anPageSize);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveFinanceInfo(Map<String, Object> anParam, Long anCustNo, Long anId, String anFileList);

    public String webSaveDeleteFinanceInfo(Long anId);
}
