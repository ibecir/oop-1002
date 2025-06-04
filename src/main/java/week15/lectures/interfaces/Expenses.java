package week15.lectures.interfaces;

import java.util.*;

// Interface for training enrollment
interface Trainable {
    void enroll();
}

// Interface for expense tracking
interface Expense {
    void recordExpense(String date, double amount);
}

// Employee class implementing both interfaces
class Employee implements Trainable, Expense {
    private Map<String, List<Double>> expenses;

    public Employee() {
        expenses = new HashMap<>();
    }

    @Override
    public void enroll() {
        System.out.println("Employee enrolled in training.");
    }

    @Override
    public void recordExpense(String date, double amount) {
        expenses.putIfAbsent(date, new ArrayList<>());
        expenses.get(date).add(amount);
    }

    public double getTotalExpense(String date) {
        List<Double> dailyExpenses = expenses.get(date);
        if (dailyExpenses == null) return 0.0;
        double total = 0.0;
        for (double amount : dailyExpenses) {
            total += amount;
        }
        return total;
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.enroll();  // Output: Employee enrolled in training.

        emp.recordExpense("2025-06-01", 100.0);
        emp.recordExpense("2025-06-01", 50.0);
        emp.recordExpense("2025-06-02", 75.0);

        System.out.println("Total on 2025-06-01: $" + emp.getTotalExpense("2025-06-01")); // Output: $150.0
        System.out.println("Total on 2025-06-02: $" + emp.getTotalExpense("2025-06-02")); // Output: $75.0
        System.out.println("Total on 2025-06-03: $" + emp.getTotalExpense("2025-06-03")); // Output: $0.0
    }
}

