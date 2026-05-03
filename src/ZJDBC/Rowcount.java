package ZJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Rowcount {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		 String password = "Tiger@1";
		 Connection con = DriverManager.getConnection(url, username, password);
		 Statement st = con.createStatement();
		 ResultSet rs=st.executeQuery("select * from class");
		 int count=0;
          while(rs.next()) {
        	  count++;
          }
          System.out.println("The no of rows in class table is "+count);
	}

}
