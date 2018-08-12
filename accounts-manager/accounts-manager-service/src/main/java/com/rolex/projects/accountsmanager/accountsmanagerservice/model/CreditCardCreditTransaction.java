package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class CreditCardCreditTransaction extends CreditTransaction {
	
	private CreditCard creditCard;

	@Override
	public CreditCard getTransactionMode() {
		return this.creditCard;
	}

	@Override
	public void setTransactionMode(TransactionMode transactionMode) {
		this.creditCard = (CreditCard) transactionMode;
	}

}
