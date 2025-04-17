package week8.labs.Task2;

public class Main {
    public static void main(String[] args) {
        Container<String> message = new Container<>();
        message.setItem("Hello!");
        System.out.println("Stored: " + message.getItem());

        Container<Integer> number = new Container<>();
        number.setItem(123);
        System.out.println("Stored: " + number.getItem());
    }
}
