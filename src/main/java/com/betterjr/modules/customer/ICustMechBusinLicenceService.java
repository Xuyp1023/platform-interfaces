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
     * 营业执照-查询详情
     * 
     * @param anCustNo
     * @return
     */
    public String webFindBusinLicence(Long anCustNo);

    /**
     * 营业执照税务登记证号
     * @param anCustNo
     * @return
     */
    public String findBusinLicenceTaxNo(Long anCustNo);

    /**
     * 营业执照-变更详情
     * 
     * @param anId
     * @return
     */
    public String webFindChangeApply(Long anId);

    /**
     * 营业执照-变更列表
     * 
     * @param anCustNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 营业执照-变更申请
     * 
     * @param anParam
     * @param anCustNo
     * @param anId
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, String anFileList);

    /**
     * 营业执照-变更修改
     * 
     * @param anParam
     * @param anApplyId
     * @return
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId, String anFileList);

    /**
     * 营业执照-代录添加
     * 
     * @param anParam
     * @param anInsteadRecordId
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 营业执照-代录修改
     * 
     * @param anParam
     * @param anInsteadRecordId
     * @return
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 营业执照-代录详情
     * 
     * @param anInsteadRecordId
     * @return
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);

}
