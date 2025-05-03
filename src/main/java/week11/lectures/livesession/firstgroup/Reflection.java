package week11.lectures.livesession.firstgroup;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Cat {
    private final int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }
    public void meow() {
        System.out.println("meow");
    }
    public void saySomething(String something) {
        System.out.println("I said something ".concat(something));
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you call this?");
    }

}

class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat cickaMicka = new Cat(12, "Micka Cicka");

        Method[] methods = cickaMicka.getClass().getDeclaredMethods();
        for (Method method : methods){
            if(method.getName().equals("thisIsPublicStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }

    }
}
