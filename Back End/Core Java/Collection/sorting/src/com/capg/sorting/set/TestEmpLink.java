package com.capg.sorting.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestEmpLink {

	public static void main(String[] args) {
		LinkedHashSet<Employee> lhs=new LinkedHashSet<Employee>();
		Employee e1=new Employee(201,"Raju",20335.23);
		Employee e2=new Employee(202,"Baban",5323.96);
		Employee e3=new Employee(203,"Deepa",15230.5);
		Employee e4=new Employee(204,"Dip",18562.3);
		Employee e5=new Employee(205,"Anuj",25361.2);
		
		lhs.add(e1);
		lhs.add(e2);
		lhs.add(e3);
		lhs.add(e4);
		lhs.add(e5);
		
		System.out.println("*****using for each*****");
		for (Employee r : lhs) {
			System.out.println("Id is "+r.id);
			System.out.println("Name is "+r.name);
			System.out.println("Salary is "+r.salary);
			System.out.println("---------------");
		}
		
		System.out.println("*****using Iterartor******");
	 Iterator<Employee> it= lhs.iterator();
	 while(it.hasNext()) {
		 Employee r =it.next();
		System.out.println("Id is "+r.id);
		System.out.println("Name is "+r.name);
		System.out.println("Salary is "+r.salary);
		System.out.println("---------------");
		 
	}
		
	}


}
