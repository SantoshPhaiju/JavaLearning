package JDBCLearning;

import javax.management.Query;
import javax.swing.plaf.nimbus.State;
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
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM test";
//            String insertQuery = "INSERT INTO test (title, description) VALUES (?,?)";
//            PreparedStatement pst = connection.prepareStatement(insertQuery);
//            pst.setString(1, "Rich dad Poor dad");
//            pst.setString(2, "This is the all time best selling book in the world!");
            ResultSet resultSet = statement.executeQuery(query);
//            int count = pst.executeUpdate();
//            System.out.println("Number of rows inserted: " + count);

//            if (count > 0) {
//                System.out.println("A new record inserted successfully!");
//            }

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                System.out.println("ID: " + id + ", title: " + title + ", description: " + description);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
