package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

import java.math.BigDecimal;

public abstract class Transaction {
	
	private BigDecimal amount;
	
	private String transactionDate;
	
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public abstract TransactionMode getTransactionMode();

	public abstract void setTransactionMode(TransactionMode transactionMode);

	public abstract TransactionMetadata getTransactionMetadata();

	public abstract void setTransactionMetadata(TransactionMetadata transactionMetadata);
	
}
