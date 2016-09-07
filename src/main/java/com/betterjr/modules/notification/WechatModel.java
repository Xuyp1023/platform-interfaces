package com.betterjr.modules.notification;

import java.io.Serializable;

/**
 * 微信消息模型
 * @author liuwl
 *
 */
public class WechatModel implements Serializable {
    private static final long serialVersionUID = -5038445335821756924L;
    
    private String profileName;
    
    private WechatModel(String anProfileName) {
        this.profileName = anProfileName;
    }
    
    public static Builder newBuilder(String anProfileName) {
        return new Builder(anProfileName);
    }
    
    /**
     * 微信消息构建 
     */
    public static class Builder {
        private final WechatModel model;
        
        public Builder(String anProfileName) {
            model = new WechatModel(anProfileName);
        }
        
        public WechatModel build() {
            return model;
        }
    }

    public String getProfileName() {
        return profileName;
    }
}
