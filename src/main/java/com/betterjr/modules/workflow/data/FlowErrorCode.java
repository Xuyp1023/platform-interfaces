package com.betterjr.modules.workflow.data;

import java.io.Serializable;

public enum FlowErrorCode implements Serializable {
    ExistsNodeName(41000);
    int code;

    FlowErrorCode(int anCode) {
        this.code = anCode;
    }

    public int getCode() {
        return code;
    }

    public String getStrCode() {
        return String.valueOf(code);
    }
}
