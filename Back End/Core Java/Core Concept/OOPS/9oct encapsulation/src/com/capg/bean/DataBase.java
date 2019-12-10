package com.capg.bean;

public class DataBase {
	void recieve(Student t) {
		System.out.println("******I am DataBase *********");

		System.out.println("Id is " + t.getId());
		System.out.println("Name is " + t.getName());
		System.out.println("Height is " + t.getHeight());

	}
	
	void recieve(Employee e) {
		
		System.out.println("***Employee details****");
		System.out.println("Id is " + e.getId());
		System.out.println("Name is " + e.getName());
		System.out.println("Salary is " + e.getSalary());
		System.out.println("Role is "+e.getRole());
		System.out.println("Department is "+e.getDepartment());
		
		
	}
}
