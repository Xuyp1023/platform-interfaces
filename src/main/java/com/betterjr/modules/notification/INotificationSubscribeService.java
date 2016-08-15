package com.betterjr.modules.notification;

import java.util.Map;

/**
 * 消息订阅服务
 * @author liuwl
 *
 */
public interface INotificationSubscribeService {
    /**
     * 查询消息订阅列表  
     */
    public String webQuerySubscribeByCustNo(Long anCustNo);
    
    /**
     * 保存消息订阅  
     */
    public String webSaveSubscribe(Map<String, Object> anParam, Long anCustNo);
}
