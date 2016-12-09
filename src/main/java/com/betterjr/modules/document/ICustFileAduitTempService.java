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
    public List<CustFileItem> findCustAduitTemp(Long anCustNo,List<AgencyAuthorFileGroup> anAgencyAuthorFileGroupList);
    
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
    public boolean checkCustFileAduitTempExist(Long anCustNo,List<AgencyAuthorFileGroup> anAgencyAuthorFileGroupList);
    
    /***
     * 删除临时审核附件关系表数据
     * @param anId 附件 id
     * @return
     */
    public boolean saveDeleteFileAduitTemp(Long anId);
    
}
