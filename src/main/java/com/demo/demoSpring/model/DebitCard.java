package com.demo.demoSpring.model;

public class DebitCard implements Card {

	@Override
	public String cardDetails() {
		return "debit card issued";
	}
}
