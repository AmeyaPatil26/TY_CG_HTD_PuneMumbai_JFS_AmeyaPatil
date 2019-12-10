package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJ {
public static void main(String[] args) {
	ArrayList<Double> al=new ArrayList<Double>();
	al.add(25.3);
	al.add(63.22);
	al.add(52.13);
	al.add(21.0);
	
	Iterator<Double> it=al.iterator();
	while (it.hasNext()) {
		Double r = it.next();
		System.out.println(r);
		
	}
}
}
