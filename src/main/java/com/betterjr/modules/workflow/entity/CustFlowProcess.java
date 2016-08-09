package com.betterjr.modules.workflow.entity;

import java.util.List;
import java.util.Map;

public class CustFlowProcess {

    private CustFlowBase base;
    private List<CustFlowStep> stepList;
    private Map<Long,List<CustFlowStepApprovers>> stepApproversMap;
    private Map<Long,CustFlowMoney> moneyMap;
}
