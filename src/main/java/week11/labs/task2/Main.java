package week11.labs.task2;

import java.lang.reflect.*;

class MainS {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Rex", 5);

        Class<?> clazz = dog.getClass();
        Field[] fields = clazz.getDeclaredFields();
        
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

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(dog, "Max");
        System.out.println("\nModified name: " + nameField.get(dog));

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(dog, 8);
        System.out.println("Modified age: " + ageField.get(dog));

        clazz.getDeclaredMethod("bark").invoke(dog);
        clazz.getDeclaredMethod("say", String.class).invoke(dog, "Let's play!");
        Method privateMethod = clazz.getDeclaredMethod("whisper");
        privateMethod.setAccessible(true);
        privateMethod.invoke(dog);
        clazz.getDeclaredMethod("info").invoke(null);
    }
}
