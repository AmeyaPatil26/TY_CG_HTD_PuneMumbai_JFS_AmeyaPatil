package com.capg.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestEmpTr {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("jaya");
		ts.add("deepa");
		ts.add("taniya");
		ts.add("raju");
		
		Iterator<String> it= ts.iterator();
		while(it.hasNext()) {
			String r=it.next();
			System.out.println(r);
		
			
			
		}
	}

}
