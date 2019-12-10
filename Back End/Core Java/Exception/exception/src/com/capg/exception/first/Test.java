package com.capg.exception.first;

public class Test {

	public static void main(String[] args) {
System.out.println("Main started");
	
	Paytm p =new Paytm();
	try {
	p.book();
	}
	catch (ArithmeticException e) {
System.out.println("Exp caught at main");
	}
	
	
	System.out.println("Main ended");
	}

}
