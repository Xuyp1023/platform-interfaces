package com.betterjr.modules.workflow.data;

public enum FlowNodeRole {
    Financer("融资方"),Core("核心企业"),Factoring("保理方");
    
    private String displayName;
    
    FlowNodeRole(String display){
        this.displayName=display;
    }

    public String getDisplayName() {
        return displayName;
    }
}
