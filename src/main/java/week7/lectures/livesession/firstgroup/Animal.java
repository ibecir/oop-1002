package week7.lectures.livesession.firstgroup;

import java.io.IOException;
import java.nio.CharBuffer;

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

    public abstract String eat();

    public void shout() {
        System.out.println("Animal shouts");
    }
}

class Mouse extends Animal {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return "Mouse is eating!";
    }
}

class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public String eat() {
        return "Tiger is eating";
    }

    public void doSomething() {
        super.shout();
    }

    // public abstract String eat(); // NOT ALLOWED!
}

// class Whale extends Animal {}
class Whale extends Animal implements Readable, Payable {

    public Whale(String name) {
        super(name);
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 0;
    }

    @Override
    public String eat() {
        return "";
    }

    @Override
    public boolean pay(double amount) {
        return false;
    }
}

class MainRunVol2 {
    public static void main(String[] args) {
        Animal a = new Tiger("Misko"); //
        // a.doSomething(); // Not allowed as the Tiger is of Animal type
        Mouse b = new Mouse("Misko"); //
    }
}