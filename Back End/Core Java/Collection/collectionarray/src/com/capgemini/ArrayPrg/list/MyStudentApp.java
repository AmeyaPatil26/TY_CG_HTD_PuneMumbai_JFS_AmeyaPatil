package com.capgemini.ArrayPrg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStudentApp {
	int id;
	String name;
	double percentage;
	
	ArrayList al=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	void add()
	{
		MyStudentApp s=new MyStudentApp();
		System.out.println("Name is "+s.name);
		sc.next();
		System.out.println(" Id is "+s.id);
		sc.nextInt();
		System.out.println("Percentage is "+s.percentage);
		sc.nextDouble();
		
	}
	
	void display() {
		
	}
	
}
