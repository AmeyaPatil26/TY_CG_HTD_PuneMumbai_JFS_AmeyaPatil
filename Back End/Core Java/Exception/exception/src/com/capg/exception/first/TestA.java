package com.capg.exception.first;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started");

		int[] a = new int[3];
		try {
			System.out.println("hi");
			System.out.println(a[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("dont cross array boundry");
		}

		System.out.println("main end");

	}
}
