package week3.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StudentListManager {
    public static void manageStudents() {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ana");
        students.add("Ben");
        students.add("Clara");
        students.add("David");
        students.add("Ella");

        students.remove("Clara");

        for (int i = 0; i < students.size(); i++) {
            System.out.println("For: " + students.get(i));
        }

        for (String s : students) {
            System.out.println("For-each: " + s);
        }

        int i = 0;
        while (i < students.size()) {
            System.out.println("While: " + students.get(i));
            i++;
        }
    }

    public static void sortAndPrintStudents(ArrayList<String> list) {
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static boolean searchStudent(ArrayList<String> list, String name) {
        return list.contains(name);
    }

    public static String getRandomStudent(ArrayList<String> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        manageStudents();

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Liam", "Zoe", "Alice");
        sortAndPrintStudents(names);
        System.out.println("Search Mike: " + searchStudent(names, "Mike"));
        System.out.println("Random: " + getRandomStudent(names));
    }
}