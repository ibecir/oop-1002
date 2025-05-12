package week11.labs.task4;

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
