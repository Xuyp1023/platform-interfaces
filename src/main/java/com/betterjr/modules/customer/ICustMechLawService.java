package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 法人
 * @author liuwl
 *
 */
public interface ICustMechLawService {

    /**
     * 查询公司法人信息
     * @param anCustNo
     * @return
     */
    public String webFindLawInfo(Long anCustNo);
    
    /**
     * 
     * @param anCustMechLaw
     * @param anId
     * @return
     */
    public Object saveLawInfo(Object anCustMechLaw, Long anId);
    
    /**
     * 
     * @param anCustMechLaw
     * @param anId
     * @return
     */
    public Object addLawInfo(Object anCustMechLaw, Long anId);
    
    /**
     * 变更公司法人信息-变更临时流水表
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo, Long anId);
    
    /**
     * 查询变更公司法人信息-变更临时流水表
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindChangeApply(Long anId);
    
    /**
     * 确认变更公司法人信息-变更正式表
     * 流水表->正式表
     * @param anChangeId
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webConfirmChangeApply(Long anChangeId, Long anCustNo, Long anId);
    
    /**
     * 取消变更
     * @param anChangeId
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webCancelChangeApply(Long anChangeId, Long anCustNo, Long anId);
    
    /**
     * 查询变更列表
     * @param custNo
     * @param flag
     * @param pageNum
     * @param pageSize
     * @return
     */
    public String webQueryChangeApply(Long custNo, int flag, int pageNum, int pageSize);
    
    /**
     * 代录公司法人信息-代录临时流水表
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anCustNo, Long anId);
    
    /**
     * 确认代录公司法人信息-代录正式表
     * 流水表->正式表
     * @param anInsteadId
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webConfirmInsteadRecord(Long anInsteadId, Long anCustNo, Long anId);

    /**
     * 
     * @param anInsteadId
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webCancelInsteadRecord(Long anInsteadId, Long anCustNo, Long anId);
}
