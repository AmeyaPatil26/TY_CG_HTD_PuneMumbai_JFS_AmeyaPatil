package com.capg.exception.first;

public class TestC {

	public static void main(String[] args) {
		System.out.println("main started");
		int[] a = new int[3];
		try {
			System.out.println(a[1]);
			System.out.println(10 / 0);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("dont cross array boundry");
		} 
		catch (ArithmeticException i) {

			System.out.println("dont divide by zero");
		}
		catch(Exception e) {
			System.out.println("i am general catch block");
		}
		System.out.println("main ended");
	}

	}
