package com.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementOpn {


		public static void main(String[] args) throws ClassNotFoundException, SQLException {

		       Class.forName("com.mysql.cj.jdbc.Driver");
		       String url = "jdbc:mysql://localhost:3306/mobile";
		       String user = "root";
		       String password = "5ukr!t!";
		       Connection connection = DriverManager.getConnection(url, user, password);
		       
		       System.out.println("Enter Option For Performing particular Operation...Select 1 for insertion, Select 2 for updation, Select 3 for delation, select 4 for selection");
		       Scanner scan = new Scanner(System.in);
		       int n = scan.nextInt();
		       PreparedStatement pst;  
		      switch(n) {
		      
		      case 1:
		     //Insertion
		       pst = connection.prepareStatement("insert into Mobile values(?,?,?,?)");
		       //sno brandName price sold
		      
		       pst.setInt(1, 2);
		       pst.setString(2, "Nokia");
		       pst.setInt(3,4000);
		       pst.setInt(4, 39);
		       int operation = pst.executeUpdate();
		       if (operation != 0)
		       {
		    	   System.out.println("Record inserted...");
		       }
		      break;
   			case 2:
		    	  
		       //Updation
		    	 //PreparedStstement 
		    	 pst= connection.prepareStatement("update Mobile set sno = ? where sno = ?");
		    	  
		    	  pst.setInt(2,1);
		    	  pst.setInt(3,2);
		    	  pst.setInt(4,3);
		    	  pst.setInt(5,4);
		    	  pst.setInt(6,5);
		    	  operation = pst.executeUpdate();
		      if (operation != 0)
		       {
		    	   System.out.println("Record Updated...");
		       }
		      break;
		      
   			case 3:
   				
		       //Deletion
		        pst= connection.prepareStatement("delete from Mobile where sno = ?");
		        pst.setInt(1,6);
		        operation = pst.executeUpdate();
		       if (operation != 0)
		       {
		    	   System.out.println("Record Deleted...");
		       }
		       break;
		       
   			case 4:
   				
   			 pst= connection.prepareStatement("select *form Mobile where sno in(?,?)");
		     pst.setInt(1,1);
		     pst.setInt(2,2);
		     pst.setInt(3, 4);
		     ResultSet opn = pst.executeQuery();
		       while(opn.next()) {
		    	   System.out.println(opn.getInt(1)+ " " + opn.getString(2) + " " + opn.getInt(3) + " " +opn.getInt(4));
		       }

		}

	}

}
