package com.capgemini.ArrayPrg.list;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<StudentDis> al = new ArrayList<StudentDis>();
		StudentDis s1 = new StudentDis(1, "priya", 26.56);
		StudentDis s2 = new StudentDis(2, "parag", 53.12);
		StudentDis s3 = new StudentDis(3, "lila", 80.46);
		StudentDis s4 = new StudentDis(4, "ojas", 56.23);
		StudentDis s5 = new StudentDis(5, "baban", 46.56);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		
		Helper h=new Helper();
		//h.display(al);
		h.onlyPass(al);
		h.distiction(al);
	}

}
