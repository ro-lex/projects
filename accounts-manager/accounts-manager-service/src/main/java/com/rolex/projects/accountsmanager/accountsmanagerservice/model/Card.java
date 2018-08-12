package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public abstract class Card implements TransactionMode {
	
	private FinancialInstitutionType financialInstitution;
	
	public abstract CardType getCardType();

	public abstract void setCardType(CardType cardType);
	
	public FinancialInstitutionType getFinancialInstitution() {
		return financialInstitution;
	}

	public void setFinancialInstitution(FinancialInstitutionType financialInstitution) {
		this.financialInstitution = financialInstitution;
	}
	
	@Override
	public TransactionModeType getTransactionMode() {
		return TransactionModeType.CARD;
	}
	
}
