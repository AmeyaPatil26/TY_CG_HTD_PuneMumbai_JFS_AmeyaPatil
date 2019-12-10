package com.capg.map.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class Helper {

	void displayPassed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage >= 35).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void displayFailed(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> i.percentage < 35).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void displayPassedMale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> (i.percentage >= 35 && i.gender == 'M'))
				.collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void displayPassedFemale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> (i.percentage >= 35 && i.gender == 'F'))
				.collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void displayFailedMale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> (i.percentage < 35 && i.gender == 'M')).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void displayFailedFemale(ArrayList<Student> al) {
		List<Student> li = al.stream().filter(i -> (i.percentage < 35 && i.gender == 'F')).collect(Collectors.toList());
		Iterator<Student> it = li.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void displayAll(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Pecentage is " + s.percentage);
			System.out.println("Gender is " + s.gender);
			System.out.println("----------------");
		}
	}

	void getTopper(ArrayList<Student> al) {

		Comparator<Student> comp = (s1, s2) -> {
			if(s1.percentage>s2.percentage) {
				return 1;
			}else if(s1.percentage<s2.percentage) {
				return -1;
			}else {
				return 0;
			}
		};

	Student t=al.stream().max(comp).get();
	System.out.println("Topper is");
	System.out.println("Name is " + t.name);
	System.out.println("Id is " + t.id);
	System.out.println("Pecentage is " + t.percentage);
	System.out.println("Gender is " + t.gender);
	System.out.println("----------------");
	}
}

