package JDBCLearning;

import java.sql.*;

public class Main {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_learning";
    private static final String username = "root";
    private static final String password = "";


    public static void main(String[] args) {

        try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
