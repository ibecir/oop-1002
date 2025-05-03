package week10.lectures.lambdafunctions.lecturematerials;

// You cannot do anything with this interface accept calling
// the print method
// Lambdas allow us to provide only the implementation of a method
// without any extra stuff
// Lambdas are only allowed to be used with the functional interfaces
// aka Single Abstract Method (SAM) interface
@FunctionalInterface
interface Printable {
    void print();
}

interface PrintableWithSuffix {
    String print(String suffix);
}

interface PrintableWithPrefixAndSuffix {
    String print(String prefix, String suffix);
}

record Person(String name, int age) implements Printable {
    @Override
    public void print() {
        System.out.println("Person: " + name);
    }
}

class MainRun {
    public static void main(String[] args) {
        int a = 1;
        Person person = new Person("Becir", 31);
        printThing(person);

        // 1. Provide the implementation directly without creating a concrete class
        // that implements the interface
        printThing(
                () -> {
                    System.out.println("Lambda Method " + a);
                }
        );

        // If the implementation is a single liner, you do not need the method body
        // for lambdas
        printThing(
                () -> System.out.println("Lambda Method " + a)
        );

        // 3. Lambda allows that method implementations can be saved as an object
        Printable printable = () -> System.out.println("Lambda Method in a variable" + a);

        // 4. If you have a single parameter, you do not need the brackets
        PrintableWithSuffix printableWithSuffix = suffix -> "Printable with + " + suffix;

        // 5. If there is more than a single parameter, you need to have
        // brackets and separate the parameters with comma
        PrintableWithPrefixAndSuffix printableWithPrefixAndSuffix = (prefix, suffix) -> {
            return prefix + " printable with + " + suffix;
        };
    }

    static void printThing(Printable printable) {
        printable.print();
    }
}