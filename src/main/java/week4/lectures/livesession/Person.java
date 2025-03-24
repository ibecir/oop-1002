package week4.lectures.livesession;

import java.security.InvalidParameterException;

class Person {
    private String name;
    private int age;

    public Person() {}

    public boolean isAdult() {
        return this.age >= 18;
    }

    // Do with the person object whatever you want
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String moreBitWhateverYouWish) {
        this.name = moreBitWhateverYouWish;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 130)
            throw new InvalidParameterException("Age has to be between 0 and 130");
        this.age = age;
    }

    // Bad approach
    public String printPerson() {
        return "Name: " + this.name + ", age: " + this.age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age;
    }
}

class Main {
    public static void main(String[] args) {
        Person becir = new Person("Becir", 31);
        Person hamza = new Person("Hamzoni");
        Person x = new Person();
        System.out.println(hamza.getName());
        System.out.println(becir.getAge());

        becir.setAge(17);
        System.out.println(becir.getAge());

        System.out.println(becir);
    }
}
