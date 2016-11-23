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
    
}
