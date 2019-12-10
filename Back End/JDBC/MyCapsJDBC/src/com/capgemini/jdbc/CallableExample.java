package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.CallableStatement;
import java.sql.Driver;

public class CallableExample {
	
	public static void main(String[] args) {
		Connection conn=null;
		CallableStatement cstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		
		//Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			//Get DBconnection
			String dbUrl= "jdbc:mysql://localhost:3306/capg_db";
			System.out.println("Enter user and password");
			String user=sc.nextLine();
			String password= sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("Connection estd...");
			System.out.println("*****************");
			
			//Issue sql query
			String query="call getAllInfo()";
			cstmt=conn.prepareCall(query);
			boolean b=cstmt.execute();
			
			if(b) {
				rs=cstmt.getResultSet();
				while(rs.next()) {
					System.out.println("User Id: "+rs.getInt(1));
					System.out.println("Username: "+rs.getString(2));
					System.out.println("Email: "+rs.getString(3));
					System.out.println("Password: "+rs.getString(4));
					System.out.println("*******************");
					}
			}else{
				int i=cstmt.getUpdateCount();
				if (i>0) {
					System.out.println("Operation successful......");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(cstmt!=null) {
				try {
					cstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
