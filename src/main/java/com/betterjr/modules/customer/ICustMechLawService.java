// ============================================================================
// Copyright (c) 1998-2016 BYTTER Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION V2.0
// ============================================================================
// CHANGE LOG
// V2.0 : 2016-07-27, liuwl, TASK-003
// ============================================================================
package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 法人
 * 
 * @author liuwl
 *
 */
public interface ICustMechLawService {
    /**
     * 法人信息-查询详情
     * 
     * @param anCustNo
     * @return
     */
    public String webFindLawInfo(Long anCustNo);

    /**
     * 法人信息-变更详情
     * 
     * @param anId
     * @return
     */
    public String webFindChangeApply(Long anId);

    /**
     * 法人信息-变更列表
     * 
     * @param anCustNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 法人信息-变更申请
     * 
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, String anFileList);

    /**
     * 法人信息-变更修改
     * 
     * @param anParam
     * @param anApplyId
     * @return
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId, String anFileList);

    /**
     * 法人信息-代录添加
     * 
     * @param anParam
     * @param anInsteadRecordId
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 法人信息-代录修改
     * 
     * @param anParam
     * @param anInsteadRecordId
     * @return
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 法人信息-代录详情
     * 
     * @param anInsteadRecordId
     * @return
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);
}
