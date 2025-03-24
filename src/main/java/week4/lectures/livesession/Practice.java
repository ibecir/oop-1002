package week4.lectures.livesession;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {
        int number = 1;
        number = addThree(number);
        System.out.println("Main program variable number holds the value: " + number);

        ArrayList<String> students = new ArrayList<>();
        Collections.addAll(students, "Enis", "Hamza", "Anad", "Fadil");

        removeFirstElement(students);

        for (String student : students) {
            System.out.println(student);
        }
    }

    public static int addThree(int becir) {
        becir += 3;
        return becir;
    }

    public static void removeFirstElement(ArrayList<String> list) { // memory location get copied
        list.remove(0);
        list = new ArrayList<>();
        list.add("Becir #####");
        for (String student : list) {
            System.out.println(student);
        }
    }

    public static void uglyCode() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 4, 3, 7, 3);

        System.out.println("The numbers in the beginning:");
        printElements(numbers);

        while (numbers.contains(Integer.valueOf(3))) {
            numbers.remove(Integer.valueOf(3));
        }

        System.out.println("The numbers after removal:");
        printElements(numbers);
    }

    public static void printElements(ArrayList<Integer> list) {
        for (Integer i : list)
            System.out.println(i);
    }
}
