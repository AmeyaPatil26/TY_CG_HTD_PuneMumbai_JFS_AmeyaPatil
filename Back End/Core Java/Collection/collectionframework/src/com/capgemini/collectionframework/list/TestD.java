package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;


public class TestD {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	  al.add(20);
	  al.add("Chinnu");
	  al.add(2.9);
	  al.add('F');
	  System.out.println("forward------>");

	  ListIterator m=al.listIterator();
	  while(m.hasNext()) {
		  Object r=m.next();
		  System.out.println(r);
	  }
	  
	  System.out.println("<--------backward");
	  while(m.hasPrevious()) {
		  Object r=m.previous();
		  System.out.println(r);
	  }
}
}
