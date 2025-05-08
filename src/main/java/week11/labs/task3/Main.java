public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

import java.lang.reflect.*;

class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Leo", 3);
        Class<?> clazz = animal.getClass();

        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }

        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getReturnType().getSimpleName() + " " + method.getName());
        }
    }
}
