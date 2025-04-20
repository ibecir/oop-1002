package week7.labs.Task1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Rex"), new Cat("Whiskers") };

        for (Animal a : animals) {
            System.out.println("Name: " + a.getName());
            a.makeSound();

            if (a instanceof Dog) {
                ((Dog) a).fetch();
            } else if (a instanceof Cat) {
                ((Cat) a).purr();
            }
        }
    }
}
