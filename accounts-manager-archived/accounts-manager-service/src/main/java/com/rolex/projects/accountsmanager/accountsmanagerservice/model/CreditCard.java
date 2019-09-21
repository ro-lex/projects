package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class CreditCard extends Card {
	
	private CreditCardProduct creditCardProduct;
	
	private CardType cardType;

	public CreditCardProduct getCreditCardProduct() {
		return creditCardProduct;
	}

	public void setCreditCardProduct(CreditCardProduct creditCardProduct) {
		this.creditCardProduct = creditCardProduct;
	}

	@Override
	public void setCardType(CardType cardType) {
		this.cardType = CardType.CREDIT_CARD;
	}

	@Override
	public CardType getCardType() {
		return this.cardType;
	}

}
