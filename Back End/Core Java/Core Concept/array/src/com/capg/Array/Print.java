package com.capg.Array;

interface Test {
	void out();
}

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test m = () -> System.out.println("Good morning");
		m.out();

	}

}
