package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum CreditCategory implements TransactionCategory{
	
	SALARY("Salary", 0, null),
	TAX_REFUND("Tax Refund", 0, null),
	INTEREST("Interest", 0, null),
	LOAN_REPAYMENT("Loan Repayment", 0, null),
	ADJUSTMENT("Adjustment", 0, null),
	REWARDS("Rewards", 0, null),
	CASH_DEPOSIT("Cash Deposit", 0, null),
	REFUND("Refund", 0, null);
	
	private String categoryName;
	
	private int level;
	
	private CreditCategory parent;

	private CreditCategory(String categoryName, int level, CreditCategory parent) {
		this.categoryName = categoryName;
		this.level = level;
		this.parent = parent;
	}
	
	@Override
	public String toString() {
		return this.categoryName;
	}

}
