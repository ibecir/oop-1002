package week8.lectures.generics;

import java.io.Serializable;
import java.util.List;

// The bounded generics are allowed also with interfaces, following the
// same rules we have for inheritance
// class SpecificPrinter <T extends Animal & Dog> -- NOT ALLOWED
// class SpecificPrinter <T extends Animal & Serializable & List> -- ALLOWED
// class SpecificPrinter <T extends Animal & Serializable & List> -- ALLOWED
// class SpecificPrinter <T extends Serializable> ALLOWED

import java.io.Serializable;
import java.util.List;

class SpecificPrinter <T extends Animal> {
    private T thingToPrint; // Totally unaware what T will become

    // Generic type, everything that is an animal
    public SpecificPrinter(T thingToPrint) {
        // This is allowed as we know that this is a bounded generic
        // so it has to be of type animal
        thingToPrint.eat();
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}

class MainRun {
    public static void main(String[] args) {
        SpecificPrinter<Dog> dogSpecificPrinter = new SpecificPrinter<>(new Dog());
        SpecificPrinter<Cat> catSpecificPrinter = new SpecificPrinter<>(new Cat());
    }
}
