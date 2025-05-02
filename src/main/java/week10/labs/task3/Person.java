package week10.labs.task3;

public record Person(String name, int age, int height) {
    public static Person createAnonymous() {
        return new Person("Anonymous", 0, 0);
    }
}
