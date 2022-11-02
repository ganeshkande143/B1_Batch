package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preapared_statement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh", "root", "root");
			
			String sql="insert into student values(?,?)";
			
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, 4);
			ps.setString(2, "JB");
			int id=	ps.executeUpdate();
			System.out.println(id);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
