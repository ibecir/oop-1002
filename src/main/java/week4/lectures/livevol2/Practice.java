package week4.lectures.livevol2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        int number = 1;
        addThree(number);
        System.out.println("The number is " + number);

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Haris", "Skeledzija", "Becir", "OOP");

        removeFirstListElement(list);
        printListVol2(list);

        uglyCode();
    }

    public static void addThree(int num) {
        num = num + 3;
    }

    public static void removeFirstListElement(ArrayList<String> list) { // #123wrOxffx
        list.remove(0);
        list = new ArrayList<>();
    }

    public static void printListVol2(ArrayList<String> list) {
        for (String item : list)
            System.out.println(item);
    }

    public static void uglyCode() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 4, 3, 7, 3);

        System.out.println("The numbers in the beginning:");
        printList(numbers);

        while (numbers.contains(Integer.valueOf(3))) {
            numbers.remove(Integer.valueOf(3));
        }

        System.out.println("The numbers after removal:");
        printList(numbers);

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        String name = new String("Becir");
        String nameSecond = new String("Haris");
        String course = "OOP";
        Integer i = 1;
    }

    public static void printList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.println(number);
        }
    }
}
