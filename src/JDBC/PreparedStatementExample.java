package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementExample {
    static void main(String[] args) {
        String url = "JDBC:mysql://localhost:3306/test_db";
        String user ="root";
        String pass ="";

        try{
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement stmt = con.createStatement();
            String query="INSERT INTO students(usn,name,age) VALUES(?,?,?)";
            PreparedStatement ps= con.prepareStatement(query);
            System.out.println("Prepared statement example");
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }


    }
}