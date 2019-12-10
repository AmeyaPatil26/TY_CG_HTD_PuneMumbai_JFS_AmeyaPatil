package com.capg.exception.first;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc= new Scanner(System.in))
		{
			System.out.println("Enter the age");
			int age=sc.nextInt();
			
			System.out.println("Age is "+age);
		}
		
		
		
		

	}

}
