package com.betterjr.modules.customer;


import java.util.List;
import java.util.Map;

import com.betterjr.common.annotation.NoSession;
import com.betterjr.common.data.SimpleDataEntity;
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
    
    public List<CustRelation> queryCoreList(final Long anCustNo);

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
     *
     */
    public String webQueryOpenedFactor(Long anCustNo);
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
    @NoSession
    public CustRelation findOneRelation_OLD(Long anCustNo, Long anRelateCustno,String anPartnerCustNo);

    /**
     * 更新关联关系的状态
     *
     * @param anCustNo
     * @param anScfId
     * @param anStatus
     * @param anFactorNo
     */
    @NoSession
    public boolean saveFactorRelationStatus(Long anCustNo, String anScfId, String anStatus, String anFactorNo);

    /**
     * 按银行账户信息查询供应商与核心企业关系
     *
     * @param anBankAccountName
     * @param anBankAccount
     * @return
     */
    @NoSession
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
    
    @NoSession
    public boolean saveAndCheckCust(Map<String, Object> anValues, String anCoreCustName, Long anCoreCustNo);


    /**
     * 微信端查询当前客户信息
     *
     * @return
     */
    public String webFindWechatCurrentCustInfo();


    /**
     * 微信端开通保理融资业务申请
     *
     * @param anCustNo
     * @param anFactorCustList
     * @return
     */
    public String webSaveCustRelation(Long anCustNo, String anFactorCustList);

    /**
     * 保存保理公司与企业之间的关系
     * 
     * @param anRelation
     */
    @NoSession
    public void saveOrUpdateCustFactor(CustRelation anRelation);
    
    /**
     * 根据保理公司客户号，查找系统中的客户号
     * 
     * @param anScfId
     *            保理公司客户号
     * @param anAgencyNo
     *            保理公司编码
     * @return
     */
    @NoSession
    public Long findCustNoByScfId(String anScfId, String anAgencyNo);
    

    /**
     * 根据客户号获得在保理公司的关联号
     * @param anCustNo 我方系统客户号
     * @param anAgencyNo 保理公司编码
     * @return
     */
    @NoSession
    public String findScfIdByCustNo(Long anCustNo, String anAgencyNo);
    
    /**
     * 查询核心企业关联的保理机构，用于获取核心企业额度信息
     * @param anAgencyNo
     * @return
     */
    @NoSession
    public List<CustRelation> findFactorRelaByCoreCustNo(String anAgencyNo);
    

    /**
     * 查询状态为处理中的业务，包括1：已申请和5：取消中的关联关系
     * 
     * @return
     */
    @NoSession
    public List<CustRelation> findFactorRelaByRough(String anAgencyNo);
    
    /**
     * 查询需要调用远程开户接口的信息
     * @return
     */
    @NoSession
    public List<CustRelation> findAppAccountRequest();
    
    /**
     * 根据ID，查找单个关联信息
     * @param anRelationId
     * @return
     */
    @NoSession
    public CustRelation findByRelationId(Long anRelationId);

    /**
     * 判断开户的是否是核心企业；客户类型：1 供应商开户 2 核心企业开户
     * 
     * @param anCustNo 企业编码
     * @param anAgencyNo 合作机构代码
     * @return
     */
    @NoSession
    public String checkCoreCustomer(Long anCustNo, String anAgencyNo);
    
    /**
     *保存远程调用的接口信息 
     * @param anId 关系ID
     * @param anScfId 远端的客户信息
     * @param anStatus 处理状态
     */    
    @NoSession
    public void saveFactorRelationInfo(Long anId, String anScfId, String anStatus);
    

    /**
     * 保理机构客户查询,适用于根据核心企业，查询关联保理机构的供应商或经销商
     *
     * @param anCoreCustNo
     * @return
     */
    public String webQuerySimpleDataByFactorAndCore(final Long anCoreCustNo);

    /**
     * 查询核心企业下面所有客户
     * 
     */
    public String webQueryCoreCust(Long anCoreCustNo);
    
    /**
     * 根据关联方简称和关联方客户编号查询客户关联关系信息
     * @param anCustNo 客户号
     * @param anCustCorp 关联方简称
     * @param anPartnerCustNo 关联方客户号
     * @return
     */
    public CustRelation findRelationWithCustCorp(final Long anCustNo, final String anPartnerCustNo, final String anCustCorp);

    /**
     * 保理公司查询企业信息
     */
    public String webQueryCustInfoByFactor(String anRelateType, String anFlag, int anPageNum, int anPageSize);


}
