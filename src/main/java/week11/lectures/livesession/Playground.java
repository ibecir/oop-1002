package week11.lectures.livesession;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Tiger {
    @VeryImportant
    private final String name;
    private int age;

    public Tiger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    @RunImmediately(times = 5)
    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }
    @RunImmediately
    private void meow() {
        System.out.println("meow");
    }
    public void saySomething(String something, String somethingElse) {
        System.out.println("I said something ".concat(something).concat(somethingElse));
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you call this?");
    }

    @SuppressWarnings("unused")
    private void becir() {
        System.out.println("How did you call this?");
    }

}

class Playground {
    public static void main(String[] args) throws Exception {
        Tiger tiger = new Tiger("Tigar", 20);

        Field[] fields = tiger.getClass().getDeclaredFields();
        /*for (Field field : fields) { // name, age
            field.setAccessible(true);
            if(field.getName().equals("name"))
                field.set(tiger, "Macka");

            System.out.println(field.get(tiger));
        }*/

        Method[] methods = tiger.getClass().getDeclaredMethods();
        /*for (Method method : methods) {
            if(method.getName().equals("meow")){
                method.invoke(tiger);
                tiger.meow();
            } else if(method.getName().equals("thisIsPublicStaticMethod")) {
                method.invoke(null);
            } else if (method.getName().equals("saySomething")) {
                method.invoke(tiger, "Something", " one more thing");
            } else if (method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(tiger);
            }
        }*/

        for (Field field : fields) {
            if(field.isAnnotationPresent(VeryImportant.class)) {
                field.setAccessible(true);
                Object object = field.get(tiger);
                if(object instanceof String value) {
                    System.out.println("Attribute name: " + field.getName() + " is very important and its value is " + value.toUpperCase());
                }
            }
        }

        for (Method method : methods) {
            method.setAccessible(true);
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately numOfTimes = method.getAnnotation(RunImmediately.class);
                for(int i = 0; i < numOfTimes.times(); i++) {
                    method.invoke(tiger);
                    tiger.thisIsPublicStaticMethod();
                }
            }
        }
    }
}
