package com.capg.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestEmp {

	public static void main(String[] args) {

		HashSet<Employee> hs=new HashSet<Employee>();
		Employee e1=new Employee(201,"Dhanya",20335.23);
		Employee e2=new Employee(202,"Theju",5323.96);
		Employee e3=new Employee(203,"Nikhita",15230.5);
		Employee e4=new Employee(204,"Kavya",18562.3);
		Employee e5=new Employee(202,"Theju",5323.96);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("*****using for each*****");
		for (Employee r : hs) {
			System.out.println("Id is "+r.id);
			System.out.println("Name is "+r.name);
			System.out.println("Salary is "+r.salary);
			System.out.println("---------------");
		}
		
		System.out.println("*****using Iterartor******");
	 Iterator<Employee> it= hs.iterator();
	 while(it.hasNext()) {
		 Employee r =it.next();
		System.out.println("Id is "+r.id);
		System.out.println("Name is "+r.name);
		System.out.println("Salary is "+r.salary);
		System.out.println("---------------");
		 
	}
		
	}

}
