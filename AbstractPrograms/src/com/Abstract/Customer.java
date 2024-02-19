package com.Abstract;

public class Customer extends Paytm{
	@Override
	void purchase() {
		System.out.println("Purchasing Dell Laptop");
		
	}
	@Override
	
	void pay() {
		System.out.println("Paying Rs.36000");
		
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.purchase();
		c.pay();
		
			
		

	}

}
