package week3.lectures.livesession;

public class Student {
    public String fullName;
    public int yearOfBirth;
    public Gender gender;

    public Student (String name, int birthYear, Gender g) {
        fullName = name;
        yearOfBirth = birthYear;
        gender = g;
    }

    public int getAge() {
        return 2025 - yearOfBirth;
    }

    public String greet() {
        return "Good morning";
    }

    public static int getNumber() {
        return 18;
    }
}
