package com.betterjr.modules.customer;

import java.util.Map;

/**
 * 开户流水
 * 
 * @author liuwl
 *
 */
public interface ICustOpenAccountService {

    /**
     * 开户资料提交,客户操作员录入开户资料后点击提交按钮触发
     * 
     * @param anMap
     * @param anId
     * @param anFileList
     * @return
     */
    public String webSaveOpenAccount(Map<String, Object> anMap, Long anId, String anFileList);

    /**
     * 读取暂存开户资料,适用于客户操作员点击开户菜单加载开户暂存信息
     * 
     * @return
     */
    public String webFindOpenAccountTemp();

    /**
     * 平台操作员查看代录时暂存的开户资料
     * 
     * @param anInsteadRecordId:代录ID
     * @return
     */
    public String webFindOpenAccountTempByInsteadId(Long anInsteadRecordId);

    /**
     * 开户资料暂存,适用于客户操作员开户时暂存按钮
     * 
     * @param anMap
     * @param anFileList
     * @return
     */
    public String webSaveOpenAccountTemp(Map<String, Object> anMap, String anFileList);

    /**
     * 开户资料暂存,适用于平台操作员开户代录时暂存
     * 
     * @param anMap
     * @param anInsteadRecordId:代录ID
     * @param anFileList
     * @return
     */
    public String webSaveOpenAccountInsteadTemp(Map<String, Object> anMap, Long anInsteadRecordId, String anFileList);

}
