package com.capg.corejava.method;

public class Demo {

	
	 static MethodExample me= new MethodExample(); //static use out side the main
	public static void main(String[] args) {
		MethodExample me1= new MethodExample();
		System.out.println(me);
		System.out.println(me1);
		System.out.println(MethodExample.areaOfSquare(6));
		System.out.println(me.areaOfRec(6, 7));
		System.out.println(me1.areaOfRec(6, 7));
		int r=me.y; //non static variable from MethodExample
		System.out.println(r);
		
	}

}

/*
 * public class Demo {
 * public static void main(String[] args) 
 * { 
 * MethodExample me= new MethodExample();    this is non static and use in main
 * System.out.println(me); 
 * }
 * }
 */
