package com.capgemini.jdbc.validity;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;



public class IsValid {
	
	public void  isValid(String username) 
    { 
		/*
		 * String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" +
		 * "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
		 * 
		 * Pattern pat = Pattern.compile(emailRegex);
		 * 
		 * pat.matcher(email).matches();
		 */
		Scanner sc=new Scanner(System.in);
		UserDAO dao=UserFactory.getInstance();
		System.out.println("ENter the name");
		String name=sc.nextLine();
		//UserBean user=dao.isValid(name);
		
		Pattern pat = Pattern.compile("\\w+\\s\\w+");
		Matcher mat = pat.matcher(name);
		System.out.println(mat.matches());
		Boolean b1=mat.matches();
		
		if (mat.find()) {
		    System.out.println(mat.group());
		}  else {
			System.out.println("Something went wrong ...");
		}
		sc.close();  
		
    }
  

}
