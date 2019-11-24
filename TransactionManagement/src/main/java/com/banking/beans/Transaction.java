package com.banking.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "Transactions")
@EntityListeners(AuditingEntityListener.class)
public class Transaction {

	public Transaction(long accNum, long custId, String transType, String transMedium, String transDesc,
			double transAmt, String currency, Date createDt, double currentBalance, String status) {
		super();
		this.transId = transId;
		this.accNum = accNum;
		this.custId = custId;
		this.transType = transType;
		this.transMedium = transMedium;
		this.transDesc = transDesc;
		this.transAmt = transAmt;
		this.currency = currency;
		this.createDt = createDt;
		this.currentBalance = currentBalance;
		this.status = status;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long transId;
	public long getTransId() {
		return transId;
	}
	public void setTransId(long transId) {
		this.transId = transId;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransMedium() {
		return transMedium;
	}
	public void setTransMedium(String transMedium) {
		this.transMedium = transMedium;
	}
	public String getTransDesc() {
		return transDesc;
	}
	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}
	public double getTransAmt() {
		return transAmt;
	}
	public void setTransAmt(double transAmt) {
		this.transAmt = transAmt;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name = "Account_num", nullable = false)
	private long accNum;
	@Column(name = "cust_id", nullable = false)
	private long custId;
	@Column(name = "trans_type", nullable = false)
	private String transType;
	@Column(name = "trans_medsium", nullable = false)
	private String transMedium;
	@Column(name = "trans_desc", nullable = false)
	private String transDesc;
	@Column(name = "trans_amt", nullable = false)
	private double transAmt;
	@Column(name = "currency", nullable = false)
	private String currency;
	@Column(name = "create_Dt", nullable = false)
	private Date createDt;
	@Column(name = "balance", nullable = false)
	private double currentBalance;
	@Column(name = "status", nullable = false)
	private String status;

}
