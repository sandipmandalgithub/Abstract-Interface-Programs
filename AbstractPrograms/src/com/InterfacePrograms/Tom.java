package com.InterfacePrograms;

public class Tom implements Employee{
	@Override
	public void work() {
		System.out.println("Tom is working");

	}


	public static void main(String[] args) {
		Tom t=new Tom();
		System.out.println("Id :"+Employee.id);
		t.work();


	}

}
