package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pass = "";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();

            String query = "UPDATE students SET age = 20 WHERE usn = 101";
            int rows = stmt.executeUpdate(query);

            System.out.println(rows + " row(s) updated successfully");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}