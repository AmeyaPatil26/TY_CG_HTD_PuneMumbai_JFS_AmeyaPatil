package com.capg.sorting.set;

import java.util.HashSet;

public class TestDGen {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(15);
		hs.add('A');
		hs.add(2.4);
		hs.add("Deepa");
		hs.add(15);
		hs.add(15);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println("*****using for each*****");
		for (Object r : hs) {
			System.out.println(r);
		}
		
	}

}
