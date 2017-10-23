package com.betterjr.modules.customer;

import java.util.Map;

import com.betterjr.modules.customer.data.FactorBusinessRequestData;

public interface ICustRelationConfigService {

    /***
     * 查询所有未关联的客户信息
     * @param anCustType
     * @param anCustNo
     * @return
     */
    public String webFindCustInfo(String anCustType, Long anCustNo, String anCustName);

    public String webFindCustType();

    /*****
     * 添加关联关系
     * @param anCustType 客户所属类型
     * @param anCustNo 客户号
     * @param anRelationCustNo 关联客户号
     * @return
     */
    public String webAddCustRelation(String anCustType, Long anCustNo, String anRelationCustStr);

    /****
     * 分页查询客户关系信息
     * @param anCustNo
     * @return
     */
    public String webQueryCustRelation(Long anCustNo, String anFlag, int anPageNum, int anPageSize,
            String anRelationType);

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
    public String webFindCustAduitTempFile(Long anRelateCustNo, Long anSelectCustNo);

    /***
     * 保存临时文件
     * @param anRelateCustNo
     * @param anCustNo
     * @param anFileTypeName
     * @param anFileMediaId
     * @return
     */
    public String webAddCustAduitTempFile(Long anRelateCustNo, String anFileTypeName, String anFileMediaId,
            String anCustType);

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
    public String webAddFactorCustRelation(String anFactorCustType, String anWosCustType, String anFactorCustStr,
            String anWosCustStr, Long anCustNo);

    /***
     * 查询保理业务申请基础数据
     * @param anCustNo 申请客户号
     * @return
     */
    public String webFindFactorBusinessRequestData(Long anCustNo);

    /***
     * 添加客户文件关系
     * @param anRelationCustNo 关联的客户号
     * @param anFileIds 上传的文件列表(以,分隔)
     * @param anCustType 客户类型
     */
    public String webSaveCustAduitTempFile(Long anRelateCustNo, String anFileIds, String anCustType, Long anCustNo);

    /***
     * 查询关联临时文件
     * @param anCustNo 关联客户号
     * @return
     */
    public String webFindRelateAduitTempFile(Long anCustNo);

    public String webSaveAcceptAduit(Map<String, Object> anMap);

    /***
     * 查询审核/受理记录
     * @param anCustNo
     * @return
     */
    public String webFindCustRelateAduitRecord(Long anCustNo, Long anSelectCustNo, String anRelateType);

    /***
     * 查询客户的基本业务信息
     * @param anCustNo 客户号
     * @return
     */
    public FactorBusinessRequestData findBusinessCustInfo(Long anCustNo);

    /**
     * 平台查询用户键值对
     * @param anCustType
     * @return
     */
    String webFindCustByPlatform(String anCustType);

    /***
     * 查询销售机构对应需要上传的文件类型列表
     * @Title: findAgencyFileType 
     * @Description: TODO(机构文件类型) 
     * @param @param anAgencyNo
     * @param @return 文件类型列表
     * @return List<AgencyAuthorFileGroup> 返回类型 
     * @throws 
     * @author hubl
     * @date 2017年10月17日 上午11:35:19
     */
    String webFindAgencyFileType(final String anAgencyNo);
}
