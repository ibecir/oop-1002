package week8.labs.Task3;

public class Main {
    public static void main(String[] args) {
        AnimalCage<Lion> lionCage = new AnimalCage<>();
        lionCage.addAnimal(new Lion("Simba", 5));
        lionCage.addAnimal(new Lion("Mufasa", 9));
        lionCage.addAnimal(new Lion("Nala", 4));

        System.out.println("Lions before sorting:");
        lionCage.printAnimals();

        lionCage.sortAnimals();
        System.out.println("\nLions after sorting by age:");
        lionCage.printAnimals();

        AnimalCage<Elephant> elephantCage = new AnimalCage<>();
        elephantCage.addAnimal(new Elephant("Dumbo", 6));
        elephantCage.addAnimal(new Elephant("Ella", 3));

        System.out.println("\nElephants before sorting:");
        elephantCage.printAnimals();

        elephantCage.sortAnimals();
        System.out.println("\nElephants after sorting by age:");
        elephantCage.printAnimals();
    }
}
