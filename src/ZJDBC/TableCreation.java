package ZJDBC;
import java.sql.*;
public class TableCreation {

	public static void main(String[] args) throws Exception {
     String url="jdbc:mysql://localhost:3306/employee";  // "jdbc:mysql://localhost:3306/employee";
     String un="root";
     String pwd="Tiger@1";
     Connection con=DriverManager.getConnection(url,un,pwd);
     Statement st=con.createStatement();
     String sqlQuery="create table sqlq(id int Primary Key, name varchar(20))";
    int update=st.executeUpdate(sqlQuery);
    System.out.println("Table created successfully"+update);
    con.close();
	}

}
