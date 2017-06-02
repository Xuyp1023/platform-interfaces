package com.betterjr.modules.customer;

import java.util.List;
import java.util.Map;

import com.betterjr.common.data.SimpleDataEntity;
import com.betterjr.modules.customer.entity.CustMechBankAccount;

/**
 * 银行帐户
 *
 * @author liuwl
 *
 */
public interface ICustMechBankAccountService {

    /**
     * 查询银行账户列表
     */
    public String webQueryBankAccount(Long anCustNo);

    /**
     * 查询银行账户详情
     */
    public String webFindBankAccount(Long anId);

    /**
     * 查询默认银行账户详情
     */
    public CustMechBankAccount findDefaultBankAccount(Long anId);

    /**
     * 查询银行账户流水详情
     */
    public String webFindBankAccountTmp(Long anId);

    /**
     * 修改代录临时流水
     */
    public String webSaveBankAccountTmp(Map<String, Object> anParam, Long anId, String anFileList);

    /**
     * 变更银行账户-添加变更申请
     */
    public String webAddChangeApply(Map<String, Object> anParam, Long anCustNo);

    /**
     * 变更银行账户-修改变更申请
     */
    public String webSaveChangeApply(Map<String, Object> anParam, Long anApplyId);

    /**
     * 查询变更银行账户详情-变更临时流水表
     */
    public String webFindChangeApply(Long anApplyId, Long anTmpId);

    /**
     * 查询银行账户变更列表
     */
    public String webQueryChangeApply(Long anCustNo, int anFlag, int anPageNum, int anPageSize);

    /**
     * 变更添加   记录添加的记录
     */
    public String webAddChangeBankAccountTmp(Map<String, Object> anParam, String anFileList);

    /**
     * 变更修改   记录从正式表修改的记录
     */
    public String webSaveChangeBankAccountTmp(Map<String, Object> anParam, String anFileList);

    /**
     * 变更删除   记录从正式表删除的记录
     */
    public String webDeleteChangeBankAccountTmp(Long anRefId);

    /**
     * 作废变更
     */
    public String webCancelChangeBankAccountTmp(Long anId);

    /**
     * 查询 变更 已录入未使用记录
     */
    public String webQueryNewChangeBankAccountTmp(Long anCustNo);

    /**
     * 查询 变更 流水记录列表
     */
    public String webQueryChangeBankAccountTmp(Long anApplyId);

    /**
     * 代录添加  记录新添加的代录记录
     */
    public String webAddInsteadBankAccountTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 代录修改   记录从正式表中修改的记录
     */
    public String webSaveInsteadBankAccountTmp(Map<String, Object> anParam, Long anInsteadRecordId, String anFileList);

    /**
     * 代录删除   记录从正式表删除的记录
     */
    public String webDeleteInsteadBankAccountTmp(Long anRefId, Long anInsteadRecordId);

    /**
     * 作废变更
     */
    public String webCancelInsteadBankAccountTmp(Long anId, Long anInsteadRecordId);

    /**
     * 查询 代录 已录入未使用记录
     */
    public String webQueryInsteadBankAccountTmp(Long anInsteadRecordId);

    /**
     * 添加代录记录
     */
    public String webAddInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);

    /**
     * 修改代录记录
     */
    public String webSaveInsteadRecord(Map<String, Object> anParam, Long anInsteadRecordId);

    /**
     * 查询银行账户代表详情-临时流水表
     */
    public String webFindInsteadRecord(Long anInsteadRecordId);

    /**
     * @param anTmpAcco
     * @param anTmpAccoName
     * @return
     */
    public CustMechBankAccount findCustMechBankAccount(String anBankAcco, String anBankAccoName);

	String webQueryBankAccountKeyAndValue(Long anCustNo);

	/**
	 * 根据银行账号查询银行信息
	 * @param anBankAcco
	 * @return
	 */
	String webFindCustMechBankAccount(String anBankAcco);
}
