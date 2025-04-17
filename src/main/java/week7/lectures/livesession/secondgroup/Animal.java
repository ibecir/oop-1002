package week7.lectures.livesession.secondgroup;

public abstract class Animal {
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

    public abstract void makeSound();
}

class Cat extends Animal implements Securable, Payable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Mjau");
    }

    @Override
    public boolean pay(double amount) {
        return false;
    }

    @Override
    public String createCard(String cardDetails) {
        return "";
    }

    @Override
    public boolean areYouSecure() {
        return false;
    }
}
class Elephant extends Animal {
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Pfffeeeeee");
    }
}

class MainRunVol2 {
    public static void main(String[] args) {
        Cat animal = new Cat("Cicka");
        Elephant slon = new Elephant("Rogonja");

        Animal tRex = new Elephant("T-Rex");

        System.out.println(animal.getName());
        System.out.println(slon.getName());
    }
}
