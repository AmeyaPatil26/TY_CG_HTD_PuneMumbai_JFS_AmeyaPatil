package com.capg.string;

import java.util.HashSet;
import java.util.Set;

public class TestC {
	public static void main(String[] args) {
		String k = "hi";
		String j = "how are u";
		/*
		 * System.out.println(k + j); int i = Integer.parseInt(k);//double parse to
		 * interger give exception if k=90.0 int h = Integer.parseInt(j);
		 * System.out.println(i + h);
		 */
		System.out.println(k.concat(j));
		System.out.println("GeeksforGeeks".substring(2, 7));
		String s = "Learn Share Learn";
		 int output = s.indexOf("a",9);
		 System.out.println(output);
		/*
		 * String str = "Guru99 is a site providing free tutorials"; //remove white
		 * spaces String str2 = str.replaceAll("", "oooo"); System.out.println(str2);
		 * System.out.println(str.replace('s','t'));
		 */
		 String str = "geekss@for@geekss"; 
	        String[] arrOfStr = str.split("@", 1); 
	  
	        for (String a : arrOfStr) 
	            System.out.println(a); 
	}
	
	
	
}
