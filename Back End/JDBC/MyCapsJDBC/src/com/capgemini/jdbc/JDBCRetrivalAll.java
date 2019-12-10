package com.capgemini.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCRetrivalAll {

	public static void main(String[] args) {

		Connection conn=null;
		FileReader reader=null;
		Properties prop=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded....");
			System.out.println("***************");
			
			reader = new FileReader("C:\\Users\\RUTUJA\\OneDrive\\Desktop\\db.properties");
			prop=new Properties();
			prop.load(reader);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			//Get connection
			String dbUrl=prop.getProperty("dbUrl");
			conn=DriverManager.getConnection(dbUrl,prop.getProperty("user"),prop.getProperty("password") );
			System.out.println("Connect estd.....");
			System.out.println("----------------");
			

			/*//Issue query
			String query="SELECT * FROM users_info WHERE userid=?";
			pstmt= conn.prepareStatement(query);
			System.out.println("Enter the User Id....");
			pstmt.setInt(1, sc.nextInt());
			rs=pstmt.executeQuery();
			
			//Process the results returned by SQL query
			if(rs.next()) {
				System.out.println("User Id: "+rs.getInt(1));
				System.out.println("User Name: "+rs.getString(2));
				System.out.println("User Email: "+rs.getString(3));
				System.out.println("Password: "+rs.getString(4));}*/
		
			
			//Issue SQL query  via connection
			String query="SELECT * FROM users_info";
			stmt= conn.createStatement();
			rs= stmt.executeQuery(query);
			
			//Process the results returned by SQL query
			while(rs.next()) {
				System.out.println("User Id: "+rs.getInt(1)); //we can write index no or column name string 
				System.out.println("User Name: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString(3));
				System.out.println("Password: "+rs.getString("password"));
				System.out.println("**************************");
			}
			}
		catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				if(conn!=null) {
					try {
						conn.close();
					} catch (SQLException e) {
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
				if(rs!=null) {
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				sc.close();
		}
}
}
