public class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

import java.lang.reflect.*;

class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("OldName", 4);

        Field nameField = Animal.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(animal, "NewName");

        System.out.println("Modified name: " + nameField.get(animal));
    }
}
