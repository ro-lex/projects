package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum CreditCardProduct {
	
	AMEX_BLUE_CASH_EVERYDAY("AmEx Blue Cash Everyday"),
	CHASE_FREEDOM("Chase Freedom"),
	CHASE_FREEDOM_UNLIMITED("Chase Freedom Unlimited"),
	CHASE_SLATE("Chase Slate"),
	CITI_DOUBLE_CASH("Citi Double Cash"),
	KOHLS_CHARGE("Kohls Charge")	;
	
	private String name;

	private CreditCardProduct(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
