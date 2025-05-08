public class Dog {
    private final String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void say(String message) {
        System.out.println("Dog says: " + message);
    }

    private void whisper() {
        System.out.println("Secret bark...");
    }

    public static void info() {
        System.out.println("Static info about dogs.");
    }
}

import java.lang.reflect.*;

class Main {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Rex", 5);

        Class<?> clazz = dog.getClass();
        System.out.println("Class: " + clazz.getName());

        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            System.out.println(field.getType().getSimpleName() + " " + field.getName() + " = " + field.get(dog));
        }

        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.print(method.getReturnType().getSimpleName() + " " + method.getName() + "(");
            Class<?>[] params = method.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                System.out.print(params[i].getSimpleName());
                if (i < params.length - 1) System.out.print(", ");
            }
            System.out.println(")");
        }

        // Change private final field
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(dog, "Max");
        System.out.println("\nModified name: " + nameField.get(dog));

        // Change age
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(dog, 8);
        System.out.println("Modified age: " + ageField.get(dog));

        // Invoke methods
        clazz.getDeclaredMethod("bark").invoke(dog);
        clazz.getDeclaredMethod("say", String.class).invoke(dog, "Let's play!");
        Method privateMethod = clazz.getDeclaredMethod("whisper");
        privateMethod.setAccessible(true);
        privateMethod.invoke(dog);
        clazz.getDeclaredMethod("info").invoke(null);
    }
}
