package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public interface TransactionDetails {
	
	TransactionCategory[] getTransactionCategories();
	
	void setTransactionCategories(TransactionCategory[] transactionCategories);
	
	String[] getTags();
	
	void setTags(String[] tags);
	
	

}
