package com.capg.Array;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();

		System.out.println("Enter the age");
		int age = sc.nextInt();

		System.out.println("Enter the height");
		double height = sc.nextDouble();

		System.out.println("name is " + name);
		System.out.println("age is " + age);
		System.out.println("height is " + height);
	}

}
