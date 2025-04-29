package week10.lectures.lambdafunctions.interfacesoverview;

// The thing is, as this interface only has one method,
// only thing you can do with it is to call this print
// method. But we have to do so many things to make the
// print method has its own implementation.
interface Printable {
    public void print();
}

class Cat implements Printable{
    public String name;
    public int age;

    public Cat() {}

    @Override
    public void print() {
        System.out.println("I'm a cat!");
    }
}

class MainRun {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.print();

        // or we can call the printThing on the cat instance
        // as it implements the Printable interface, and it
        // has to provide the implementation to the print method
        printThing(cat);
        Printable printable = () -> System.out.println("I'm something printable");
        printThing(printable);
    }

    public static void printThing(Printable thing){
        thing.print();
    }
}
