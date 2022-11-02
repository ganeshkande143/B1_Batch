package STATEMENTT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B_Updatedata {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","root");
			String upload_data="insert into RBI values (2,'ICICI',123456)";
			Statement smt= con.createStatement();
			smt.execute(upload_data);
			smt.close();
			con.close();
			System.out.println("data is uploaded");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
