package com.capg.corejava.Abstraction;

public class ICICI implements ATM {

	@Override
	public void validateCard() {
		System.out.println("....Connecting to ICICI DB");
		System.out.println("Card validate");
	}

	@Override
	public void getInfo() {
		System.out.println("....Connecting to ICICI DB");
		System.out.println("getting info");
	}

}
