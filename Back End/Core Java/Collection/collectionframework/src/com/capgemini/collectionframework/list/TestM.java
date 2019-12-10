package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestM {
public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<String>();
	li.add("baban");
	li.add("phy");
	li.add("chem");
	li.add("bio");
	
	System.out.println("using for loop");
	  for (int i = 0; i < 4; i++) {
		String r=li.get(i);
		System.out.println(r);
	}
	  
	  System.out.println("------using for each");
	  for(String r :li)
	  {
		  System.out.println(r);
	  }

		 System.out.println("-----List iterator---");
		 System.out.println("----forward");
		 ListIterator<String> lit=li.listIterator();
		 while (lit.hasNext()) {
			String r=  lit.next();
			System.out.println(r);
			
		}
		 

		 System.out.println("-----backward---");
		 while (lit.hasPrevious()) {
			String r= lit.previous();
			System.out.println(r);
			
		}
	  
	  
}
}
