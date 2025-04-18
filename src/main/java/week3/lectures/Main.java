package week3.lectures;

import week3.lectures.db.DbConnect;
import week3.lectures.ds.DataStructures;
import week3.lectures.model.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DataStructures ds = new DataStructures();
        List<User> users = ds.findAgeGreaterThan(13);

        for (User u : users) {
            System.out.println(u.getName());
        }

        DbConnect db = new DbConnect();
        db.deleteCustomerById(112);
        db.updateCustomerById(112, "Becir Isakovic");
        db.getAllCustomers();
        db.getCustomerById(103);

        ArrayList<String> strings = new ArrayList<>();
    }
}
