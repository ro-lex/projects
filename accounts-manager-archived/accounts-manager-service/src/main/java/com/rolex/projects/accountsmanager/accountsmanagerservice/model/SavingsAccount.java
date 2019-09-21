package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class SavingsAccount extends Account {

	private AccountType accountType;
	
	@Override
	public void setAccountType(AccountType accountType) {
		this.accountType = AccountType.SAVINGS;
	}

	@Override
	public AccountType getAccountType() {
		return this.accountType;
	}

}
