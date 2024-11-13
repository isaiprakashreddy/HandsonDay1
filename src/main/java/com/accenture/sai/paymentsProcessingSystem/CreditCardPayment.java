package com.accenture.sai.paymentsProcessingSystem;

public class CreditCardPayment extends Payments {

	
	public CreditCardPayment() {
		super("Credit Card");
	}
	
	public void payment()
	{
		System.out.println("Credit card payment");
	}

}
