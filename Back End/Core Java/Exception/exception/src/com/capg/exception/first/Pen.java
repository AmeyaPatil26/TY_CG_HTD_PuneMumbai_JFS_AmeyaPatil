package com.capg.exception.first;

public class Pen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("please dont divide by zero");
		}
		System.out.println("main ended");

	}
}
