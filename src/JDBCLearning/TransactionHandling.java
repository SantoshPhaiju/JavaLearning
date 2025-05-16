package JDBCLearning;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionHandling {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();

            String debit_query = "UPDATE accounts SET balance"




        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
