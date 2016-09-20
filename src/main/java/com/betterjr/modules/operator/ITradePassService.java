// Copyright (c) 2014-2016 Betty. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2016年9月19日, liuwl, creation
// ============================================================================
package com.betterjr.modules.operator;

/**
 * @author liuwl
 *
 */
public interface ITradePassService {

    /**
     * @return
     */
    String webSendVerifyCode();

    /**
     * @param anVerifyCode
     * @return
     */
    String webCheckVerifyCode(String anVerifyCode);

    /**
     * @param anNewPassword
     * @param anOkPassword
     * @param anOldPassword
     * @return
     */
    String webSaveModifyTradePass(String anNewPassword, String anOkPassword, String anOldPassword);

    /**
     *
     * @param anNewPasswd
     * @param anOkPasswd
     * @param anLoginPasswd
     * @return
     */
    String webSaveMobileTradePass(final String anNewPasswd, final String anOkPasswd, final String anLoginPasswd);
}
