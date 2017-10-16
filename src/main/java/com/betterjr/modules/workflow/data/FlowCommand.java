package com.betterjr.modules.workflow.data;

import java.io.Serializable;

/*
 * 
 * 1.通过，执行下一步
 * 2.驳回，回滚至上一步，或者 上N步
 * 3.拒绝，终止整个流程，直接跳到流程终点
 */
public enum FlowCommand implements Serializable {
    GoNext("下一步"), Rollback("打回"), Exit("拒绝");
    private String displayName;

    FlowCommand(String display) {
        this.displayName = display;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return this.name();
    }

    public static void main(String[] args) {
        System.out.println(FlowCommand.GoNext.getName());
        System.out.println(FlowCommand.GoNext.getDisplayName());
    }
}
