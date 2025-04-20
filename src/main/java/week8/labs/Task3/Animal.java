package week8.labs.Task3;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void speak();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return name + " (" + age + " years)";
    }
}
