package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum CardType {
	
	DEBIT_CARD("Debit Card"),
	CREDIT_CARD("Credit Card");
	
	private String name;

	private CardType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
