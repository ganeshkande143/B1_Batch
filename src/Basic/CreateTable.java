package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) //throws Exception
	{
		// load the driver
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver");
		//Established the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "root");
		
		//construct sql query
		String createTable="create table Student(Rollno int primary key,Name varchar(50))";
		
		// create object of connection interface
		
		Statement smt=	con.createStatement();
		
		// execute sql query
		
		smt.execute(createTable);
		
		// close the connection
		
		smt.close();
		
		con.close();
		
		System.out.println("Create Table...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
