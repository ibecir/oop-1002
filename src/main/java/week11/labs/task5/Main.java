public class Animal {
    public void speak() {
        System.out.println("The animal makes a sound.");
    }

    public void say(String message) {
        System.out.println("Animal says: " + message);
    }
}

import java.lang.reflect.*;

class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();

        Method speakMethod = Animal.class.getDeclaredMethod("speak");
        speakMethod.invoke(animal);

        Method sayMethod = Animal.class.getDeclaredMethod("say", String.class);
        sayMethod.invoke(animal, "Hello!");
    }
}
