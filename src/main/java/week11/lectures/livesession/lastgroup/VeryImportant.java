package week11.lectures.livesession.lastgroup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant {
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RunImmediately{
    int times() default 1;
}

class Person {
    @VeryImportant
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @RunImmediately(times = 3)
    public void first(){
        System.out.println("I'm first");
    }
    @RunImmediately(times = 5)
    public void second(){
        System.out.println("I will run immediately");
    }
}

class MainM {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Person person = new Person("Satara", 22);

        Field[] fields = person.getClass().getDeclaredFields();
        for (Field field : fields){
            if(field.isAnnotationPresent(VeryImportant.class)){
                field.setAccessible(true);
                if(field.get(person) instanceof String tempVar){
                    System.out.println("The important attribute value is " + tempVar.toUpperCase());
                }
            }
        }

        Method[] methods = person.getClass().getDeclaredMethods();
        for (Method method : methods){
            if(method.isAnnotationPresent(RunImmediately.class)){
                RunImmediately inst = method.getAnnotation(RunImmediately.class);
                for(int i = 0; i < inst.times(); i++){
                    method.invoke(person);
                }
            }
        }

    }
}