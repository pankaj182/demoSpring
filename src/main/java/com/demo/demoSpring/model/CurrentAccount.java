package com.demo.demoSpring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CurrentAccount implements Account {
	
	/*
	 * use @Autowired for Dependency Injection through annotations
	 * comment it if you are using XML for DI
	 */
	@Autowired
	private Card card;
	
	public CurrentAccount() {
	}
	
	/*
	 * Required if using XML for DI
	 * Comment it if you are using Annotations for DI
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
