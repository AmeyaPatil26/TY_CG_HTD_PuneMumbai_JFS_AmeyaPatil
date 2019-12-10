package com.capg.corejava.Abstraction;

public class SBI implements ATM {

	@Override
	public void validateCard() {
		System.out.println(".....Connecting to SBI DB");
		System.out.println("Card validate");
	}

	@Override
	public void getInfo() {
		System.out.println(".....Connecting to SBI DB");
		System.out.println("Get info");
	}

}
