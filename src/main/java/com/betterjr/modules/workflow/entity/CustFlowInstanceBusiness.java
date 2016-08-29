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
    
    //融资方机构
    @Column(name = "C_FINANCER_OPERORG",  columnDefinition="VARCHAR" )
    @MetaData( value="融资方机构", comments = "融资方机构")
    private String financerOperOrg;
    
    //核心企业机构
    @Column(name = "C_CORE_OPERORG",  columnDefinition="VARCHAR" )
    @MetaData( value="核心企业机构", comments = "核心企业机构")
    private String coreOperOrg;
    
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
    public String getFinancerOperOrg() {
        return financerOperOrg;
    }
    public void setFinancerOperOrg(String financerOperOrg) {
        this.financerOperOrg = financerOperOrg;
    }
    public String getCoreOperOrg() {
        return coreOperOrg;
    }
    public void setCoreOperOrg(String coreOperOrg) {
        this.coreOperOrg = coreOperOrg;
    }

    
}
