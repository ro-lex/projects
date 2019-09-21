package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum AccountType {
	
	SAVINGS("Savings"),
	CHECKING("Checking"),
	HSA("HSA");
	
	private String name;

	private AccountType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
