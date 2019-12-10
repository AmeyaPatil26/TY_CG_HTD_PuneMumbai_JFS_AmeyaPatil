package com.capg.exception.first;

public class Paytm {
	void book() {
		System.out.println("Book started");

		IRCTC i = new IRCTC();
		try {
		i.confirm();
		}
		catch (ArithmeticException e) {

		System.out.println("Exp caught at book");}
		System.out.println("book ended");

	}

}
