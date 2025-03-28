package week3.lab;

public class BasicUtils {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        printMessage("Hello from utils!");
        System.out.println("5 * 3 = " + multiply(5, 3));
        System.out.println("Is 10 even? " + isEven(10));
    }
}