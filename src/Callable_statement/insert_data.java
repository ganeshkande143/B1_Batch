package Callable_statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class insert_data {

	public static void main(String[] args)
	{
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","root");
			//CallableStatement cs =con.prepareCall("{ call Updatedata (?)}");
			
			CallableStatement cs= con.prepareCall( "{call addcolumn(?)}");
			//cs.execute("Gender");
			cs.getString("Gender" );
			
			//cs.setString(1,"Pune" );
			//cs.setInt(1, 10);
			//cs.setString(2, "Mumbai");
			
			cs.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
