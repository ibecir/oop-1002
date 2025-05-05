package week10.lectures.finals;

// The final class cannot be extended
final class Animal {
    // If we make method final we cannot override it
    public void eat() {
        System.out.println("Eating");
    }
    // This method cannot be overridden
    public final void makeSound() {
        System.out.println("Muuuuu");
    }
}

class Lion extends Animal {
    @Override
    public void eat() {
        super.eat();
    }
}

class Wolf extends Animal {

}

class RunMe {

    public static final String UNIVERISITY_ADDRESS = "Fr bb";


    public static void main(String[] args) {
        // If we have a final variable, that variable value can only be set once
        final Wolf wolf;
        wolf = new Wolf();
    }
}
