package com.capg.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		LinkedHashSet<Double> hs=new LinkedHashSet<Double>();
		hs.add(15.2);
		hs.add(23.6);
		hs.add(2.4);
		hs.add(53.2);
		
		System.out.println("*****using for each*****");
		for (Double r : hs) {
			System.out.println(r);
		}
		
		System.out.println("*****using Iterartor******");
	 Iterator<Double> it= hs.iterator();
	 while(it.hasNext()) {
		 Double r =it.next();
		 System.out.println(r);
	}
	}

}
