package week5.labs.Task1;
public class Person {
    private String name;
    private String email;
    private int birthYear;

    public Person(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public int getAge(int currentYear) {
        return currentYear - birthYear;
    }

    public String getInfo() {
        return "Name: " + name + ", Email: " + email + ", Age: " + getAge(2025);
    }
}