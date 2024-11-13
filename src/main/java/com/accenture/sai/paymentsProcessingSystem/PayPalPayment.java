package com.accenture.sai.paymentsProcessingSystem;

public class PayPalPayment extends Payments {
	

	public PayPalPayment() {
		super("PaPal");
	}
	public void payment() {
		System.out.println("PayPal payment");
	}

}
