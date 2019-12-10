package com.capg.sorting.set;

import java.util.TreeSet;

public class TestTree {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(15);
		ts.add(75);
		ts.add(20);
		ts.add(23);
		//ts.add(null);// cannot take null value throws NullPointerException
		
		System.out.println("*****using for each*****");
		for (Object r : ts) {
			System.out.println(r);
		}
	}

}
