package com.capg.inbuilt.predictor;

import java.util.function.Predicate;

import com.capg.map.student.Student;

public class TestPred {

	public static void main(String[] args) {
		Predicate<Student> p=i->{
			if(i.percentage>=35) {
				return true;
			}else {
				return false;
			}
		};
		Student s=new Student (1,"mayuri",45.3,'F');
		
		boolean res=p.test(s);
		System.out.println(res);
	}
}
