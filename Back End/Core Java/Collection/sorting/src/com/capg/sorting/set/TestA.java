package com.capg.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class TestA {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("Amit");
		hs.add("Baban");
		hs.add("Dip");
		hs.add("Deepa");
		
		System.out.println("*****using for each*****");
		for (String r : hs) {
			System.out.println(r);
		}
		
		System.out.println("*****using Iterartor******");
	 Iterator<String> it= hs.iterator();
	 while(it.hasNext()) {
		 String r =it.next();
		 System.out.println(r);
	}
	 
	
	}

}
