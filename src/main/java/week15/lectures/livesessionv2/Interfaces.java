package week15.lectures.livesessionv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface Trainable {
    public abstract void enroll();
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

    @Override
    public void enroll() {
        System.out.println("Employee enrolled in training.");
    }

    @Override
    public void recordExpense(String date, double amount) {
        if(!this.expenses.containsKey(date))
            this.expenses.put(date, new ArrayList<>());

        this.expenses.get(date).add(amount);
    }

    public double getTotalExpenses(String date) {
        double total = 0.0;
        if(this.expenses.containsKey(date)){
            for (Double expense : this.expenses.get(date))
                total += expense;
        }
        return total;
    }
}

class RunAgain {
    public static void main(String[] args) {
        Employee employee = new Employee("Becir");
        employee.recordExpense("2025-06-09", 10);
        employee.recordExpense("2025-06-09", 20);

        employee.recordExpense("2025-06-10", 1);
        employee.recordExpense("2025-06-10", 2);
        employee.recordExpense("2025-06-10", 3);
        employee.recordExpense("2025-06-10", 4);

        employee.recordExpense("2025-06-11", 100);

        System.out.println(employee.getTotalExpenses("2025-06-11"));
    }
}
