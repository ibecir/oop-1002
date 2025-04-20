package week6.labs.Task4;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new Developer("Alice", 5000, "Java"),
            new Manager("Bob", 7000, 10)
        };

        for (Employee e : employees) {
            System.out.println(((Reportable) e).generateReport());
            System.out.println("Bonus: $" + e.calculateBonus());
        }
    }
}