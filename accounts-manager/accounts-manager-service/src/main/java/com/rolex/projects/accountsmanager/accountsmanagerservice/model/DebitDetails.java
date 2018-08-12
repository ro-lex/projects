package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

import java.util.Arrays;

public class DebitDetails implements TransactionDetails {
	
	private DebitCategory[] categories;
	
	private String[] tags;
	
	public DebitDetails() {
		super();
	}
	
	public DebitDetails(DebitCategory[] categories, String[] tags) {
		super();
		this.categories = categories;
		this.tags = tags;
	}

	@Override
	public DebitCategory[] getTransactionCategories() {
		return categories;
	}

	@Override
	public void setTransactionCategories(TransactionCategory[] categories) {
		this.categories = (DebitCategory[])categories;
	}

	@Override
	public String[] getTags() {
		return tags;
	}

	@Override
	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "DebitDetails [categories=" + Arrays.toString(categories) + ", tags=" + Arrays.toString(tags) + "]";
	}
	
}
