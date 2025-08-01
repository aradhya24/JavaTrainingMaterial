
package com.aurionpro.connection.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCcrud {
	public static void main(String[] args) throws Exception {

		// register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//CREATE CONNECTION
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
        System.out.println(connection + " : Connected to DB sucessfully");
		
//		//Insert Operation
//		
//		//create stmt
//		String insertQuery = "insert into course(courseid,coursename) values(?,?)";
//		
//		PreparedStatement ps = connection.prepareStatement(insertQuery);
//		ps.setString(1, "9");
//		ps.setString(2, "IOT");
//		int rows = ps.executeUpdate();
//		
//		ps.setString(1, "10");
//		ps.setString(2, "ECS");
//        rows += ps.executeUpdate();
//        
//        System.out.println(rows + " Rows inserted successfully....");
//        
        
        
        //Fetch(Display)
        
        String selctQuery = "Select * from course";
        
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selctQuery);
        
        while(resultSet.next()) {
        	System.out.println(resultSet.getString("courseid") + " - " + resultSet.getString("coursename"));
        }
        
        
        //Update
        String updateQuery = "update course set coursename = ? where courseid = ?";
        
        PreparedStatement ps2 = connection.prepareStatement(updateQuery);
        ps2.setString(1, "EC");
        ps2.setString(2,"1");
        ps2.execute();
        System.out.println("Row updated sucessfully...");
        
        
        //Delete
        String deleteQuery = "delete  from course where courseid = ?";
        
        PreparedStatement ps3 = connection.prepareStatement(deleteQuery);
        ps3.setString(1, "10");
        ps3.execute();
        System.out.println("Row deleted sucessfully");
        
        
        connection.close();
	}
}
