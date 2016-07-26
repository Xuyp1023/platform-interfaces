package com.betterjr.modules.blacklist;

import java.util.Map;

public interface IBlacklistService {

    /**
     * 平台用户查询黑名单信息(分页)
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryBlacklist(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 平台用户黑名单录入
     * 
     * @param anMap
     * @return
     */
    public String webAddBlacklist(Map<String, Object> anMap);

    /**
     * 平台用户黑名单修改
     * 
     * @param anMap
     * @param id
     * @return
     */
    public String webSaveModifyBlacklist(Map<String, Object> anMap, Long anId);

    /**
     * 平台用户黑名单激活
     * 
     * @param anId
     * @return
     */
    public String webSaveActivateBlacklist(Long anId);

    /**
     * 平台用户黑名单注销
     * 
     * @param anId
     * @return
     */
    public String webSaveCancelBlacklist(Long anId);

    /**
     * 平台用户黑名单删除
     * 
     * @param anId
     * @return
     */
    public int webSaveDeleteBlacklist(Long anId);

    /**
     * 检查是否存在黑名单(参数不能同时为空)
     * 
     * @param anName:机构名称或姓名
     * @param anIdentNo:证件号码
     * @param anLawName:法人
     * @return
     */
    public boolean checkBlacklistExists(String anName, String anIdentNo, String anLawName);

}
