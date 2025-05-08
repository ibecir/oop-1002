import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant {}

@VeryImportant
record Lion(String name) {}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Lav");

        if (lion.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("Lion class is marked as VeryImportant!");
        } else {
            System.out.println("Lion class is not marked important.");
        }
    }
}
