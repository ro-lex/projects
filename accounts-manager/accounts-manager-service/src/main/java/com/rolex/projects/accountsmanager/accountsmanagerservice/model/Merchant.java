package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class Merchant implements TransactionInitiator {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getInitiatorType() {
		return "Merchant";
	}

}
