package com.betterjr.modules.client.data;

import com.betterjr.common.data.BaseRemoteEntity;
import com.betterjr.common.entity.BetterjrEntity;

public interface ScfClientDataParentFace extends BetterjrEntity, BaseRemoteEntity {

    public String getOperOrg();

    public void setOperOrg(String operOrg);

    public void setCustNo(Long anCustNo);

    public Long getCustNo();

    // XXX 如果确定关系的数据 使用确定编号
    public void setCoreCustNo(Long anCoreCustNo);

    public void setModiDate(String anModiDate);

    public String getBtNo();

    public String getBankAccount();

    public String findBankAccountName();

    public void fillDefaultValue();

    public void modifytValue();

    // XXX 核心企业
    public String getCoreOperOrg();

    public void setCoreOperOrg(String anCoreOperOrg);

}
