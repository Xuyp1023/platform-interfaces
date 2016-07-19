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

}
