public class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    @Override
    public String generateReport() {
        return "Developer Report -> " + getDetails() + ", Language: " + programmingLanguage;
    }
}