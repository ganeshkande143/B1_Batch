package PrapareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class A_insert_table {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "root");
			
			//String create_table="create table JB(rollNO int primary key, name varchar(50))";
			String insertdata="insert into jb values(?,?)";
			PreparedStatement ps= con.prepareStatement(insertdata);
			ps.setInt(1, 20);
			ps.setString(2, "Maayghale");
			int id=ps.executeUpdate();
			System.out.println(id);
			
			
			//ps.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
