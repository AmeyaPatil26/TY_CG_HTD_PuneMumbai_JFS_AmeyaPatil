package com.capgemini.jdbc.dao;

import java.util.Scanner;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.factory.UserFactory;

public class UserLogin {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		UserDAO dao=UserFactory.getInstance();
		System.out.println("Enter the userid.. ");
		int r=sc.nextInt();
		System.out.println("Enter  password" );
		String s=sc.next();
		UserBean user=dao.login(r,s);
		System.out.println("*****My Info ******");
		
	
		
	
		if(user!=null) {
			System.out.println(user);
		}else {
			System.out.println("Something went wrong ...");
		}
		sc.close();
	}

}
