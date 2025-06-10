package week15.lectures.livesessionv2;

import java.sql.*;

class DB {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/oopgroup1";
    private static final String USERNAME = "oopuser";
    private static final String PASSWORD = "ooppassWD";
    private Connection connection = null;

    public DB() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getUsers(String name, int id) {
        try {
            String query = "SELECT name, id FROM users WHERE name = ? AND id > ?;";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, name);
            statement.setInt(2, id);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                System.out.println("Name: " + rs.getString(1) + ", id: " + rs.getInt(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class RunMain {
    public static void main(String[] args) {
        DB db = new DB();
        db.getUsers("Becir", 2);
    }
}
