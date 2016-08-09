package com.betterjr.modules.workflow.entity;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.entity.BetterjrEntity;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_order_business")
public class CustFlowInstanceBusiness implements BetterjrEntity{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    //流程实例id
    @Column(name = "C_ORDER_ID",  columnDefinition="VARCHAR" )
    @MetaData( value="流程实例id", comments = "流程实例id")
    private String flowOrderId;
    //业务Id
    @Id
    @Column(name = "L_BUSINESS_ID",  columnDefinition="INTEGER" )
    @MetaData( value="业务Id", comments = "业务Id")
    private Long businessId;
    
    @Column(name = "T_UPDATE",  columnDefinition="DATETIME" )
    @MetaData( value="更新时间", comments = "更新时间")
    private Date updateTime;
    

    public String getFlowOrderId() {
        return flowOrderId;
    }
    public void setFlowOrderId(String flowOrderId) {
        this.flowOrderId = flowOrderId;
    }
    public Long getBusinessId() {
        return businessId;
    }
    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
}
