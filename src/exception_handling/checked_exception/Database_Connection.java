package exception_handling.checked_exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Connection {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi", "root", "password");
            System.out.println("Connected to database");
            // Perform database operations
            connection.close();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred: " + e.getMessage());
        }
    }
}
