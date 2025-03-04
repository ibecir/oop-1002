package week1.livesession;

import java.util.Scanner;

public class LiveSession {
    public static void main(String[] args) {
        godBlessYou();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your option: sum, multiply, quit:");
            String option = reader.nextLine();

            if (option.equals("quit")) {
                break;
            } else if (option.equals("sum") || option.equals("multiply")) {
                System.out.print("Please enter the value for number a: ");
                int a = Integer.parseInt(reader.nextLine());

                System.out.print("Please enter the value for number b: ");
                int b = Integer.parseInt(reader.nextLine());

                if (option.equals("sum")) {
                    System.out.println("Sum of numbers: " + a + ", " + b + " is: " + (a + b));
                } else {
                    System.out.println("Product of numbers: " + a + ", " + b + " is: " + (a * b));
                }
            }
        }
    }

    public static void godBlessYou() {
        System.out.println("God bless you!");
    }

    public static void godBlessYou(int a) {
        System.out.println("God bless you!");
    }

    public static void godBlessYou(int b, int a) {
        System.out.println("God bless you!");
    }
}
