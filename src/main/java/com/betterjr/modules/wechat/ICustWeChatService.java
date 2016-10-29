// Copyright (c) 2014-2016 Betty. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年9月12日, liuwl, creation
// ============================================================================
package com.betterjr.modules.wechat;

import java.util.Map;

import com.betterjr.common.annotation.NoSession;
import com.betterjr.modules.wechat.data.EventType;
import com.betterjr.modules.wechat.data.MPAccount;
import com.betterjr.modules.wechat.data.api.AccessToken;
import com.betterjr.modules.wechat.data.event.BasicEvent;
import com.betterjr.modules.wechat.entity.CustWeChatInfo;

/**
 * @author liuwl
 *
 */
public interface ICustWeChatService {

    /**
     * @param anId
     * @return
     */
    boolean checkWeChatInfoByOperId(Long anId);

    /**
     *
     */
    @NoSession
    MPAccount getMpAccount();

    /**
     * @param anWeChatEvent
     * @param anEventType
     * @return
     */
    @NoSession
    CustWeChatInfo saveWeChatInfo(BasicEvent anWeChatEvent, EventType anEventType);

    /**
     * @param anFromUserName
     * @return
     */
    CustWeChatInfo findWeChatInfo(String anFromUserName);

    /**
     * @param anWeChatInfo
     * @return
     */
    @NoSession
    CustWeChatInfo saveWeChatInfo(CustWeChatInfo anWeChatInfo);

    /**
     *
     * @param anToken
     * @return
     */
    Map<String, Object> saveLogin(final AccessToken anToken);

    /**
     *
     * @param anNewPasswd
     * @param anOkPasswd
     * @param anLoginPasswd
     * @return
     */
    String webSaveMobileTradePass(final String anNewPasswd, final String anOkPasswd, final String anLoginPasswd);

    /**
     * 检查用户首次登陆
     * @param anOperId
     * @return
     */
    boolean checkFristLogin(final Long anOperId);

    /**
     * @param anTradePassword
     * @return
     */
    String webSaveFristLoginTradePassword(String anTradePassword);

    /**
     * @return
     */
    String checkBindStatus();

    /**
     * @param anOpenId
     * @return
     */
    CustWeChatInfo findWechatUserByOpenId(String anOpenId);

    /**
     * @param anAppId
     * @param anOpenId
     * @return
     */
    CustWeChatInfo saveNewWeChatInfo(String anAppId, String anOpenId, int anSubscribeStatus);

    /**
     * @param anFileTypeName
     * @param anFileMediaId
     * @return
     */
    Object fileUpload(String anFileTypeName, String anFileMediaId);


}
