package week7.labs.Task1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching!");
    }
}
