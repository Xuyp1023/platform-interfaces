package com.betterjr.modules.workflow.data;

public enum FlowType {
    Account("账户类业务"),Trade("交易类业务"),WithdrawAccount("账户类业务撤单"),WithdrawTrade("交易类业务撤单");
    
    private String displayName;
    
    FlowType(String display){
        this.displayName=display;
    }

    public String getDisplayName() {
        return displayName;
    }
    
}
