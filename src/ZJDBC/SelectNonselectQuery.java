package ZJDBC;
import java.sql.*;
import java.util.Scanner;
public class SelectNonselectQuery {

	public static void main(String[] args)  throws Exception{
    String url="jdbc:mysql://localhost:3306/employee";
    String un="root";
    String psw="Tiger@1";
    Connection con=DriverManager.getConnection(url,un,psw);
    Statement st=con.createStatement();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Query");
    String sqlquery=sc.nextLine();
    boolean b=st.execute(sqlquery);
//    ResultSet rs=st.executeQuery("Select * from class");
    if(b==true) {
    	ResultSet rs=st.getResultSet();
    	while(rs.next()) {
    		System.out.println(rs.getInt("rollno")+"....."+rs.getString("name")+".."+rs.getDate("joindate")+"...."+rs.getInt("marks"));
    	}
    }
    else {
    	int rowcount =st.getUpdateCount();
    	System.out.println("The no of records expected is "+rowcount);
    }
    con.close();
	}

}
