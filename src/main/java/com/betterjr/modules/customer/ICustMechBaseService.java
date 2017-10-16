// ============================================================================
// Copyright (c) 1998-2016 BYTTER Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION V2.0
// ============================================================================
// CHANGE LOG
// V2.0 : 2016-07-22, liuwl, TASK-002
// ============================================================================
package com.betterjr.modules.customer;

import java.util.Collection;
import java.util.Map;

import com.betterjr.modules.account.entity.CustInfo;
import com.betterjr.modules.customer.entity.CustMechBase;

/**
 * 公司基本信息服务
 *
 * @author liuwl
 *
 */
public interface ICustMechBaseService {
    /**
     * 检查当前登陆用户是否为平台
     */
    public String webCheckOrgType(String anRole);

    /**
     * 取当前用户的机构角色
     */
    public String webGetCurrentRole();

    /**
     * 查询当前操作员下的所有机构-对WEB提供
     *
     * @return
     */
    public String webQueryCustInfo();

    /**
     * 查询平台所有下的所有有效机构-对WEB提供
     *
     * @return
     */
    public String webQueryValidCustInfo(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询当前操作员下的所有机构-对WEB提供
     *
     * @return
     */
    public String webQueryInvalidCustInfo(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 通过键值对方式 value - name
     *
     * @return
     */
    public String webQueryCustInfoSelect();

    /**
     * 通过操作员取其拥有公司信息
     * @return
     */
    public Collection<CustInfo> queryCustInfoByOperId(final Long anOperId);

    /**
     * 公司基本信息-查询详情
     *
     * @param anCustNo
     * @return
     */
    public String webFindBaseInfo(final Long anCustNo);

    /**
     * 公司基本信息-查询详情
     *
     * @param anCustNo
     * @return
     */
    public CustMechBase findBaseInfo(Long anCustNo);

    /**
     * 公司基本信息-变更详情
     *
     * @param anCustNo
     * @param anTempId
     * @return
     */
    public String webFindChangeApply(Long anId);

    /**
     * 公司基本信息-变更列表
     *
     * @param anCustNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 公司基本信息-变更申请
     *
     * @param anParam
     * @param anCustNo
     * @return
     */
    public String webAddChangeApply(Map<String, Object> anParam, String anFileList);

    /**
     * 公司基本信息-变更修改
     *
     * @param anParam
     * @param anApplyId
     * @return
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId, String anFileList);

    /**
     * 公司基本信息-代录添加
     *
     * @param anParam
     * @param anInsteadRecordId
     * @return
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 公司基本信息-代录修改
     *
     * @param anParam
     * @param anInsteadRecordId
     * @return
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 公司基本信息-代录详情
     *
     * @param anCustNo
     * @param anTempId
     * @return
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);

    /**
     * @return
     */
    public String webFindWechatLoginInfo();

    /**
     * 查询企业平台id
     * @return
     */
    public Long findPlatCustNo();
}
