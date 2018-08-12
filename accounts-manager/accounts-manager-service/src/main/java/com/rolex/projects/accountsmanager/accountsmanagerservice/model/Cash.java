package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class Cash implements TransactionMode {

	@Override
	public TransactionModeType getTransactionMode() {
		return TransactionModeType.CASH;
	}
}
