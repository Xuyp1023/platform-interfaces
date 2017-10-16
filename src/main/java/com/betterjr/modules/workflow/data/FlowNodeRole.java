package com.betterjr.modules.workflow.data;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.betterjr.common.utils.BetterStringUtils;

public enum FlowNodeRole implements Serializable {
    Financer("融资方"), Core("核心企业"), Factoring("保理方");

    private String displayName;

    FlowNodeRole(String display) {
        this.displayName = display;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static FlowNodeRole convertDisptoObject(String name) {
        if (StringUtils.isNotBlank(name)) {
            name = name.trim();
            if (FlowNodeRole.Core.getDisplayName().equalsIgnoreCase(name)) {
                return FlowNodeRole.Core;
            }
            if (FlowNodeRole.Factoring.getDisplayName().equalsIgnoreCase(name)) {
                return FlowNodeRole.Factoring;
            }
            if (FlowNodeRole.Financer.getDisplayName().equalsIgnoreCase(name)) {
                return FlowNodeRole.Financer;
            }
        }
        return null;

    }
}
