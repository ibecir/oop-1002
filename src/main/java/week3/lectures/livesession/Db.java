package week3.lectures.livesession;

import java.sql.*;
import java.util.PrimitiveIterator;

public class Db {
    public static void main(String[] args) {
        Db db = new Db();
//        db.getAllEmployees();
        db.getEmployeeByFirstAndLastName("Anthony", "Bow", 1143);
    }

    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/classicmodels";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";

    private Connection connection = null;

    public Db () {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Successfully connected");
        } catch (SQLException e){
            System.out.println("Unable to connect to the database");
        }
    }

    public void getAllEmployees() {
        try {
            String query = "SELECT firstName, lastName FROM employees;";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String fullName =
                        rs.getString("firstName") +
                        " " +
                        rs.getString("lastName");
                System.out.println(fullName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void getEmployeeByFirstAndLastName(String firstName, String lastName, int employeeNumber) {
        try {
            String query = "SELECT employeeNumber, firstName " +
                           "FROM employees WHERE firstName = ? AND lastName = ? AND employeeNumber = ?;";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setInt(3, employeeNumber);

            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                System.out.println(
                        "First name is: " +
                        rs.getString("firstName") +
                        " and the employee number is: " +
                        rs.getInt("employeeNumber"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public class DbConnect {
        private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/classicmodels";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "root";

        private Connection connection = null;

        public DbConnect() {
            try {
                connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public void getAllCustomers() throws SQLException {
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM customers LIMIT 5");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("customerNumber"));
                System.out.println(rs.getString("customerName"));
            }
        }

        public void getCustomerById(int customerId) throws SQLException {
            // READ MORE ABOUT SQL INJECTION ATTACKS AND SHY PREPARED STATEMENT IS IMPORTANT
            PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM customers WHERE customerNumber = ?");
            statement.setInt(1, customerId);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("customerNumber"));
                System.out.println(rs.getString("customerName"));
            }
        }

        public void deleteCustomerById(int customerId) throws SQLException {
            PreparedStatement statement = this.connection.prepareStatement("DELETE FROM customers WHERE customerNumber = ?");
            statement.setInt(1, customerId);
            int deletedRows = statement.executeUpdate();
        }

        public void updateCustomerById(int customerId, String name) throws SQLException {
            PreparedStatement statement = this.connection.prepareStatement("UPDATE customers SET customerName = ? WHERE customerNumber = ?");
            statement.setString(1, name);
            statement.setInt(2, customerId);
            int updatedRows = statement.executeUpdate();
        }
    }
}
