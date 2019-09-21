package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class CheckingAccount extends Account {

	private AccountType accountType;
	
	@Override
	public void setAccountType(AccountType accountType) {
		this.accountType = AccountType.CHECKING;
	}

	@Override
	public AccountType getAccountType() {
		return this.accountType;
	}

}
