package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestK {
public static void main(String[] args) {
	ArrayList<Double> al=new ArrayList<Double>();
	al.add(25.3);
	al.add(63.22);
	al.add(52.13);
	al.add(21.0);
	
	System.out.println("----->forward");
	ListIterator<Double> it=al.listIterator();
	while(it.hasNext()) {
		 Double r= it.next();
		 System.out.println(r);
	}
	
	System.out.println("<-----backard");

	while(it.hasPrevious()) {
		 Double r= it.previous();
		 System.out.println(r);
	}
}
}
