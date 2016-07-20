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
     * @return
     */
    public String webSaveModifyBlacklist(Map<String, Object> anMap);

}
