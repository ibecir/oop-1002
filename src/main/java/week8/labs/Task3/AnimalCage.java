package week8.labs.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalCage<T extends Animal & Comparable<T>> {
    private List<T> animals = new ArrayList<>();

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public void sortAnimals() {
        Collections.sort(animals);
    }

    public void printAnimals() {
        for (T animal : animals) {
            System.out.println(animal.getInfo());
            animal.speak();
        }
    }
}
