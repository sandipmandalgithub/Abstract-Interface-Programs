package com.Abstract;

// CONTRACT of ABSTRACT ---1)OVERRIDE THE ABSTRACT METHOD
//2) MAKE THE CLASS AS ABSTRACT CLASS

public  class Tom extends Person{
	@Override
	void walk() {
		System.out.println("Tom is Walking.....");
	}

	public static void main(String[] args) {
		Tom t=new Tom();
		t.walk();
		

	}

}
