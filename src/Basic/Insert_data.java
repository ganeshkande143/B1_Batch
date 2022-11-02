package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_data {

	public static void main(String[] args) 
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root", "root");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter roll no");
		int a=	sc.nextInt();
		System.out.println("Enter Table Name");
		String b=sc.next();
		System.out.println("Enter Name");
		String c= sc.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String insertdata="insert into "+b+" values('"+a+"','"+c+"')";
		
		//String insertdata="insert into student values(1,'Ganesh')";	
		Statement smt=	con.createStatement();
		smt.execute(insertdata);
		smt.close();
		con.close();
		System.out.println("new data is inserted");
		
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
