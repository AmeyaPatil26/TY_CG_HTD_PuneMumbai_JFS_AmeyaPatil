package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestO {
public static void main(String[] args) {
	Vector<Character> al=new Vector<Character>();
	al.add('M');
	  al.add('L');
	  al.add('M');
	  al.add('K');
	  System.out.println("-----for loop--");
	  for (int i = 0; i < 4; i++) {
		
		Character r=al.get(i);
		System.out.println(r);
	}
	
	  System.out.println("-----for each---");
	  for(Character r: al) {
		  System.out.println(r);
	  }
	  
	  System.out.println("-----Iterator---");
	  Iterator<Character> li=al.iterator();
	  while (li.hasNext()) {
		Character r =li.next();
		System.out.println(r);
		}
	  

		 System.out.println("-----List iterator---");
		 System.out.println("----forward");
		 ListIterator<Character> lit=al.listIterator();
		 while (lit.hasNext()) {
			Character r=  lit.next();
			System.out.println(r);
			
		}
		 

		 System.out.println("-----backward---");
		 while (lit.hasPrevious()) {
			Character r= lit.previous();
			System.out.println(r);
			
		}
}

}
