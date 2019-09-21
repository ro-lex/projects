package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public enum DebitCategory implements TransactionCategory {
	
	EXPENSES("Expenses", 0, null),
		FOOD("Food", 1, EXPENSES),
			GROCERY("Grocery", 2, FOOD),
			COOKED_FOOD("Cooked Food", 2, FOOD),
				DINE("Dine", 3, COOKED_FOOD),
					TAKE_OUT("Take Out", 4, DINE),
					EAT_IN("Eat In", 4, DINE),
					FAST_FOOD("Fast Food", 4, DINE),
					RETAIL_CAFETERIA("Retail Cafeteria", 4, DINE),
				OFFICE_MEALS("Office Meals", 3, COOKED_FOOD),
					COFFEE("Coffee", 4, OFFICE_MEALS),
					BREAKFAST("Breakfast", 4, OFFICE_MEALS),
					LUNCH("Lunch", 4, OFFICE_MEALS),
					SNACKS("Snacks", 4, OFFICE_MEALS),
	
		FOR_THE_HOME("For the Home", 1, EXPENSES),
			CONSUMABLES("Consumables", 2, FOR_THE_HOME),
			HOME_IMPROVEMENT("Home Improvement", 2, FOR_THE_HOME),
			FURNITURE("Furniture", 2, FOR_THE_HOME),
			FOR_THE_KITCHEN("For the Kitchen", 2, FOR_THE_HOME),
	
		TRANSPORTATION("Transportation", 1, EXPENSES),
			CAR("Car", 2, TRANSPORTATION),
				FUEL("Fuel", 3, CAR),
				SERVICE("Service", 3, CAR),
				INSURANCE("Insurance", 3, CAR),
				PARKING("Parking", 3, CAR),
				TOLL("Toll", 3, CAR),
				EMI("EMI", 3, CAR),
			TRAIN("Train", 2, TRANSPORTATION),
				TRAIN_PARKING("Parking", 3, TRAIN),
				TICKET("Ticket", 3, TRAIN),
			RENTAL("Rental", 2, TRANSPORTATION),
				RENTAL_FUEL("Fuel", 3, RENTAL),
				RATE("Rate", 3, RENTAL),
				RENTAL_INSURANCE("Insurance", 3, RENTAL),
				RENTAL_PARKING("Parking", 3, RENTAL),
				RENTAL_TOLL("Toll", 3, RENTAL),
			FLIGHT("Flight", 2, TRANSPORTATION),
			
		HOUSING("Housing", 1, EXPENSES),
			OWN("Own", 2, HOUSING),
			RENTED("Rented", 2, HOUSING),
				RENT("Rent", 3, RENTED),
				UTILITIES("Utilities", 3, RENTED),
				RENTERS_INSURANCE("Renters Insurance", 3, RENTED),
		
		INTERNET("Internet", 1, EXPENSES),
		PHONE("Phone", 1, EXPENSES),
			DOMESTIC("Domestic", 2, PHONE),
			INTERNATIONAL("International", 2, PHONE),
		ELECTRICITY("Electricity", 1, EXPENSES),
		DRESS("Dress", 1, EXPENSES),
		GIFT("Gift", 1, EXPENSES),
		MEDICAL("Medical", 1, EXPENSES),
		PERSONAL_CARE("Personal Care", 1, EXPENSES),
			GROOMING("Grooming", 2, PERSONAL_CARE),
			LAUNDRY("Laundry", 2, PERSONAL_CARE),
		ENTERTAINMENT("Entertainment", 1, EXPENSES),
			NETFLIX("Netflix", 2, ENTERTAINMENT),
			MOVIES("Movies", 2, ENTERTAINMENT),
	
	
	LOAN("Loan", 0, null),
	
	
	ADJUSTMENT("Adjustment", 0, null),
	
	
	TITHE("Tithe", 0, null),
	
	
	SAVINGS("Savings", 0, null),
		SAVINGS_INDIA("Savings India", 1, SAVINGS),
		SAVINGS_US("Savings US", 1, SAVINGS),
	
	
	INTRA_TRANSFER("Intra Transfer", 0, null);
	
	
	private String categoryName;
	
	private int level;
	
	private DebitCategory parent;

	private DebitCategory(String categoryName, int level, DebitCategory parent) {
		this.categoryName = categoryName;
		this.level = level;
		this.parent = parent;
	}
	
	@Override
	public String toString() {
		return this.categoryName;
	}
	

}
