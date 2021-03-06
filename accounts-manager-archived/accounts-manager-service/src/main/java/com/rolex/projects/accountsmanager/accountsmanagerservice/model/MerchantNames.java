package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum MerchantNames {
	
	AMAZON("Amazon"),
	
	BBQ_TONIGHT("BBQ Tonight"),
	
	CHIPOTLE("Chipotle"),
	COSTCO("Costco"),
	
	DUNKIN_DONUTS("Dunkin Donuts"),
	
	HOT_BREADS("Hot Breads"),
	HYDERABAD_HOUSE("Hyderabad House"),

	KAIRALI("Kairali"),
	KFC("KFC"),
	KOHLS("Kohls"),
	
	MACYS("Macys"),
	MARIANOS("Marianos"),
	MCDONALDS("McDonalds"),
	
	PARADISE_BIRIYANI_POINTE("Paradise Biriyani Pointe"),
	PATELS("Patels"),
	
	SEARS("Sears"),
	SUBWAY("Subway"),
	
	VALLI_PRODUCE("Valli Produce"),
	
	WALMART("Walmart"),
	
	OTHER("Other"),
	
	NA("NA");
	
	private String name;

	private MerchantNames(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
}
