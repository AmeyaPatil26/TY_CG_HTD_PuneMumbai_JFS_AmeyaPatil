package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestH {
public static void main(String[] args) {
	ArrayList<Double> al=new ArrayList<Double>();
	al.add(25.3);
	al.add(63.22);
	al.add(52.13);
	al.add(21.0);
	
	for (int i = 0; i <4; i++) {
		Double r=al.get(i);
		System.out.println(r);
	}
	
}
}
