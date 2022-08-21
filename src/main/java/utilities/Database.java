package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    
    private final String url = "jdbc:postgresql://localhost:8996/postgres";
    private final String user = "postgres";
    private final String password = "admin";
    
    public Connection Connect() {
        
        Connection connection = null;
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return connection;
    }
    
}