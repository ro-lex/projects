package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public abstract class CreditTransaction extends Transaction {
	
	private CreditDetails creditDetails;
	
	private Payer payer;

	@Override
	public TransactionType getTransactionType() {
		return TransactionType.CREDIT;
	}

	@Override
	public CreditDetails getTransactionDetails() {
		return this.creditDetails;
	}

	@Override
	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.creditDetails = (CreditDetails) transactionDetails;
		
	}

	@Override
	public Payer getTransactionInitiator() {
		return this.payer;
	}

	@Override
	public void setTransactionInitiator(TransactionInitiator transactionInitiator) {
		this.payer = (Payer) transactionInitiator;
	}

}
