package com.capg.Array;

public class DoubleType {

	public static void main(String[] args) {
  double []m= {10,20,30,40};
  String []n= {"bsrj","hfsjk","jhrs"};
   recive(m);
   recive(n);
   
	}
	
	static void recive(double[]a) {
		for(double i: a) {
			
				System.out.println(i);
			
		}
	}
		static void recive(String[]a) {
			for(String i: a) {
				
					System.out.println(i);
				
			}
	}

}
