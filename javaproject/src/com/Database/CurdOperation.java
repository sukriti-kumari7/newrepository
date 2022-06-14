package com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CurdOperation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	       Class.forName("com.mysql.cj.jdbc.Driver");
	       String url = "jdbc:mysql://localhost:3306/mobile";
	       String user = "root";
	       String password = "5ukr!t!";
	       Connection connection = DriverManager.getConnection(url, user, password);
	       
	       Statement st = connection.createStatement();
	       //s.no brandName price sold
	       //Insertion
	     /* int operation = st.executeUpdate("insert into Mobile values(6,'Motorola', 13000,40) ");
	       if (operation != 0)
	       {
	    	   System.out.println("Record inserted...");
	       }
	       //Updation
	       operation = st.executeUpdate("update Mobile set price = price - 100 where sno = 2");
	       if (operation != 0)
	       {
	    	   System.out.println("Record Updated...");
	       }
	       //Deletion
	       operation = st.executeUpdate("delete from Mobile where sno = 2");
	       if (operation != 0)
	       {
	    	   System.out.println("Record Deleted...");
	       }*/
	       
	       ResultSet opn = st.executeQuery("select * from Mobile");
	       while(opn.next()) {
	    	   System.out.println(opn.getInt(1)+ " " + opn.getString(2) + " " + opn.getInt(3) + " " +opn.getInt(4));
	       }
	       opn = st.executeQuery("select sno, brandName, sold from Mobile");
	       while(opn.next()) {
	    	   System.out.println(opn.getInt("sno")+ " " + opn.getString("brandName") + " " + opn.getInt("sold"));
	       }

	}

}
