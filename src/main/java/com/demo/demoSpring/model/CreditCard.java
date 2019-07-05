package com.demo.demoSpring.model;

public class CreditCard implements Card {

	@Override
	public String cardDetails() {
		return "credit card issued";
	}
}
