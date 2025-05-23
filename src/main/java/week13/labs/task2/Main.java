package week13.labs.task2;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza.Builder("Large").addCheese().addPepperoni().build();
        Pizza pizza2 = new Pizza.Builder("Medium").addBacon().build();

        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
