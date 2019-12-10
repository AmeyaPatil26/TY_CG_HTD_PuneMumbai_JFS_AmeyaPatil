package com.capg.exception.first;

public class Validator {
	void verify(int age) {
		if (age < 18) {
			throw new InvalidAgeException();
		}
	}

}
