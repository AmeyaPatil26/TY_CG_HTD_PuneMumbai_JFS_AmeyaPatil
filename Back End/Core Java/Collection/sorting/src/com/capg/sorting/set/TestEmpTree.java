package com.capg.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestEmpTree {

	public static void main(String[] args) {

		TreeSet<EmployeeTree> ts= new TreeSet<EmployeeTree>();
		
		EmployeeTree e1=new EmployeeTree(1, "Deepa", 2653.2);
		EmployeeTree e2=new EmployeeTree(2, "Theju", 5553.2);
		EmployeeTree e3=new EmployeeTree(3, "Kavya", 2685.4);
		EmployeeTree e4=new EmployeeTree(4, "Nikhita",7523.1);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		Iterator<EmployeeTree> it= ts.iterator();
		while(it.hasNext()) {
			EmployeeTree e=it.next();
			System.out.println("Name is "+e.name);
			System.out.println("id is "+e.id);
			System.out.println("salary is "+e.salary);
			System.out.println("---------------");
			
			
		}
		
	}

}
