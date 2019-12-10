package com.capg.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestB {
public static void main(String[] args) {
	LinkedHashSet hs=new LinkedHashSet();
	hs.add(15);
	hs.add('A');
	hs.add(2.4);
	hs.add("Deepa");
	hs.add(null);
	hs.add(null);
	
	System.out.println("*****using for each*****");
	for (Object r : hs) {
		System.out.println(r);
	}
	
	System.out.println("*****using Iterartor******");
 Iterator it= hs.iterator();
 while(it.hasNext()) {
	 Object r =it.next();
	 System.out.println(r);
}

 
}
}
