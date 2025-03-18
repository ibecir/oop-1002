package week1.labs;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        printGreeting();
        printShape();
        greetUser();
        performArithmeticOperations();
        convertTemperature();
        checkEvenOdd();
        determineGrade();
        checkVotingEligibility();
        compareNumbers();
        checkLeapYear();
        validatePassword();
        authenticateUser();
        countdown();
        printMultiplicationTable();
        playGuessingGame();
    }

    public static void printGreeting() {
        System.out.println("Hello, I am a Java program!");
    }

    public static void printShape() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /____\\");
    }

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! You are a future Java ninja");
    }

    public static void performArithmeticOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
    }

    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void determineGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void checkVotingEligibility() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        if (first > second) {
            System.out.println(first + " is larger");
        } else if (second > first) {
            System.out.println(second + " is larger");
        } else {
            System.out.println("Both are equal");
        }
    }

    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void validatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (password.equals("JavaRocks")) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied!");
        }
    }

    public static void authenticateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String userPass = scanner.nextLine();
        if (username.equals("admin") && userPass.equals("1234")) {
            System.out.println("Welcome, Admin!");
        } else {
            System.out.println("Access Denied!");
        }
    }

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int count = scanner.nextInt();
        while (count > 0) {
            System.out.println(count);
            count--;
        }
    }

    public static void printMultiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int tableNum = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }
    }

    public static void playGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;
        System.out.println("Guess a number between 1 and 100");
        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
            }
        }
    }
}

