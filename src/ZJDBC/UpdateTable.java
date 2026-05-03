package ZJDBC;
import java.sql.*;
public class UpdateTable {

	public static void main(String[] args) throws Exception{                                  // // "jdbc:mysql://localhost:3306/employee";
       String url="jdbc:mysql://localhost:3306/employee";  
       String un="root";
       String pwd="Tiger@1";
       Connection con=DriverManager.getConnection(url,un,pwd);
       Statement st=con.createStatement();
       String sqlQuery= "INSERT INTO sqlq (id, name) VALUES (2, 'narayan')";
      int update=st.executeUpdate(sqlQuery);
      System.out.println("Table created successfully"+update);
      boolean b=st.execute("Select * from sqlq");
      if(b==true) {
    	  ResultSet rs=st.getResultSet();
    	  while(rs.next()) {
    	 System.out.println(rs.getInt("id")+"****"+rs.getString("name"));}
     }else {
    	 int rowcount=st.getUpdateCount();
    	 System.out.println("the no of rows effected="+rowcount);
     }
      con.close();
	}

}
