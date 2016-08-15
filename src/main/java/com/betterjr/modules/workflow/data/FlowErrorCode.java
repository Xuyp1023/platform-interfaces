package com.betterjr.modules.workflow.data;

public enum FlowErrorCode {
    ExistsNodeName(41000);
    int code;
    FlowErrorCode(int anCode){
        this.code=anCode;
    }
    public int getCode() {
        return code;
    }
    public String getStrCode(){
        return String.valueOf(code);
    }
}
