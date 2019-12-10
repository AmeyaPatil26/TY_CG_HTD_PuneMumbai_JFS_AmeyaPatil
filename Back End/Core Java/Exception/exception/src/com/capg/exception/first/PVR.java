package com.capg.exception.first;

public class PVR {
	void confirm() {
		System.out.println("confirm started");

		try {
			System.out.println(10 / 0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Exp caught at confirm");
			throw e;
		}

		finally {
			System.out.println("confirm ended");
		}
	}
}
