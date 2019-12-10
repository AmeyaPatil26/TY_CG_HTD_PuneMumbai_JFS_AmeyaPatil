package com.capgemini.ArrayPrg.list;

import java.util.LinkedList;

public class TestLink {
	public static void main(String[] args) {
		LinkedList<Double> li=new LinkedList<Double>();
		li.add(3.6);
		li.add(2.4);
		li.add(4.7);
		li.add(1.6);
		li.add(1.6);
		li.add(34.6);
		li.add(null);//accept null or multiple null in list
		
		for(int i=0;i<li.size();i++) {
			Double r=li.get(i);
			System.out.println(r);
		}
		
		
		System.out.println("before ---"+li);
		Double res=li.peekLast(); //last value
		//Double res=li.peekFirst();   first value
		//Double res=li.peek();  first value
		//li.push(23.5);  fifo
		li.pop();
		System.out.println("peek object is "+res);

		System.out.println("after ---"+li);
	}

}
