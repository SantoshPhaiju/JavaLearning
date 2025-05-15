package JDBCLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {

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
            Statement statement = connection.createStatement();
            String query = String.format("UPDATE test SET title = '%s' WHERE id = %d", "new updated book", 7);

            int count = statement.executeUpdate(query);

            if (count > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record updated!");
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
