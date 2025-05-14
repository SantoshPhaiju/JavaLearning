package JDBCLearning;

import java.sql.*;

public class MainClass {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_learning";
        String username = "root";
        String password = "";
        String query = "SELECT * FROM test";
        String insertQuery = "INSERT INTO test (title, description) VALUES (?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();
            PreparedStatement ps = c.prepareStatement(insertQuery);
            ps.setString(1, "Java");
            ps.setString(2, "This is the java programming book here...");

            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new record inserted successfully!");
            }

            ResultSet rs = st.executeQuery(query);

            // Print result set
            while (rs.next()) {
                // assuming your table has columns 'id' and 'name'
                int id = rs.getInt("id");
                String name = rs.getString("title");
                System.out.println("ID: " + id + ", title: " + name);
            }

            // Close everything
            rs.close();
            ps.close();
            st.close();
            c.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}
