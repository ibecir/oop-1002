package week10.lectures.livesession.secondgroup;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class Playground {
    public static final List<Person> personList = Arrays.asList(
            new Person("Becir", 31, 100),
            new Person("Haris", 20, 100_000)
    );

    public static void main(String[] args) {
        final int i = 5;

        Optional<Person> p = findByName("Haris");
        if(p.isPresent())
            System.out.println(p.get().getName());
    }

    public static Optional<Person> findByName(String name) {
        for (Person p : personList) {
            if(p.getName().equals(name))
                return Optional.of(p);
        }
        return Optional.empty();
    }
}

class Person {
    private String name;
    private int age;
    private double balance;

    public Person(String name, int age, double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150)
            this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", balance: " + this.balance;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof Person) {
            Person comparedPerson = (Person) object;
            if (this.name.equals(comparedPerson.getName()) && this.age == comparedPerson.getAge()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String print() {
        return "Printing the Person CLASS";
    }
}

record PersonR(String name, int age, double balance){
    public PersonR(String name, int age) {
        this(name, age, 0);
    }

    public PersonR {
        if (this.balance() < 0)
            throw new InvalidParameterException();
    }

    @Override
    public String toString() {
        return "Name: " + this.name() + ", age: " + this.age + ", balance: " + this.balance;
    }

    public String print() {
        return "Printing the record";
    }
}

@FunctionalInterface
interface Printable {
    String print(String thing, String secondThing);
}

