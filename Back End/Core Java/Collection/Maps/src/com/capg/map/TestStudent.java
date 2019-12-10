package com.capg.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class TestStudent {

	public static void main(String[] args) {

		Student s1=new Student(1, "Jaya", 72.3);
		Student s2=new Student(2, "Kavya", 56.3);
		Student s3=new Student(3, "Raju", 45.62);
		Student s4=new Student(4, "Jd", 45.69);
		Student s5=new Student(5, "Pradya", 65.3);
		Student s6=new Student(6, "Aditi", 82.03);
		Student s7=new Student(7, "Chinnu",89.36);
		Student s8=new Student(8, "Ratna", 89.64);
		Student s9=new Student(9, "Prabhu", 35.63);
		
		ArrayList<Student> al1=new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2=new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		
		ArrayList<Student> al3=new ArrayList<Student>();
		al3.add(s6);
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		LinkedHashMap<String ,ArrayList<Student>> hm= new LinkedHashMap<String ,ArrayList<Student>>();
	
	hm.put("first",al1);
	hm.put("second",al2);
	hm.put("third",al3);
	
	ArrayList<Student> al=hm.get("second");
	Iterator<Student> it=al.iterator();
	while(it.hasNext()) {
		Student s=it.next();
		System.out.println("Name is "+s.name);
		System.out.println("Id is "+s.id);
		System.out.println("Pecentage is "+s.percentage);
		System.out.println("----------------");
	}
	
	
	}

}
