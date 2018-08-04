package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum CreditCategory {
	
	SALARY("Salary"),
	TAX_REFUND("Tax Refund"),
	INTEREST("Interest"),
	LOAN_REPAYMENT("Loan Repayment"),
	ADJUSTMENT("Adjustment"),
	REWARDS("Rewards"),
	CASH_DEPOSIT("Cash Deposit"),
	REFUND("Refund");
	
	private String name;

	private CreditCategory(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
