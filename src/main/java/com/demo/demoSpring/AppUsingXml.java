package com.demo.demoSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.demoSpring.model.Account;

public class AppUsingXml {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Account account = context.getBean("currentAcc",Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.createCard());
		context.close();
//		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Card card = context.getBean("creditCard",Card.class);
//		System.out.println(card.cardDetails());
//		context.close();
	}
}
