package com.capgemini.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.jdbc.beans.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class GetInfo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		Properties prop=null;
		
		try {
			 UserDAO dao=UserFactory.getInstance();
			PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query"));
			System.out.println("Enter username");
			String name=sc.nextLine();
			Pattern pat=Pattern.compile(name);
			Matcher mat=pat.matcher(name);
			boolean b=mat.matches();
			if (b==true) {
				pstmt.setString(2,name);
			}
			
			else {
				System.out.println("wrong");
			}

			sc.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		 
		
		/*
		 * System.out.println("Enter the userid.."); UserBean
		 * user=dao.getInfo(sc.nextInt()); Pattern pat=Pattern.compile();
		 */
		 
		 
		
		
		
	
		
	}

}
