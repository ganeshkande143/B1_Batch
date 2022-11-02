package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrivedata {

	public static void main(String[] args) throws Exception {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "root");
			
			String sql= "select * from student";
			
			Statement smt=	conn.createStatement();
		
			ResultSet rs=smt.executeQuery(sql);
			
			while(rs.next())
				{
			int rollno=	rs.getInt(1);
			String name=rs.getString(2);
			
			System.out.println(rollno);
			System.out.println(name);
				}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
