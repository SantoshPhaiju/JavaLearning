package JavaPractical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Question2 {
    private static final String url = "jdbc:mysql://localhost:3306/human_resource";
    private static final String username = "root";
    private static final String password = "@CoderMan99";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement stmt = con.prepareStatement("INSERT INTO employee (name, address, designation, salary) values (?,?,?,?)");
            stmt.setString(1, "Santosh Phaiju");
            stmt.setString(2, "Chabahil, Kathmandu");
            stmt.setString(3, "Senior Software Engineer");
            stmt.setInt(4, 180000);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data Inserted successfully!");
            } else {
                System.out.println("Data not inserted!");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
