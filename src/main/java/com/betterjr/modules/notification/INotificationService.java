package com.betterjr.modules.notification;

import java.util.Map;

/**
 * 消息通知服务
 * @author liuwl
 *
 */
public interface INotificationService {
    /**
     * 查询未读消息
     */
    public String webQueryUnreadNotification(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询已读消息
     */
    public String webQueryReadNotification(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 查询未读消息数量 
     */
    public String webCountUnreadNotification();
    
    /**
     * 消息详情
     */
    public String webFindNotification(Long anId);
    
    /**
     * 设置消息已读状态
     */
    public String webSetReadNotificationStatus(Long anId);
    
    /**
     * 发送消息接口
     */
    public boolean sendNotification(NotificationModel anNotificationModel);    
}
