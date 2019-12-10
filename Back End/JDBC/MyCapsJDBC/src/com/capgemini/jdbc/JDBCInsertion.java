package com.capgemini.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

public class JDBCInsertion {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		try {
			//Load the driver 
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			System.out.println("*******************");
			
			//Get the connection
			String dbUrl="jdbc:mysql://localhost:3306/capg_db?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("Connection establish..");
			System.out.println("*******************");
			
			//Issue SQL query via connection
			String query="INSERT INTO users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("Enter userid..");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter Username...");
			pstmt.setString(2, sc.nextLine());
			System.out.println("Enter email...");
			pstmt.setString(3,sc.nextLine());
			System.out.println("Enter password...");
			pstmt.setString(4, sc.nextLine());
			int count =pstmt.executeUpdate();
			
			//Process the Result
			if(count>0) {
			System.out.println("Data inserted.....");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}

}
