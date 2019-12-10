package com.capg.corejava.Abstraction;

public interface ATM {
	/*
	 * it is an interface where only method write without body it validatecard and
	 * getinfo which implemented by child class
	 */
	void validateCard();

	void getInfo();

}
