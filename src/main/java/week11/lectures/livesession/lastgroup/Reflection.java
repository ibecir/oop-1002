package week11.lectures.livesession.lastgroup;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Reflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        @SuppressWarnings("unchecked")
        Cat mackica = new Cat("Cicka", 12);

        Method[] methods = mackica.getClass().getDeclaredMethods();
        Field[] fields = mackica.getClass().getDeclaredFields();

        for (Method method : methods){
            if(method.getName().equals("thisIsPublicStaticMethod")){
                method.invoke(null);
            } else if(method.getName().equals("meow")){
                method.invoke(mackica);
            } else if(method.getName().equals("saySomething")){
                method.invoke(mackica, " I SAID SOMETHING");
            } else if(method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(mackica);
            }
        }
    }
}

class Cat {
    private final String name;
    private int age;

    @Deprecated
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

