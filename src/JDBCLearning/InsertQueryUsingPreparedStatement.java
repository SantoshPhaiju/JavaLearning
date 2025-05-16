package JDBCLearning;

import java.sql.*;

public class InsertQueryUsingPreparedStatement {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_learning";
    private static final String username = "root";
    private static final String password = "";

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "INSERT INTO test (title, description) VALUES (?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "With Prepared Statement");
            preparedStatement.setString(2, "This is the data which i have crated using prepared statement in the java hehehehehehehehe........");


            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " new record inserted successfully!");
            } else {
                System.out.println("No record inserted!");
            }


        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
