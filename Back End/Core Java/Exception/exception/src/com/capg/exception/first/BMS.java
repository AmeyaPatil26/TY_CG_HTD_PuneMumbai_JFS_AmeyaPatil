package com.capg.exception.first;

public class BMS {

	public static void main(String[] args) {
		PVR p = new PVR();
		System.out.println("main started");
		try {
			p.confirm();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exc caught at BMS ");
		}

		System.out.println("main ended");
	}

}
