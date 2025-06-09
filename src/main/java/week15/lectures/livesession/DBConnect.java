package week15.lectures.livesession;

import java.sql.*;

class DBConnect {
    private static final String connectionString = "jdbc:mysql://oop.ibu.edu.ba:3306/oopgroup1";
    private static final String username = "oopuser";
    private static final String password = "ooppassWD";
    private Connection connection;

    public DBConnect() throws SQLException {
        try {
            connection = DriverManager.getConnection(connectionString, username, password);
            System.out.println("I have connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getUsers(String name, int id) {
        try {
            String query = "SELECT name, id FROM users WHERE name = ? OR id > ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") + ", id: " + rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class MainRuns {
    public static void main(String[] args) throws SQLException {
        try {
            DBConnect db = new DBConnect();
            db.getUsers("Lamija", 9);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
