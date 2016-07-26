// ============================================================================
// Copyright (c) 1998-2016 BYTTER Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION V2.0
// ============================================================================
// CHANGE LOG
// V2.0 : 2016-07-22, liuwl, TASK-002
// ============================================================================
package com.betterjr.modules.customer;

import java.util.Map;

import com.betterjr.modules.customer.entity.CustMechBase;

/**
 * 公司基本信息服务
 * @author liuwl
 *
 */
public interface ICustMechBaseService {
    /**
     * 查询公司基本信息
     * @param anCustNo
     * @return
     */
    public String webFindBaseInfo(Long anCustNo);
    
    /**
     * 添加公司基本信息
     * @param anCustMechBase
     * @param anCustNo
     * @return
     */
    public CustMechBase addBaseInfo(CustMechBase anCustMechBase, Long anCustNo);
    
    /**
     * 保存公司基本信息
     * @param anCustMechBase
     * @param anCustNo
     * @return
     */
    public CustMechBase saveBaseInfo(CustMechBase anCustMechBase, Long anCustNo);
    
    /**
     * 查询公司基本信息变更详情
     * @param anCustNo
     * @param anTempId
     * @return
     */
    public String webFindChangeApply(Long anId);
    
    /**
     * 查询变更申请列表
     * @param anCustNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 添加变更申请
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);
    
    /**
     * 代录公司基本信息
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);
    
    /**
     * 查询公司基本信息
     * @param anCustNo
     * @param anTempId
     * @return
     */
    public String webFindInsteadRecord(Long anId);
    
}
