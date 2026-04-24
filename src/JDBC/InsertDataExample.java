package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataExample {
        public static void main(String[] args) {
            String url = "JDBC:mysql://localhost:3306/test_db";
            String user = "root";
            String pass = "";
            try {
                //creating the connection
                Connection con = DriverManager.getConnection(url, user, pass);
                Statement stmt = con.createStatement();
                String query = "INSERT INTO students(usn, name, age) VALUES " +
                        "(103,'Amar',18)," +
                        "(104,'Axaya',18)," +
                        "(105,'Vinay',18)";
                stmt.executeUpdate(query);
                System.out.println("Rows added successfully  ");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
