package week15.lectures.livesession;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface Trainable {
    void enroll();
}

interface Expensable {
    void recordExpense(String date, double amount);
}

class Employee implements Trainable, Expensable {
    private String name;
    private HashMap<String, List<Double>> expenses;

    public Employee(String name) {
        this.name = name;
        this.expenses = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void enroll() {
        System.out.println("Employee enrolled in training.");
    }

    @Override
    public void recordExpense(String date, double amount) {
        this.expenses.putIfAbsent(date, new ArrayList<>());
        this.expenses.get(date).add(amount);
    }

    public double getTotalExpense(String date) {
        double total = 0.0;

        if(!this.expenses.containsKey(date))
            return total;

        for (Double amount : this.expenses.get(date))
            total += amount;

        return total;
    }
}

class LetsRunIt {
    public static void main(String[] args) {
        Employee becir = new Employee("Becir");
        becir.recordExpense("2025-06-09", 0.1);
        becir.recordExpense("2025-06-09", 5);

        becir.recordExpense("2025-06-08", 100);

        System.out.println(becir.getTotalExpense("2025-06-09"));
        System.out.println(becir.getTotalExpense("2025-06-08"));
        System.out.println(becir.getTotalExpense("2025-06-07"));
    }
}