package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class CreditDetails implements TransactionDetails {
	
	private CreditCategory[] categories;
	
	private String[] tags;

	public CreditDetails() {
		super();
	}

	public CreditDetails(CreditCategory[] categories, String[] tags) {
		super();
		this.categories = categories;
		this.tags = tags;
	}

	@Override
	public CreditCategory[] getTransactionCategories() {
		return categories;
	}

	@Override
	public void setTransactionCategories(TransactionCategory[] categories) {
		this.categories = (CreditCategory[])categories;
	}

	@Override
	public String[] getTags() {
		return tags;
	}

	@Override
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
}
