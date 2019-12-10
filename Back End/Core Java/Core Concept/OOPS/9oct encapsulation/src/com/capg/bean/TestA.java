package com.capg.bean;

public class TestA {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(20);
		s.setName("Dimple");
		s.setHeight(5.7);
		
		
		Employee e=new Employee();
		e.setId(201);
		e.setName("Raju");
		e.setSalary(23531.12);
		e.setRole("Developer");
		e.setDepartment("Comps");
		
		DataBase db=new DataBase();
		db.recieve(s);
		db.recieve(e);
		
		
	}

}
