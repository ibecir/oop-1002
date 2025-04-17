package week8.labs.Task4;

public class Printer<T extends Animal> {
    private T animal;

    public Printer(T animal) {
        this.animal = animal;
    }

    public void printSound() {
        animal.makeSound();
    }

    public static void main(String[] args) {
        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.printSound(); // Woof!
    }
}
