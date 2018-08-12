package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class Payer implements TransactionInitiator {
	
	private String payerName;

	@Override
	public String getInitiatorType() {
		return "Payer";
	}

	public String getPayerName() {
		return payerName;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	
	

}
