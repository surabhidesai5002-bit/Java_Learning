package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pass = "";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            String query = "DELETE FROM students WHERE usn = 103";
            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " row(s) deleted successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}