package week11.lectures.livesession.firstgroup;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RunImmediatelyNTimes {
    int times() default 1;
    String name() default "MySmth";
}

record Lion(String name) {
    @RunImmediatelyNTimes(times = 5)
    public void saySomething() {
        System.out.println("Lion method saySomething");
    }
    public void saySomethingButDontRun() {
        System.out.println("Lion method saySomethingButDontRun");
    }
}

class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Lion lav = new Lion("Lafcina");
        Method[] methods = lav.getClass().getDeclaredMethods();
        for (Method method : methods){
            if(method.isAnnotationPresent(RunImmediatelyNTimes.class)){
                RunImmediatelyNTimes obj = method.getAnnotation(RunImmediatelyNTimes.class);

                for(int i = 0; i < obj.times(); i++)
                    method.invoke(lav);
            }
        }
    }
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface ImportantString { }


class Fox{
    @ImportantString
    private String name;
    private int numOfLegs;

    public Fox(String name, int numOfLegs) {
        this.name = name;
        this.numOfLegs = numOfLegs;
    }

    public static void main(String[] args) throws IllegalAccessException {
        Fox fox = new Fox("Lija", 4);
        for (Field field : fox.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantString.class)){
                field.setAccessible(true);
                Object value = field.get(fox);
                if(value instanceof String myFoxName) // String myFoxName = (String) value
                    System.out.println(
                            "The field name is " +
                                    field.getName() +
                                    " and its value in uppercase is " + myFoxName.toUpperCase());
            }
        }

    }
}
