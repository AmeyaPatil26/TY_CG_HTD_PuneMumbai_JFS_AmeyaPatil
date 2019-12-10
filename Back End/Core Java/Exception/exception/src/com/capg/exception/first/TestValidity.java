package com.capg.exception.first;

public class TestValidity {

	public static void main(String[] args) {

		Validator v = new Validator();
		try {
			v.verify(2);
			System.out.println("Welcome");
		} catch (InvalidAgeException e) {
			
			System.err.println(e.getMessage());
		}

	}

}
