package com.aurionpro.acid.bankmgmt.service.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnectionService {
     
	public static Connection getSqlConncetion() throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/practice";
		String user = "root";
		String password = "root";

		Connection connection = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		}
		catch (Exception e) {
			System.out.println("Connection to database failed...");
		}
			  
	  return connection;
	}
}
