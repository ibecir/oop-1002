package week7.labs.Task4;
public class Developer extends Employee implements Reportable {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus() {
        return salary * 0.2;
    }

    public String generateReport() {
        return getDetails() + ", Language: " + programmingLanguage;
    }
}
