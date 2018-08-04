package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum FinancialInstitutionType {
	
	CHASE("Chase", "USA"),
	CITI("Citi", "USA"),
	CAPITALONE("Capital One", "USA"),
	AMERICAN_EXPRESS("American Express", "USA"),
	STATE_BANK_OF_INDIA("State Bank of India", "India"),
	ICICI("ICICI","India"),
	PAYFLEX("Payflex", "USA");
	
	private String name;
	
	private String country;
	
	FinancialInstitutionType(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}
	
}
