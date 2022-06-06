package DB_Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Connect {

    final static String Driver = "com.mysql.jdbc.Driver";


    final static String Url = "jdbc:mysql://localhost/grand_system";
    final static String User = "root";
    final static String Password = "root1234";
    public static boolean flag = false;

    public Connection con;
    public Statement stmt;
    public   Statement stmt2;
    public PreparedStatement pstmt;

    public Connect() {
        try {

            Class.forName(Driver);
            con = DriverManager.getConnection(Url, User, Password);
            stmt = con.createStatement();
            if (con != null) {
                System.out.println("Connection...");
            }

        } catch (Exception e) {

            System.out.println("Error in connect DB : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Connect();
    }

}
