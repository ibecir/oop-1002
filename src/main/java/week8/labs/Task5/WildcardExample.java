package week8.labs.Task5;

import java.util.*;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Marko", "Ivana");
        List<Integer> ages = Arrays.asList(20, 25, 30);

        System.out.println("Names:");
        printList(names);

        System.out.println("Ages:");
        printList(ages);
    }
}
