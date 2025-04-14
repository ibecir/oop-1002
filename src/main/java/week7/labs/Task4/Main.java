
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Developer("Alice", 5000, "Java"),
            new Manager("Bob", 6000, 10)
        };

        for (Employee e : employees) {
            System.out.println(((Reportable)e).generateReport());
            System.out.println("Bonus: " + e.calculateBonus());
        }
    }
}
