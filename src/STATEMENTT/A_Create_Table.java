package STATEMENTT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A_Create_Table {

	public static void main(String[] args) 
	{

		try {
			//Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create connection;
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "root");
			
			//construct sql query
			String createtable="create table RBI(Rollno int primary key,Name varchar(50),Pincode int)";
			
			//create object of connectiomn interface
			Statement smt=con.createStatement();
			
			smt.execute(createtable);
			
			smt.close();
			
			con.close();
			
			System.out.println("RBI created....");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
