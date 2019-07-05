package com.demo.demoSpring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CurrentAccount implements Account {
	
	/*
	 * use @Autowired if generating beans through annotations
	 * comment it if you are using XML for configuration
	 */
	@Autowired
	private Card card;
	
	/*
	 * Required if using XML for configuration
	 * Comment it if using Annotations 
	 */
	public CurrentAccount(Card card) {
		this.card = card;
	}
	
	@Override
	public String createAccount() {
		return "current account created";
	}

	@Override
	public String createCard() {
		return card.cardDetails();
	}

	public void onInit() {
		// initializations etc
		System.out.println("inside init");
	}

	public void onDestroy() {
		// cleanup codes
		System.out.println("inside destroy");
	}

}
