package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "JDBC:mysql://localhost:3306/test_db",
                    "root",
                    ""
            );

            System.out.println("Connected Successfully!");

            //close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
