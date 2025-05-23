package week11.lectures.livesession.secondgroup;

import java.lang.reflect.*;

class Person {
    @ExtremelyImportant
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @RunImmediately(numOfTimes = 3)
    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }

    @RunImmediately(numOfTimes = 5)
    @SuppressWarnings("unused")
    public void saySomethingLoud(String loudThing) {
        System.out.println("aaaaaaaaaaaaaaaaaa");
    }
    public void saySomething(String something, int number) {
        System.out.println("I said something ".concat(something).concat(" ").concat(String.valueOf(number)));
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you call this?");
    }
}

class MainPlayground {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Becir", 31);
        Field[] fields = p.getClass().getDeclaredFields();

        /*for (Field field : fields){
            field.setAccessible(true);
            if(field.getName().equals("name"))
                field.set(p, "Haris");
            System.out.println(field.get(p)); // p.name, p.age
        }*/

        Method[] methods = p.getClass().getDeclaredMethods();
        /*for (Method method : methods) {
            if(method.getName().equals("shout"))
                method.invoke(p);
            else if(method.getName().equals("thisIsPublicStaticMethod")) {
                method.invoke(p);
                p.thisIsPublicStaticMethod();
            } else if (method.getName().equals("saySomething"))
                method.invoke(p, "OOP class", 2);
            else if (method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(p);
            }
        }*/

        for (Field field : fields) {
            if(field.isAnnotationPresent(ExtremelyImportant.class)) {
                field.setAccessible(true);
                Object object = field.get(p);
                if(object instanceof String value) {
                    System.out.println("The field " + field.getName() + " is extremely important and its value is " + value.toUpperCase());
                }
            }
        }

        for (Method method : methods) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.numOfTimes(); i++) {
                    method.invoke(p);
                }
            }
        }
    }
}
