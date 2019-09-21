package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public abstract class Account implements TransactionMode {
	
	private String balance;
	
	private FinancialInstitutionType financialInstitution;

	public abstract AccountType getAccountType();

	public abstract void setAccountType(AccountType accountType) ;

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public FinancialInstitutionType getFinancialInstitution() {
		return financialInstitution;
	}

	public void setFinancialInstitution(FinancialInstitutionType financialInstitution) {
		this.financialInstitution = financialInstitution;
	}
	
	@Override
	public TransactionModeType getTransactionMode() {
		return TransactionModeType.ACCOUNT;
	}

}
