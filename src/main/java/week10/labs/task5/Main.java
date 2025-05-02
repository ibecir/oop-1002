package week10.labs.task5;

import java.util.Optional;

public class Main {
    public static Optional<Wolf> findWolfByName(String name) {
        return "Strasni".equals(name) ? Optional.of(new Wolf("Strasni", 5)) : Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Wolf> wolf = findWolfByName("Strasni");

        wolf.ifPresent(w -> System.out.println("Age: " + w.age()));
        System.out.println(wolf.orElse(new Wolf("Unknown", 0)));

        wolf = findWolfByName("Unknown");
        System.out.println(wolf.orElseThrow(() -> new RuntimeException("No wolf found")));
    }
}