package com.betterjr.modules.workflow.data;

import java.io.Serializable;

public enum FlowType implements Serializable {
    Account("账户类业务"), Trade("交易类业务"), WithdrawAccount("账户类业务撤单"), WithdrawTrade("交易类业务撤单");

    private String displayName;

    FlowType(String display) {
        this.displayName = display;
    }

    public String getDisplayName() {
        return displayName;
    }

}
