package RUPP.Hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsert{
    public static void main(String[] args) {
        // Database connection details (replace with your own)
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Prepare the SQL statement for insertion
            String insertQuery = "INSERT INTO Product (id, name, price_per_unit, active_for_sell) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Set the values for the parameters
            preparedStatement.setInt(1, 1); // Example: product ID
            preparedStatement.setString(2, "Sample Product"); // Example: product name
            preparedStatement.setDouble(3, 19.99); // Example: price per unit
            preparedStatement.setBoolean(4, true); // Example: active for sell

            // Execute the insertion
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Error inserting data.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}