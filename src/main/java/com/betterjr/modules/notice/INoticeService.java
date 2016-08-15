package com.betterjr.modules.notice;

import java.util.Map;

import com.betterjr.common.web.AjaxObject;
import com.betterjr.modules.rule.service.RuleServiceDubboFilterInvoker;

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
     * 设置公告已删除
     */
    public String webSetDeletedNotice(Long anId);
    
    /**
     * 设置公告已读 
     */
    public String webSetReadNotice(Long anId);
    
    /**
     * 查看机构发布的公告列表
     */
    public String webQueryNotice(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 添加发布公告
     */
    public String webAddPublishNotice(Map<String, Object> anParam, String anTargetCust, String anFileList);
    
    /**
     * 添加暂存公告
     */
    public String webAddStoreNotice(Map<String, Object> anParam, String anTargetCust, String anFileList);
    
    /**
     * 修改发布公告
     */
    public String webSavePublishNotice(Map<String, Object> anParam, Long anId, String anTargetCust, String anFileList);
    
    /**
     * 修改暂存公告
     */
    public String webSaveStoreNotice(Map<String, Object> anParam, Long anId, String anTargetCust, String anFileList);
    
    /**
     * 发布公告
     */
    public String webPublishNotice(Long anId);
    
    /**
     * 撤销公告
     */
    public String webCancelNotice(Long anId);

    /**
     * 删除公告 
     */
    public String webDeleteNotice(Long anId);

}
