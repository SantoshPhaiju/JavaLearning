package JDBCLearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {
    public static void main(String[] args) {
        try {
            Connection connection = LendenDatabaseConnection.getConnection();

            String debit_query = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
            String credit_query = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

            PreparedStatement debitPreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditPreparedStatement = connection.prepareStatement(credit_query);

            debitPreparedStatement.setDouble(1, 500);
            debitPreparedStatement.setInt(2, 101);

            creditPreparedStatement.setDouble(1, 500);
            creditPreparedStatement.setInt(2, 102);

            int affectedRows1 = debitPreparedStatement.executeUpdate();
            int affectedRows2 = creditPreparedStatement.executeUpdate();



        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
