package com.betterjr.modules.customer;


import java.util.List;
import java.util.Map;

import com.betterjr.modules.customer.data.CustRelationData;

import com.betterjr.modules.customer.entity.CustRelation;


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
    
    /**
     * 查询保理结构所有关系客户
     * 
     * @param anFactorNo
     * @return
     */
    public String webQueryFactorAllCust(Long anFactorNo);
    

    /****
     * 查询客户号根据类型返回关联关系信息
     * @param anCustNo 关系客户号
     * @param anCreditType 关系类型
     * @return 关系列表
     */
    public List<CustRelationData> webQueryCustRelationData(Long anCustNo,String anCreditType);

    /**
     * @return
     */
    public String webQueryFactorRelation(Long anCustNo);
    
    /**
     * 微信端,获取当前客户的保理公司
     * 
     * @return
     */
    public String webQueryFactorRelation();

    /**
     * 检查客户保理, 
     * 客户只能是供应商|经销商|核心企业
     * relateType为 ： 0,2,3
     * 
     * @param anCustNo
     *            客户号
     * @param anRelateCustno
     *            保理公司编号，对应接口中定义的relateCustno
     * @param anPartnerCustNo
     *            客户在保理公司的客户号
     * @return
     */
    public CustRelation findOneRelation(Long anCustNo, Long anRelateCustno,String anPartnerCustNo);
    
    /**
     * 更新关联关系的状态
     * 
     * @param anCustNo
     * @param anScfId
     * @param anStatus
     * @param anFactorNo
     */
    public boolean saveFactorRelationStatus(Long anCustNo, String anScfId, String anStatus, String anFactorNo);
    
    /**
     * 按银行账户信息查询供应商与核心企业关系
     * 
     * @param anBankAccountName
     * @param anBankAccount
     * @return
     */
    public Long findCustNoByBankInfo(String anBankAccountName, String anBankAccount);
    

    /**
     * 根据从核心企业上传的客户信息，保存客户与核心企业的关系；数据来自对象 CoreSupplierInfo <BR>
     * 处理逻辑：检查核心企业编码加上其余的熟悉 先检查客户号是否存在，如果存在，根据核心企业编码和客户号来检查，<BR>
     * 如果记录存在，则更新核心企业的内部编码 如果不存在，则根据核心企业内部编码来检查，如果存在则忽略；如果不存在，<BR>
     * 则根据企业名称来检查，如果都不存在，则增加记录
     * 
     * @param anValues 上传来的数据
     * @param anCoreCustName 核心企业名称
     * @param anCoreCustNo 核心企业编码
     * @return
     */
    public boolean saveAndCheckCust(Map<String, Object> anValues, String anCoreCustName, Long anCoreCustNo);

}
