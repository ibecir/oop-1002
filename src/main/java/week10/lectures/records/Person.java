package week10.lectures.records;

import java.util.Objects;

// Record cannot inherit any class
// Records are also, by default, final, meaning that they cannot be extended
// by any other class
// You are allowed to implement interfaces in the records
//  are only used to carry the data, and they are immutable (cannot be changed)
record Person(String name, int age, int height) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    // Instance fields are not allowed in the record body, only in the signature
    // of the records in the brackets
    // private String address;

    public Person() {
        this("", 0, 0);
    }

    public Person(String name) {
        this(name, 0, 0);
    }

    public Person(String name, int age) {
        this(name, age, 0);
    }

    // Referred to as a compact constructor, unique only to records
    // Same like the canonical constructor, you do not have to specify
    // parameters that it accepts as by default it accepts all instance
    // fields and sets their values. Used only to impose extra restrictions
    // on the fields like we did it below


    //    public Person(String name, int age, int height) {
    //        if (age > 100)
    //            throw new IllegalArgumentException("Age must be less than 100");
    //        this.name = name;
    //        this.age = age;
    //        this.height = height;
    //    }

    // Same like the constructor on line 36
    public Person {
        if (age > 100)
            throw new IllegalArgumentException("Age must be less than 100");
    }

    public static Person unnamed(String name) {
        return new Person(name);
    }

    public static void printUppercase(String name) {
        System.out.println(name.toUpperCase());
    }

    public int a() {
        return 1;
    }
}

class PersonC {
    private final String name;
    private final int age;
    private final int height;

    // By default, records have an all-arguments constructor which is called
    // canonical constructor. This is unlike the normal Java class whose
    // default constructor is no argument constructor. The canonical constructor
    // is responsible for setting the values for the properties during the
    // instantiation of the object
    public PersonC(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "PersonC class -> name: " + this.name + ", age: " + this.age + ", height: " + this.height;
    }

    @Override
    public boolean equals(Object obj) {
        PersonC compared = (PersonC) obj;
        if (this.name.equals(compared.getName()) && this.age == compared.getAge() && this.height == compared.getHeight())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}

class RunMe {
    public static void main(String[] args) {
        Person firstPerson = new Person("Becir", 29, 180);
        Person secondPerson = new Person("Adnan", 35, 185);

        System.out.println(firstPerson.a());
        System.out.println(firstPerson.name());
        System.out.println(secondPerson.name());
    }
}


