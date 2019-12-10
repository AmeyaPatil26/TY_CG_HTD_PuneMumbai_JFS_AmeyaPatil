package com.capg.corejava.loop;

public class DoWhileLoopExample {

	public static void main(String[] args) {
	int i=1;
	
	do {
		System.out.println("i= "+i);
		i++;
	}while(i<=10);
	
	System.out.println("Code outside the loop");
	}
	
	/*
	 * do { 
	 * System.out.println("i= "+i);
	 *  i++; }
	 * while(true);    it gives error
	 * System.out.println("Code outside the loop"); }
	 */

}
