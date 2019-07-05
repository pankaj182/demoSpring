package com.demo.demoSpring.App;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.demoSpring.config.BankConfig;
import com.demo.demoSpring.model.Account;

public class AppUsingAnnotations {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
		Account account = context.getBean("getCurrentAccount",Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.createCard());
		context.close();
	}
}
