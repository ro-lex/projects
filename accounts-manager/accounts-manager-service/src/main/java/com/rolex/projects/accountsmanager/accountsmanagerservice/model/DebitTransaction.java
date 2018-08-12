package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public abstract class DebitTransaction extends Transaction {
	
	private DebitDetails debitDetails;
	
	private Merchant merchant;

	@Override
	public TransactionType getTransactionType() {
		return TransactionType.DEBIT;
	}

	@Override
	public DebitDetails getTransactionDetails() {
		return this.debitDetails;
	}

	@Override
	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.debitDetails = (DebitDetails) transactionDetails;		
	}

	@Override
	public Merchant getTransactionInitiator() {
		return this.merchant;
	}

	@Override
	public void setTransactionInitiator(TransactionInitiator transactionInitiator) {
		this.merchant = (Merchant) transactionInitiator;
	}

}
