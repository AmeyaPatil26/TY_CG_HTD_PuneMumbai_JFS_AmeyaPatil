package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestN {
public static void main(String[] args) {
	Vector al=new Vector();
	al.add("Raju");
	  al.add(19);
	  al.add('M');
	  al.add(6.14);
	  System.out.println("-----for loop--");
	  for (int i = 0; i < 4; i++) {
		
		Object r=al.get(i);
		System.out.println(r);
	}
	
	  System.out.println("-----for each---");
	  for(Object r: al) {
		  System.out.println(r);
	  }
	  
	  System.out.println("-----Iterator---");
	  Iterator li=al.iterator();
	  while (li.hasNext()) {
		Object r =li.next();
		System.out.println(r);
		}
	  

		 System.out.println("-----List iterator---");
		 System.out.println("----forward");
		 ListIterator lit=al.listIterator();
		 while (lit.hasNext()) {
			Object r=  lit.next();
			System.out.println(r);
			
		}
		 

		 System.out.println("-----backward---");
		 while (lit.hasPrevious()) {
			Object r= lit.previous();
			System.out.println(r);
			
		}
}

}
