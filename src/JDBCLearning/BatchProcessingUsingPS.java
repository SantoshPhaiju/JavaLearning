package JDBCLearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessingUsingPS {
    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            Scanner sc = new Scanner(System.in);

            String query = "INSERT INTO test (title, description) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            while (true) {
                System.out.println("Enter the title of the book: ");
                String title = sc.nextLine();
                System.out.println("Enter the description of the book: ");
                String description = sc.nextLine();
                System.out.println("Enter more data (Y/N): ");
                String choice = sc.nextLine();

                preparedStatement.setString(1, title);
                preparedStatement.setString(2, description);

                preparedStatement.addBatch();

                if(choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            int[] arr = preparedStatement.executeBatch();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    System.out.println("Query: " + i + 1 + " not executed successfully!");
                }
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


    }
}
