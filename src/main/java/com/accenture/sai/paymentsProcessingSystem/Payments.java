package com.accenture.sai.paymentsProcessingSystem;

public abstract class Payments implements MyCard{
	
	public String paymentType;
	
	
	Payments(String paymentType){
		this.paymentType=paymentType;
	}
	
}
