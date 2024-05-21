package RUPP.Hw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product{
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

            // Prepare the SQL query to retrieve all products
            String selectQuery = "SELECT * FROM Product";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

            // Execute the query
            ResultSet resultSet = preparedStatement.executeQuery();

            // Print the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price_per_unit");
                boolean active = resultSet.getBoolean("active_for_sell");

                System.out.println("Product ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Price per Unit: $" + price);
                System.out.println("Active for Sell: " + (active ? "Yes" : "No"));
                System.out.println();
            }

            // Close resources
            resultSet.close();
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
