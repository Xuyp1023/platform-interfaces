package com.betterjr.modules.customer;

public interface ICustRelationConfigService {

    /***
     * 查询所有未关联的客户信息
     * @param anCustType
     * @param anCustNo
     * @return
     */
    public String webFindCustInfo(String anCustType,Long anCustNo,String anCustName);
    
    public String webFindCustType();
    
    /*****
     * 添加关联关系
     * @param anCustType 客户所属类型
     * @param anCustNo 客户号
     * @param anRelationCustNo 关联客户号
     * @return
     */
    public String webAddCustRelation(String anCustType,Long anCustNo,String anRelationCustStr);
    
    /****
     * 分页查询客户关系信息
     * @param anCustNo
     * @return
     */
    public String webQueryCustRelation(Long anCustNo,String anFlag,int anPageNum,int anPageSize,String anRelationType);
    
    /****
     * 查询当前客户的类型 
     * @param anCustNo 客户号
     * @return
     */
    public String webFindCustTypeByCustNo();
    
    /***
     * 查询电子合同服务商客户
     * @return
     */
    public String webFindElecAgreementServiceCust();
    
    /***
     * 查询临时审核文件
     * @param anFactorNo
     * @param anCustNo
     * @return
     */
    public String webFindCustAduitTempFile(Long anRelateCustNo,Long anCustNo);
    
    /***
     * 保存临时文件
     * @param anRelateCustNo
     * @param anCustNo
     * @param anFileTypeName
     * @param anFileMediaId
     * @return
     */
    public String webAddCustAduitTempFile(Long anRelateCustNo,Long anCustNo,String anFileTypeName, String anFileMediaId,String anCustType);
    
    /****
     * 删除附件
     * @param anId
     * @return
     */
    public String webSaveDeleteCustAduitTempFile(Long anId);
    
    /*****
     * 添加保理关联关系
     * @param anFactorCustType 保理客户所属类型
     * @param anWosCustType 电子服务客户所属类型
     * @param anCustNo 客户号
     * @param anFactorCustNo 关联保理公司的客户号
     * @param anRelationCustNo 关联电子合同服务的客户号
     * @return
     */
    public String webAddFactorCustRelation(String anFactorCustType,String anWosCustType,Long anCustNo,String anFactorCustStr,String anWosCustStr);
}
