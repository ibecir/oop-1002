public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    public String getDetails() {
        return "Name: " + name + ", Salary: $" + salary;
    }
}