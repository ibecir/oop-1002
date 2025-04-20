package week8.lectures.materials;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {100, 1, 42};
        String[] characterStringArray = {"Matti P.", "Matti V."};
        double[] floatingNumberArray = {1.20, 3.14, 100.0, 0.6666666667};

        numbers[0] = 19;
        System.out.println(numbers.length);

        int cells = 99;
        int[] array = new int[cells]; //creating an array of the size of the value in the 'cells' variable

        if (array.length == cells) {
            System.out.println("The length of the array is " + cells);
        } else {
            System.out.println("Something unreal happened. The length of the array is something else than " + cells);
        }

        Scanner reader = new Scanner(System.in);
        System.out.print("How many values? ");
        int amountOfValues = Integer.parseInt(reader.nextLine());

        int[] values = new int[amountOfValues];

        System.out.println("Enter values:");
        for (int i = 0; i < amountOfValues; i++) {
            values[i] = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Values again:");
        for (int i = 0; i < amountOfValues; i++) {
            System.out.println(values[i]);
        }
    }

    public static boolean isInArray(int[] array, int searchingFor) {
        for ( int value : array ) {
            if ( value == searchingFor )
                return true;
        }
        return false;
    }

    public static boolean isWordInArray(String[] array, String searchingFor) {
        for ( String word: array ) {
            if ( word.equals(searchingFor) )
                return true;
        }
        return false;
    }

    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
                // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        // If we reach here, then element was not present
        return -1;
    }
}

class Program {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        for (int value : values) {
            System.out.print(value + " ");  // prints: 1, 2, 3, 4, 5
        }

        System.out.println();

        StaticHandling.resetArray(values);

        for (int value : values) {
            System.out.print(value + " ");  // prints: 0, 0, 0, 0, 0
        }
    }
}

class StaticHandling {
    public static void resetArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.age = 0;
        this.name = name;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public void becomeOlder() {
        this.age++;
    }

    public String getName() {
        return this.name;
    }
}






