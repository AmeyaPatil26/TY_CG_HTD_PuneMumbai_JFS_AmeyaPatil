package com.capgemini.ArrayPrg.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Helper {
	void display(ArrayList<StudentDis> k) {
		for (StudentDis s : k) {

			System.out.println("Id is " + s.id);
			System.out.println("Name is " + s.name);
			System.out.println("Percentage is " + s.percentage);
			System.out.println("****************************");
		}
	}

	void onlyPass(ArrayList<StudentDis> k) {
		Iterator<StudentDis> li = k.iterator();
System.out.println("----------only pass-------------");
		while (li.hasNext()) {
			StudentDis s = li.next();
			if (s.percentage >= 35) {
				System.out.println("Id is " + s.id);
				System.out.println("Name is " + s.name);
				System.out.println("Percentage is " + s.percentage);
				System.out.println("****************************");
			}
		}
	
	}
	
	void distiction(ArrayList<StudentDis> k) {
		Iterator<StudentDis> it = k.iterator();
System.out.println("------distriction---------");
		while (it.hasNext()) {
			StudentDis s = it.next();
			if (s.percentage >= 75) {
				System.out.println("Id is " + s.id);
				System.out.println("Name is " + s.name);
				System.out.println("Percentage is " + s.percentage);
				System.out.println("****************************");
			}
		}
	
	}
}
