package com.capg.map.student;

import java.util.ArrayList;
import java.util.LinkedHashMap;


public class TestStudent {

	public static void main(String[] args) {

		Student s1=new Student(1, "Kavya", 70.65, 'F');
		Student s2=new Student(2, "Raju", 53.12, 'M');
		Student s3=new Student(3, "Aditi", 69.55, 'F');
		Student s4=new Student(4, "Vijay", 23.56, 'M');
		Student s5=new Student(5, "Aaush", 89.6, 'M');
		Student s6=new Student(6, "Kavish",55.36, 'M');
		Student s7=new Student(7, "Lila", 15.63, 'F');
		Student s8=new Student(8, "Jaya", 34.23, 'F');
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		
		Helper h=new Helper();//object of helper class
		//h.displayAll(al);
		//h.displayPassed(al);
		//h.displayFailed(al);
		//h.displayPassedMale(al);
		//h.displayFailedFemale(al);
		h.getTopper(al);
	}

}
