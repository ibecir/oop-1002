package week8.lectures.generics;

import java.io.Serializable;

class GenericMethods {
    public static void main(String[] args) {
        printAnything(15);
        printAnything("Object Oriented Programming");
        printAnything(new Cat());

        printAnyTwoThings(15, "OOP");
        printAnyTwoThings(new Dog(), new Cat());
    }

    private static <T> void printAnything(T whatToPrint) {
        System.out.println(whatToPrint);
    }

    private static <T, K> K printAnyTwoThings(T whatToPrint, K anythingElse) {
        System.out.println(whatToPrint);
        System.out.println(anythingElse);

        return anythingElse;
    }
}

class MultipleGenerics<T extends Animal, V extends Serializable> {
    private T myThing;

    public T getMyThing() {
        return myThing;
    }

    public MultipleGenerics<T, V> setMyThing(T myThing) {
        this.myThing = myThing;
        return this;
    }
}