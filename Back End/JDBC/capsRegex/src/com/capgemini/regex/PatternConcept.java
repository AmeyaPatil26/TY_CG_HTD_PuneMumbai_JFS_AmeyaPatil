package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {
public static void main(String[] args) {
	
	// d for digit
	//D for other than digit
	
	Pattern pat= Pattern.compile("\\d{10}");  //d{pattern} for exact pattern
	//matcher take input which need to be match and retrun bollean pattern 
	Matcher mat=pat.matcher("123454242");
	System.out.println("FOr pattern exact 10 \\\\d{10}: "+mat.matches());
	
	//we cannot call default constrctor in another class
	Pattern pat1= Pattern.compile("\\d");// "//d"for one pattern of digit
	Matcher mat1=pat1.matcher("6");
	System.out.println("for one pattern: "+mat1.matches());
	
	Pattern patNo= Pattern.compile("\\d+");  // d+ for multiple vlaues 
	Matcher matNo=patNo.matcher("61223487956212124152");
	System.out.println("for multiple pattern: "+matNo.matches());
	
	Pattern patNo2= Pattern.compile("\\d{1,10}");  // d+ for multiple vlaues 
	Matcher matNo2=patNo2.matcher("5123456789");
		System.out.println("for pattern d{1,10}: "+matNo2.matches());
	
	Pattern patNo3= Pattern.compile("\\d{0}");  // d+ for multiple vlaues 
	Matcher matNo3=patNo3.matcher("1");
	System.out.println("for pattern d{0}: "+matNo3.matches());
	
	Pattern patNo4= Pattern.compile("\\d{1,9}");  //  
	Matcher matNo4=patNo4.matcher("");
	System.out.println("for \\\\d{1,9} : "+matNo4.matches());

	Pattern patNo5= Pattern.compile("\\D");  //D takes other than digit 
	Matcher matNo5=patNo5.matcher("$");
	System.out.println("for\\D : "+matNo5.matches());

	//whenever matching  digit use  d
	//other than digit use D
	//single s for space  matching  and no  space S(capital S) 
	//s+ for multiple space
	
	pat=Pattern.compile("\\s"); //matching space
	mat=pat.matcher(" ");
	System.out.println("for pattern  sapce: "+mat.matches());
	
	pat=Pattern.compile("\\S");
	mat=pat.matcher("");
	System.out.println("for pattern  sapce: "+mat.matches());
	
}

}
