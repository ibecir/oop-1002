package week3.lab;

import java.sql.*;

public class ScheduleFetcher {
    private static final String CONNECTION_STRING = "jdbc:mysql://oop.ibu.edu.ba:3306/mtest_db?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "mtestdb_usr";
    private static final String PASSWORD = "mtest97dbUSR";

    private Connection connection;

    public ScheduleFetcher() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public void getScheduleByDay(String dayOfWeek) throws SQLException {
        String query = "SELECT id, course_id FROM schedule WHERE day = ?";
        PreparedStatement statement = this.connection.prepareStatement(query);
        statement.setString(1, dayOfWeek);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " -> " + rs.getString("course_id"));
        }
    }

    public static void main(String[] args) {
        try {
            ScheduleFetcher db = new ScheduleFetcher();
            db.getScheduleByDay("Monday");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}