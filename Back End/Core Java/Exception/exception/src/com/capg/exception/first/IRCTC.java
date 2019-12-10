package com.capg.exception.first;

public class IRCTC {
	void confirm()
	{
		System.out.println("Confirm started");
		try {
		System.out.println(10/0);
		}
		catch (ArithmeticException e) {

		System.out.println("Exp caught at confirm");}
		System.out.println("confirm ended");
		
	}
}
