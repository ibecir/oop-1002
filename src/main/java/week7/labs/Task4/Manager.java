package week7.labs.Task4;
public class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public double calculateBonus() {
        return salary * 0.3;
    }

    public String generateReport() {
        return getDetails() + ", Team Size: " + teamSize;
    }
}
