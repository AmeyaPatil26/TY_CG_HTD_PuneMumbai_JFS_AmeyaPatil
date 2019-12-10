package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {
public static void main(String[] args) {
	LinkedList al=new LinkedList();
	  al.add("Raju");
	  al.add(19);
	  al.add('M');
	  al.add(6.14);
	  
	  System.out.println("using for loop");
	  for (int i = 0; i < 4; i++) {
		Object r=al.get(i);
		System.out.println(r);
	}
	  
	  System.out.println("------using for each");
	  for(Object r :al)
	  {
		  System.out.println(r);
	  }

	  System.out.println("using  Iterator");
	  Iterator it= al.iterator();
	  while(it.hasNext()) {
		  Object m=it.next();
		  System.out.println(m);
	  }
	  System.out.println("using  ListIterator");
	  
System.out.println("----forward---");
	  ListIterator li= al.listIterator();
	  while(li.hasNext()) {
		  Object m=li.next();
		  System.out.println(m);
	  
	  }
	  System.out.println("----backward---");
	  while(li.hasPrevious()) {
		  Object m=li.previous();
		  System.out.println(m);
	  
	  }
	  
	  
}
}
