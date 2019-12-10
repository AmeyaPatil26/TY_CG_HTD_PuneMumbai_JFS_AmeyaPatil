package com.capgemini.ArrayPrg.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(3.6);
		al.add(2.4);
		al.add(4.7);
		al.add(1.6);

		ArrayList<Double> bl = new ArrayList<Double>();
		bl.add(29.4);
		bl.add(16.2);

		System.out.println("Before---------" + al);

		al.addAll(bl);

		System.out.println("After-----------" + al);
		
		boolean res =al.contains(bl);
		System.out.println("DOes it contain all "+res);
		
		al.remove(bl);
		System.out.println("Removed");
		System.out.println(bl);
		
	}
}
