package week8.labs.Task2;

public class Main {
    public static void main(String[] args) {
        Product<Double> p1 = new Product<>("Laptop", 1200.00);
        Product<Double> p2 = new Product<>("Tablet", 850.00);

        String result = p1.comparePrice(p2);
        System.out.println(result);
    }
}
