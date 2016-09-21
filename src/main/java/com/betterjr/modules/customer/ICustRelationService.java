package com.betterjr.modules.customer;

import java.util.List;

import com.betterjr.modules.customer.data.CustRelationData;

public interface ICustRelationService {

    /**
     * 开通保理融资业务状态
     * 
     * @param anCustNo
     * @return 当前状态:0-未开通保理融资业务;1-可开通保理融资业务;2-已开通保理融资业务;
     */
    public String webFindFactorStatus(Long anCustNo);

    /**
     * 开通保理融资业务申请
     * 
     * @param anCustNo
     * @param anProviderCustList
     * @param anFactorCustList
     * @param anPostscript
     * @return
     */
    public String webSaveCustRelation(Long anCustNo, String anProviderCustList, String anFactorCustList, String anPostscript);

    /**
     * 开通保理业务融资审批流程
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryAuditWorkflow(Long anCustNo);

    /**
     * 客户白名单受理列表
     * 
     * @param anBusinStatus
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryRelationAccept(String anBusinStatus, String anFlag, int anPageNum, int anPageSize);

    /**
     * 客户白名单审批列表
     * 
     * @param anBusinStatus
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryRelationAudit(String anBusinStatus, String anFlag, int anPageNum, int anPageSize);

    /**
     * 客户白名单受理
     * 
     * @param anId
     * @param anAuditOpinion
     * @return
     */
    public String webSaveRelationAccept(Long anId, String anAuditOpinion);

    /**
     * 客户白名单审批
     * 
     * @param anId
     * @param anAuditOpinion
     * @return
     */
    public String webSaveRelationAudit(Long anId, String anAuditOpinion);

    /**
     * 客户白名单受理-驳回
     * 
     * @param anId
     * @param anAuditOpinion
     * @return
     */
    public String webSaveRefuseAcceptRelation(Long anId, String anAuditOpinion);

    /**
     * 客户白名单审批-驳回
     * 
     * @param anId
     * @param anAuditOpinion
     * @return
     */
    public String webSaveRefuseAuditRelation(Long anId, String anAuditOpinion);

    /**
     * 核心企业下拉列表查询,适用于供应商/经销商相关查询
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryCoreKeyAndValue(Long anCustNo);

    /**
     * 供应商下拉列表查询,使用于核心企业查询
     * 
     * @param anCoreCustNo
     * @return
     */
    public String webQuerySupplierByCore(Long anCoreCustNo);

    /**
     * 经销商下拉列表查询,使用于核心企业查询
     * 
     * @param anCoreCustNo
     * @return
     */
    public String webQuerySellerByCore(Long anCoreCustNo);

    /**
     * 保理机构下拉列表查询,适用于供应商/经销商/核心企业相关查询
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryFactorKeyAndValue(Long anCustNo);

    /**
     * 客户与电子合同服务商关系查询
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryProviderRelation(Long anCustNo);

    /**
     * 客户关系查询
     * 
     * @param anCustNo
     * @return
     */
    public String webQueryCustRelation(Long anCustNo);

    /**
     * 保理机构与核心企业关系查询
     * 
     * @param anFactorNo
     * @return
     */
    public String webQueryFacotrCoreRelation(Long anFactorNo);

    /**
     * 保理机构关系客户查询
     * 
     * @param anFactorNo
     * @param anCreditType
     * @return
     */
    public String webQueryFactorCustRelation(Long anFactorNo, String anCreditType);
    
    /****
     * 查询客户号根据类型返回关联关系信息
     * @param anCustNo 关系客户号
     * @param anCreditType 关系类型
     * @return 关系列表
     */
    public List<CustRelationData> webQueryCustRelationData(Long anCustNo,String anCreditType);

}
