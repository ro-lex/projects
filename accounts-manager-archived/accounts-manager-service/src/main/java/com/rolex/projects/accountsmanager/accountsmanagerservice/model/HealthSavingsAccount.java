package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class HealthSavingsAccount extends Account {
	
	private AccountType accountType;

	@Override
	public void setAccountType(AccountType accountType) {
		this.accountType = AccountType.HSA;
	}

	@Override
	public AccountType getAccountType() {
		return this.accountType;
	}

}
