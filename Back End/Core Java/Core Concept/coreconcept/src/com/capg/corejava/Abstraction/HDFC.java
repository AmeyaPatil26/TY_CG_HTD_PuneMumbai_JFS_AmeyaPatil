package com.capg.corejava.Abstraction;

public class HDFC implements ATM {

	@Override
	public void validateCard() {
		System.out.println("......Connecting to HDFC DB");
		System.out.println("Card validate");
	}

	@Override
	public void getInfo() {
		System.out.println(".......Connecting to HDFC DB");
		System.out.println("getting info");

	}

}
