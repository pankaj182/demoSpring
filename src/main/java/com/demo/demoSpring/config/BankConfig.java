package com.demo.demoSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.demo.demoSpring.model.Account;
import com.demo.demoSpring.model.Card;
import com.demo.demoSpring.model.CreditCard;
import com.demo.demoSpring.model.CurrentAccount;
/**
 * Needed if you register beans through annotations
 * No XMl required in this method
 * @author I348491
 *
 */
@Configuration
public class BankConfig {
	
	@Bean
	public Card getCreditCard() {
		return new CreditCard();
	}
	
	@Bean(initMethod = "onInit", destroyMethod = "onDestroy")
	@Scope("prototype")
	public Account getCurrentAccount() {
		return new CurrentAccount();
	}
}
