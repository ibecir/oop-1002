package week10.lectures.optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

record Human(String name, int age) {
}

class OptionalsExample {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Becir", 29),
                new Human("Adnan", 35)
        );

        Optional<Human> human = Optional.of(new Human("Becir", 29));
        Human humanNullable = Optional
                .of(new Human("Becir", 29))
                .orElse(null);
        System.out.printf("Human is: %s%n", humanNullable);

        String name = Optional
                .ofNullable("Top")
                .orElseGet(() -> "Becir");

        System.out.printf(name + " is %s\n", human);

        Optional<Human> humanOptional = humans
                .stream()
                .filter(humanFilter -> humanFilter.name().equals("Becir"))
                .findFirst();

        System.out.printf(humanOptional.get().name());
    }
}
