package week2.livesession.firstgroup;

import java.util.Scanner;

public class LiveSession {
    public static void main(String[] args) {
        printHalfPyramidShapeWithNumbersVol2(11);
//        printHalfPyramidShapeWithNumbers(5);
//        stringOperations("Object Oriented Programming");
//        greetMe("Becir");
//        Scanner reader = new Scanner(System.in);
//        int num = Integer.parseInt(reader.nextLine());
//        int sum = sumOfPrimeDigits(num);
//        System.out.println("The sum of the prime digits for the number " + num + " is: " + sum);
    }

    public static String getUserWelcomeMessage() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(reader.nextLine());

        while (age < 5 || age > 85) {
            if(age < 5){
                System.out.println("You little liar, you cannot write?");;
            } else {
                System.out.println("You old liar!");
            }
            System.out.println("Enter your age again: ");
            age = Integer.parseInt(reader.nextLine());
        }

        return "You are " + age + " years old.";
    }
    public static int sumOfPrimeDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            if(isPrime(digit))
                sum += digit;
        }
        return sum;
    }

    public static boolean isPrime(int digit) {
        if(digit <= 1)
            return false;

        for(int i = 2; i * i <= digit; i++) {
            if(digit % i == 0)
                return false;
        }
        return true;
    }

    public static String greetMe(String name){
        makeTheStackOverflow();
        return "How are you " + name;
    }
    public static void makeTheStackOverflow() {
        greetMe("My Name");
        System.out.println("I'm going to break the stack!");
    }

    public static void stringOperations(String inputString) {
        System.out.println(inputString.length());
        System.out.println(inputString.charAt(7));
        System.out.println(inputString.charAt(inputString.length() - 1));
        System.out.println(inputString.substring(7));
        System.out.println(inputString.substring(7, 17));
    }

    /*

    *
    * *
    * * *
    * * * *
    * * * * *

    * */

    public static void printHalfPyramidShape(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*

     1
     1 2
     1 2 3

     * */

    public static void printHalfPyramidShapeWithNumbers(int rows) {
        for (int i = 1; i <= rows; i++) { // ROWS
            for (int j = 1; j <= i; j++) { // COLUMNS
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*

     1
     2 2
     3 3 3

     * */

    public static void printHalfPyramidShapeWithNumbersVol2(int rows) {
        for (int i = 1; i <= rows; i++) { // ROWS
            for (int j = 1; j <= i; j++) { // COLUMNS
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
