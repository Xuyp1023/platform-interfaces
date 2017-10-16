package com.betterjr.modules.workflow.entity;

import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.betterjr.common.annotation.MetaData;
import com.betterjr.common.entity.BetterjrEntity;
import com.betterjr.modules.workflow.data.FlowInput;

@Access(AccessType.FIELD)
@Entity
@Table(name = "t_cust_flow_money")
public class CustFlowMoney implements BetterjrEntity {

    public static final BigDecimal MaxAmount = new BigDecimal("-1");
    public static final Long DefaultMoney = 5000l;
    /**
     * 审批金额段编号
     */
    @Id
    @Column(name = "ID", columnDefinition = "INTEGER")
    @MetaData(value = "审批金额段编号", comments = "审批金额段编号")
    private Long id;

    /**
     * 最小金额(单位=元),默认是0
     */
    @Column(name = "F_ADUIT_MIN_AMOUNT", columnDefinition = "DECIMAL")
    @MetaData(value = "最小金额(单位=元)", comments = "最小金额(单位=元)")
    private BigDecimal auditMinAmount = new BigDecimal("0");

    /**
     * 最大金额(单位=元) ,-1表示无限大
     */
    @Column(name = "F_ADUIT_MAX_AMOUNT", columnDefinition = "DECIMAL")
    @MetaData(value = "最大金额(单位=元)", comments = "最大金额(单位=元)")
    private BigDecimal auditMaxAmount = MaxAmount;

    /**
     * 是否全金额段审批，0：不是，1：是
     */
    @Column(name = "C_ADUIT_ALL", columnDefinition = "VARCHAR")
    @MetaData(value = "是否全金额段审批", comments = "是否全金额段审批，0：不是，1：是")
    private String aduitAll;

    private static final long serialVersionUID = 1469677920735L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAuditMinAmount() {
        return auditMinAmount;
    }

    public void setAuditMinAmount(BigDecimal auditMinAmount) {
        this.auditMinAmount = auditMinAmount;
    }

    public BigDecimal getAuditMaxAmount() {
        return auditMaxAmount;
    }

    public void setAuditMaxAmount(BigDecimal auditMaxAmount) {
        this.auditMaxAmount = auditMaxAmount;
    }

    public String getAduitAll() {
        return aduitAll;
    }

    public void setAduitAll(String aduitAll) {
        this.aduitAll = aduitAll == null ? null : aduitAll.trim();
    }

    public boolean isContain(BigDecimal in) {
        if (in == null) {
            return false;
        }
        if (this.auditMinAmount.compareTo(in) == -1
                && (this.auditMaxAmount.compareTo(in) == 0 || this.auditMaxAmount.compareTo(in) > 0)) {
            return true;
        }
        return false;
    }

    public String toSpelExpression() {
        StringBuilder builder = new StringBuilder();
        builder.append("#").append(FlowInput.MoneyPara);
        builder.append(" > ").append(this.auditMinAmount);
        if (this.auditMaxAmount.compareTo(MaxAmount) != 0) {
            builder.append(" and ");
            builder.append("#").append(FlowInput.MoneyPara);
            builder.append(" <= ").append(this.auditMaxAmount);
        }
        return builder.toString();
    }

    public String toDisplayName() {
        StringBuilder builder = new StringBuilder();
        builder.append(" > ").append(this.auditMinAmount.longValue());
        if (this.auditMaxAmount.compareTo(MaxAmount) != 0) {
            builder.append(" , ");
            builder.append(" <= ").append(this.auditMaxAmount.longValue());
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", auditMinAmount=").append(auditMinAmount);
        sb.append(", auditMaxAmount=").append(auditMaxAmount);
        sb.append(", aduitAll=").append(aduitAll);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CustFlowMoney other = (CustFlowMoney) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getAuditMinAmount() == null ? other.getAuditMinAmount() == null
                        : this.getAuditMinAmount().equals(other.getAuditMinAmount()))
                && (this.getAuditMaxAmount() == null ? other.getAuditMaxAmount() == null
                        : this.getAuditMaxAmount().equals(other.getAuditMaxAmount()))
                && (this.getAduitAll() == null ? other.getAduitAll() == null
                        : this.getAduitAll().equals(other.getAduitAll()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAuditMinAmount() == null) ? 0 : getAuditMinAmount().hashCode());
        result = prime * result + ((getAuditMaxAmount() == null) ? 0 : getAuditMaxAmount().hashCode());
        result = prime * result + ((getAduitAll() == null) ? 0 : getAduitAll().hashCode());
        return result;
    }
}