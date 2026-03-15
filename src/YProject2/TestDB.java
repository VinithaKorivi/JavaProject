package YProject2;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "Tiger@1"
            );
            System.out.println("Connected to MySQL successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
