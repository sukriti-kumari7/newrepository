package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	       Class.forName("com.mysql.cj.jdbc.Driver");
	       String url = "jdbc:mysql://localhost:3306/mobile";
	       String user = "root";
	       String password = "5ukr!t!";
	       Connection connection = DriverManager.getConnection(url, user, password);
	       if (connection != null)
	       {
	    	   System.out.println("connection  esablished.....");
	       }
	}

}
