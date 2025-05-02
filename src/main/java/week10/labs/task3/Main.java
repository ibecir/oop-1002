package week10.labs.task3;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30, 160);
        Person p2 = Person.createAnonymous();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(new Person("Alice", 30, 160)));
    }
}