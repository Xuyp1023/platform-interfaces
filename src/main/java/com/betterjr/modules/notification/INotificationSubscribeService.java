package com.betterjr.modules.notification;

/**
 * 消息订阅服务
 * @author liuwl
 *
 */
public interface INotificationSubscribeService {
    /**
     * 查询消息订阅列表
     */
    public String webQuerySubscribeByCustNo(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 取消消息订阅
     */
    public String webCancelSubscribe(Long anCustNo, Long anSourceCustNo, String anProfileName, String anChannel);

    /**
     * 确认消息订阅
     */
    public String webConfirmSubscribe(Long anCustNo, Long anSourceCustNo, String anProfileName, String anChannel);
}
