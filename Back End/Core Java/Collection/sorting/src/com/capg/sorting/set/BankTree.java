package com.capg.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BankTree {

	public static void main(String[] args) {
		
		ById comp=new ById();
		ByName compName=new ByName();
		ByMirc compMicr= new ByMirc();
		TreeSet<Bank> ts= new TreeSet<Bank>(compMicr);
		
		Bank b1=new Bank(2013, "SBI", 123456l);
		Bank b2=new Bank(2113, "BOB", 456789l);
		Bank b3=new Bank(2213, "ICICI",789456l);
		Bank b4=new Bank(2313, "HDFC",456123l);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		Iterator<Bank> it =ts.iterator();
		while(it.hasNext()) {
			
			Bank b=it.next();
			System.out.println("Pin is "+b.pin);
			System.out.println("Name is "+b.name);
			System.out.println("MICR is "+b.micr);
			System.out.println("----------------------");
		}
	}

}
