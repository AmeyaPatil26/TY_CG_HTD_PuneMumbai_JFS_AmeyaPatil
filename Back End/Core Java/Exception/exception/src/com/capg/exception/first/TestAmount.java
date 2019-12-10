package com.capg.exception.first;

public class TestAmount {

	public static void main(String[] args) {
		Amount a = new Amount();
		try {
			a.check(4000);
			System.out.println("Collect cash");
		} catch (InvalidLimitException e) {
			e.printStackTrace();
		}

	}

}
