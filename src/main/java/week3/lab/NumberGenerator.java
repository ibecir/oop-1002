package week3.lab;

import java.util.ArrayList;

public class NumberGenerator {
    public static ArrayList<Integer> generateNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Generated: " + generateNumbers(5));
    }
}