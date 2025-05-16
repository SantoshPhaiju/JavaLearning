package JDBCLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LendenDatabaseConnection {
    private static final String url = "jdbc:mysql://localhost:3306/lenden";
    private static final String username = "root";
    private static final String password = "";

    public Connection getConnection() throws ClassNotFoundException, SQLException  {
        return DriverManager.getConnection(url, username, password);
    }
}
