package com.betterjr.modules.notice;

import java.util.Map;

/**
 * 公告
 * @author liuwl
 *
 */
public interface INoticeService {
    /**
     * 查询未读公告
     */
    public String webQueryUnreadNotice(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询已读公告
     */
    public String webQueryReadNotice(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询未读公告数量 
     */
    public String webCountUnreadNotice();
    
    /**
     * 公告详情
     */
    public String webFindNotice(Long anId);
    
    /**
     * 添加公告
     */
    public String webAddNotice(Map<String, Object> anParam);
    
    /**
     * 修改公告
     */
    public String webSaveNotice(Map<String, Object> anParam);
    
    /**
     * 发布公告
     */
    public String webPublishNotice(Long anId);
    
    /**
     * 撤销公告
     */
    public String webCancelNotice(Long anId);
}
