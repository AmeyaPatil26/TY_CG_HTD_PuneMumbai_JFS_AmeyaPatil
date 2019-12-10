package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestG {
public static void main(String[] args) {
	ArrayList e=new ArrayList();
	  e.add("Raju");
	  e.add(19);
	  e.add('M');
	  e.add(6.14);
	
	  System.out.println("using for each");
	  for(Object r :e) {
		  System.out.println(r);
	  }
}
}
