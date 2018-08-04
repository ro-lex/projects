package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum TransactionModeType {
	
	ACCOUNT("Account"),
	CARD("Card"),
	CASH("Cash");
	
	private String name;

	private TransactionModeType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
