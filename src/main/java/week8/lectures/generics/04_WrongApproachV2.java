package week8.lectures.generics;

import java.util.ArrayList;

class RunMain {
    public static void main(String[] args) {
        ArrayList<Object> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());

        // Animal myDog = animals.get(0); // Won't work as we have to downcast an object
        for (Object animal : animals) {
            Animal a = (Animal) animal;
            // Again the exception, nothing prevents me of adding
            // a Dog to what is expected to be an `Animal` list
            a.eat();
        }
    }
}
