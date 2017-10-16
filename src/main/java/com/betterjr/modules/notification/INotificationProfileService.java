package com.betterjr.modules.notification;

import java.util.Map;

/**
 * 消息通知模板服务
 * @author liuwl
 *
 */
public interface INotificationProfileService {
    /**
     * 查询指定机构的消息模板列表
     */
    public String webQueryNotificationProfile(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 启用消息模板
     */
    public String webSetEnabledNotificationProfile(Long anProfileId, final Long anCustNo);

    /**
     * 禁用消息模板
     */
    public String webSetDisabledNotificationProfile(Long anProfileId, final Long anCustNo);

    /**
     * 查询消息模板下的通道模板
     */
    public String webQueryNotificationChannelProfile(Long anProfileId, final Long anCustNo);

    /**
     * 修改消息通道模板
     */
    public String webSaveNotificationChannelProfile(Map<String, Object> anParam, Long anChannelProfileId,
            final Long anCustNo);

    /**
     * 查询消息通知模板变量表
     */
    public String webQueryNotificationProfileVariable(Long anChannelProfileId, final Long anCustNo);
}
