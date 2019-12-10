package com.capgemini.junit;

public class Test {

	public static void main(String[] args) {
		
		Student s = new Student("Divya",67.9,'F');
		Student s2 = new Student("simran",36.8,'F');
		
		School sc = new School();
		sc.registerStudent(null);
		
		Student regStu = sc.registerStudent(s);
		Student regStu2 = sc.registerStudent(s2);
		
		System.out.println("Id is "+regStu.getId());
		System.out.println("Name is "+regStu.getName());
		
		System.out.println("---------------------------");
		System.out.println("Id is "+regStu2.getId());
		System.out.println("Name is "+regStu2.getName());
	}//End of main()
}//End of class
