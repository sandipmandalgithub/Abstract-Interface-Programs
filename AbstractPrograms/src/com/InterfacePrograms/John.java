package com.InterfacePrograms;

public class John extends Amazon implements JSpider,QSpider {
	@Override
	public void developApp() {
		System.out.println("Develop the app");
	}
	@Override
	public void testApp() {
		System.out.println("Testing the app");
	}
	
	//OPTINALLY WE CAN OVERRIDE WORK()METHOD FROM AMAZON CLASS AS WELL
	//BUT IT IS NOT MANDATORY BECAUSE WORK() METHOD IS ALREADY A CONCRETE METHOD
	
	public static void main(String[] args) {
		John j=new John();
		j.developApp();
		j.testApp();
		
	}

}
