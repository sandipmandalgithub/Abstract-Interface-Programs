package com.InterfacePrograms;

public class Customer implements ATM {
	@Override
	public void deposite() {
		System.out.println("Deposite the money sucessfully");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdrawn the money successfully");
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.deposite();
		c.withdraw();
		
		
	}

}
