package week12.labs.task4;

public class Validator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age must be non-negative.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        Validator validator = new Validator();
        try {
            validator.validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}