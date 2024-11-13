package com.accenture.sai.paymentsProcessingSystem;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Payments payment=new CreditCardPayment();
    	payment.payment();
    	
    	Payments payment1=new PayPalPayment();
    	payment1.payment();
    }
}
