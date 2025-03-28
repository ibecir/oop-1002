package week3.lab;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerListProcessor {
    public static ArrayList<Integer> processNumbers(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        numbers.removeIf(n -> n % 2 == 0);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 5, 2, 8, 1, 3);
        System.out.println("Processed: " + processNumbers(nums));
    }
}