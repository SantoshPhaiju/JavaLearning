package JDBCLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
    private static final String url = "jdbc:mysql://localhost:3306/jdbc_learning";
    private static final String username = "root";
    private static final String password = "@CoderMan99";

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
            String query = String.format("DELETE FROM test WHERE id = %d", 7);

            int count = statement.executeUpdate(query);

            if (count > 0) {
                System.out.println(count + " record deleted successfully!");
            } else {
                System.out.println("No record deleted!");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
