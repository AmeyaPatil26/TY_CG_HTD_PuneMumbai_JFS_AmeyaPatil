package com.capgemini.junit;

import java.util.ArrayList;

public class School {

	private ArrayList<Student> al = new ArrayList<Student>();

	public Student registerStudent(Student student) {
		int rollNumber = al.size() + 1;
		student.setId(rollNumber);
		al.add(student);
		return student;
	}

	public Student searchStudent(int id) {
		Student res = null;
		for (Student s : al) {
			if (s.getId() == id) {
				res = s;
				break;
			}
		}
		return res;
	}// end of class
}
