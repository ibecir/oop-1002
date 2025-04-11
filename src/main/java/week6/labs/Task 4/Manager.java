public class Manager extends Employee implements Reportable {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.3;
    }

    @Override
    public String generateReport() {
        return "Manager Report -> " + getDetails() + ", Team Size: " + teamSize;
    }
}