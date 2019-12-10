package com.capgemini.jdbc.validity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class Regex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UserDAO dao=UserFactory.getInstance();
		System.out.println("ENter the name");
		String name=sc.nextLine();
		UserBean user=dao.getregex(name);
		
		Pattern pat = Pattern.compile("\\w+\\s\\w+");
		Matcher mat = pat.matcher(name);
		System.out.println(mat.matches());
		Boolean b1=mat.matches();
		
		if (b1==true)
		{
			if(user!=null) {
		    System.out.println(user);
		}  
			else {
			System.out.println("Something went wrong ...");
		}}else {
			System.out.println("wrong");
		}
	sc.close();  
		
    }
	}

