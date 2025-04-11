public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy");
        animals[1] = new Cat("Whiskers");

        for (Animal animal : animals) {
            System.out.print(animal.getName() + " says: ");
            animal.makeSound();

            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Cat) {
                ((Cat) animal).purr();
            }
        }
    }
}