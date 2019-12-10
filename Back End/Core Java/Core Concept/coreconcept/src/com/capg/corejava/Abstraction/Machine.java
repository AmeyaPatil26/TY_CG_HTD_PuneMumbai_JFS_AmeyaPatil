package com.capg.corejava.Abstraction;

public class Machine {
	void slot(ATM a) {
		/*
		 * it is parent so we can access child i.e ATM is parent so we can directly
		 * access other by giving it as a object
		 */
		a.validateCard();
		a.getInfo();
	}

}
