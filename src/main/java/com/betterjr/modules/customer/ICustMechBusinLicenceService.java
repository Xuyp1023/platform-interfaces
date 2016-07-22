package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 营业执照
 * 
 * @author liuwl
 *
 */
public interface ICustMechBusinLicenceService {

    /**
     * 查询营业执照信息
     * 
     * @param anCustNo
     * @return
     */
    public String webFindBusinLicence(String anCustNo);

    /**
     * 新增营业执照信息
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String addBusinLicence(Map<String, Object> anParam, Long anCustNo);

    /**
     * 保存营业执照信息
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String saveBusinLicence(Map<String, Object> anParam, Long anCustNo);

    /**
     * 变更营业执照信息-变更临时流水表
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo, Long anId);

    /**
     * 查询变更营业执照信息-变更临时流水表
     * 
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindChangeApply(Long anCustNo, Long anId);

    /**
     * 确认变更营业执照信息-变更正式表 流水表->正式表
     * 
     * @param anChangeId
     * @param anCustNo
     * @return
     */
    public String webConfirmChangeApply(Long anChangeId, Long anCustNo);

    /**
     * 作废变更营业执照信息
     * 
     * @param anChangeId
     * @param anCustNo
     * @return
     */
    public String webCancelChangeApply(Long anChangeId, Long anCustNo);

    /**
     * 代录营业执照信息-代录临时流水表
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anCustNo, Long anId);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anCustNo, Long anId);

    /**
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webFindInsteadRecord(Map<String, Object> anParam, Long anCustNo, Long anId);

    /**
     * 确认代录营业执照信息-代录正式表 流水表->正式表
     * 
     * @param anInsteadId
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webConfirmInsteadRecord(Long anInsteadId, Long anCustNo);

    /**
     * 作废代录营业执照信息
     * 
     * @param anInsteadId
     * @param anCustNo
     * @return
     */
    public String webCancelInsteadRecord(Long anInsteadId, Long anCustNo);

}
