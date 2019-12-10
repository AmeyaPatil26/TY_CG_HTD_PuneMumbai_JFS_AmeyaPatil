package com.capg.inbuilt.predictor;

import java.util.function.Supplier;

import com.capg.map.student.Student;

public class TestSupply {

	public static void main(String[] args) {

		Supplier<Student> a=()->new Student();
		Student s=a.get();
		Student p=a.get();
		System.out.println(s);
		System.out.println(p);
		
	}

}
