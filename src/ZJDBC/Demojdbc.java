package ZJDBC;
import java.sql.*;
public class Demojdbc {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		 String password = "Tiger@1";
		 Connection con = DriverManager.getConnection(url, username, password);
		 Statement st = con.createStatement();
		 ResultSet rs = st.executeQuery("SELECT * FROM emp");
		 while(rs.next()) {
	            System.out.println(
	                rs.getInt("id") + " " +
	                rs.getString("name") + " " +
	                rs.getString("dept") + " " +
	                rs.getDouble("sal")
	            );
	        }
		  con.close();
	}

}
