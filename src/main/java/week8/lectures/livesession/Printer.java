package week8.lectures.livesession;

import week6.labs.Task1.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class StringPrinter {
    private String thingToPrint;

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public String getThingToPrint() {
        return thingToPrint;
    }
    public StringPrinter setThingToPrint(String thingToPrint) {
        this.thingToPrint = thingToPrint;
        return this;
    }

    public void printThing() {
        System.out.println(thingToPrint);
    }
}
class DoublePrinter {
    private Double thingToPrint;

    public DoublePrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public Double getThingToPrint() {
        return thingToPrint;
    }
    public void setThingToPrint(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printThing() {
        System.out.println(thingToPrint);
    }
}

interface CustomOne {

}
interface Walkable {

}

class GenericPrinter<T extends Animal & CustomOne & Walkable, S extends Object> {
    private T thingToPrint;
    private S oneMoreThingToPrint;

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }
    public GenericPrinter<T, S> setThingToPrint(T thingToPrint, S anotherThing) {
        this.thingToPrint = thingToPrint;
        this.oneMoreThingToPrint = anotherThing;
        return this;
    }

    public void printThing() {
        thingToPrint.eat();
        System.out.println(this.thingToPrint + " - " + oneMoreThingToPrint);
    }
}

class Animal implements CustomOne, Walkable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public void eat() {
        System.out.println("Animal is eating!");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}
class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }
}

class RunMain {
    public static void main(String[] args) {
        StringPrinter printer = new StringPrinter("Becir");
        printer.printThing();

        DoublePrinter doublePrinter = new DoublePrinter(1.5);
        doublePrinter.printThing();

        GenericPrinter<Tiger, Integer> stringGenericPrinter = new GenericPrinter<>(new Tiger("Tiger"));
        GenericPrinter<Dog, Cat> integerGenericPrinter = new GenericPrinter<>(new Dog("Rex"));
        GenericPrinter<Animal, Tiger> animalGenericPrinter = new GenericPrinter<>(new Animal("Cicka"));

        stringGenericPrinter.printThing();
        integerGenericPrinter.printThing();
        animalGenericPrinter.printThing();

        ArrayList<String> myStringList = new ArrayList<>();
        HashMap<Integer, String> myHashMap = new HashMap<>();

        List<Object> objects = new ArrayList<>();

        objects.add(new Tiger("Tiger"));
        objects.add(new Dog("Rex"));
        objects.add(new String("Becir"));

        for (Object object : objects) {
            Animal a = (Animal) object;
            a.eat();
        }

        printSomething(new Dog("Rex"), new Tiger("Tigric"));
        printSomething(new Tiger("Rex"), new Animal("Tigric"));
        printSomething(new String("Some string"), new Animal("Tigric"));

        List<Dog> dogs = new ArrayList<>();
        printAnyList(dogs);

        List<String> strings = new ArrayList<>();
        printAnyList(strings);
    }

    private static void printAnyList(List<?> list) {
        System.out.println(list);
    }

    // We can return a generic from a method
    // The method level generics can also be bounded
    public static <T, S extends Animal & Walkable> T printSomething (T something, S anotherThing) {
        System.out.println(something);
        System.out.println(anotherThing);

        return something;
    }
}
