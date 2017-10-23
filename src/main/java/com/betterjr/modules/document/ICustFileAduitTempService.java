package com.betterjr.modules.document;

import java.util.List;

import com.betterjr.modules.document.entity.AgencyAuthorFileGroup;
import com.betterjr.modules.document.entity.CustFileAduitTemp;
import com.betterjr.modules.document.entity.CustFileItem;

public interface ICustFileAduitTempService {

    /****
     * 获取临时文件
     * @param anCustNo
     * @param anAgencyAuthorFileGroupList
     * @return
     */
    public List<CustFileItem> findCustAduitTemp(Long anCustNo, Long anSelectCustNo,
            List<AgencyAuthorFileGroup> anAgencyAuthorFileGroupList);

    /***
     * 保存临时文件
     * @param anCustFileAduitTemp
     */
    public boolean addCustFileAduitTemp(CustFileAduitTemp anCustFileAduitTemp);

    /***
     * 检查文件是否都已上传
     * @param anCustNo 关联上传文件的客户号
     * @param anAgencyAuthorFileGroupList 文件类型列表
     * @return
     */
    public boolean checkCustFileAduitTempExist(Long anCustNo, Long anSelectCustNo,
            List<AgencyAuthorFileGroup> anAgencyAuthorFileGroupList);

    /***
     * 删除临时审核附件关系表数据
     * @param anId 附件 id
     * @return
     */
    public boolean saveDeleteFileAduitTemp(Long anId);

    /***
     * 添加客户文件关系
     * @param anRelationCustNo 关联的客户号
     * @param fileIds 上传的文件列表(以,分隔)
     */
    public void saveCustFileAduitTemp(Long anCustNo, Long anRelateCustNo, String anFileIds, String anCustType);

    /***
     * 查询关系审核附件
     * @param anCustNo
     * @return
     */
    public List<CustFileItem> findRelateAduitTempFile(Long anCustNo);

    /***
     * 保存附件关系
     * @param anPassFiles 审核通过的文件列表
     * @param anFailFiles 审核不通过的文件列表
     */
    public void saveAcceptFileTemp(String anPassFiles, String anFailFiles);

    public void saveAduitFile(Long anCustNo, Long anRelateCustNo);

    /**
     * 更新用户认证文件信息
     * 
     * @param request
     */
    String saveCustFileAuditTempInfo(Long custNo, String fileIds);

    /***
     * 查询变更审核数据
     * @Title: webFindChangeApply 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anId 变更数据ID
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author hubl
     * @date 2017年10月18日 下午5:18:48
     */
    String webFindChangeApply(final Long anId);

}
