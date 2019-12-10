package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestI {
public static void main(String[] args) {
	ArrayList<Double> al=new ArrayList<Double>();
	al.add(25.3);
	al.add(63.22);
	al.add(52.13);
	al.add(21.0);
	
	for(Double r :al)
	{
		System.out.println(r);
	}
}
}
