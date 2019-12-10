package com.capg.inbuilt.predictor;

import java.util.function.Consumer;

import com.capg.map.student.Student;

public class TestCon {
public static void main(String[] args) {
	
	Consumer<Student> c=(s)->{
	System.out.println("Name is "+s.name);
	System.out.println("id is "+s.id);
	System.out.println("Percentage is "+s.percentage);
	
	};
	Student s1=new Student(1,"Divya",78.4,'F');
	c.accept(s1);
}
}
