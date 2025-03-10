package week2.lectures;

import java.util.Scanner;

public class Week2 {

    public static String sayMyName(String name) {
        return "Your name is " + name;
    }

    /*

     1
     1 2
     1 2 3 // THIS WILL BE DICTATED BY THE PARAMETER

     */
    public static void printHalfPyramidShapeOfNRows(int numOfRows) {
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfPrimeDigits(12578));
//        printHalfPyramidShapeOfNRows(5);
//
//        Scanner reader = new Scanner(System.in);
//
//        System.out.println("Please enter first number: ");
//        int firstNumber = reader.nextInt();
//
//        System.out.println("Please enter second number: ");
//        int end = reader.nextInt();
//
//        Week2 objInstance = new Week2();
//
//        objInstance.printNumbersInRange(firstNumber, end);
    }

    public static void printNumbersInRange(int start, int end) {
        for (int i = start; start <= end; start++) {
            System.out.println(i);
            i++;
        }
    }

    public static int sumOfPrimeDigits(int n) {
        int sum = 0;
        while(n > 0) {
            int tmp = n % 10;
            int i_sum = 0;
            for (int j = 2; j * j <= tmp; j++) {
                if(tmp % j == 0){
                    i_sum += j;
                }
            }
            n = n / 10;
            if(tmp == i_sum){
                sum += tmp;
            }
        }
        return sum;
    }

    public static int sumOfPrimeDigitsBetter(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            n /= 10;
        }

        return sum;
    }

    // Helper method to check if a number is prime using loops
    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) { // Only check up to √num
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
