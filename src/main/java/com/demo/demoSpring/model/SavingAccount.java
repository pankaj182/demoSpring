package com.demo.demoSpring.model;

public class SavingAccount implements Account{
	private Card card;
	
	@Override
	public String createAccount() {
		return "savings account creates";
	}

	@Override
	public String createCard() {
		// TODO Auto-generated method stub
		return card.cardDetails();
	}
}
