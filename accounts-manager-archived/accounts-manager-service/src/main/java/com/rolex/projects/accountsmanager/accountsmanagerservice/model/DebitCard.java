package com.rolex.projects.accountsmanager.accountsmanagerservice.model;

public class DebitCard extends Card {
	
	private CardType cardType;

	@Override
	public void setCardType(CardType cardType) {
		this.cardType = CardType.DEBIT_CARD;
	}

	@Override
	public CardType getCardType() {
		return this.cardType;
	}

}
