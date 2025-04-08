package week6.lectures.livesessions.firstgroup;

class Animal {
    private String name;

    public void makeSound() {
        System.out.println("I'm an animal");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null)
            return false;

        if(object instanceof Animal) {
            Animal animal = (Animal) object;
            if(this.getName().equals(animal.getName()))
                return true;
        }
        return false;
    }
}

class Elephant extends Animal {
    private boolean hasTusk;

    public Elephant(String name, boolean hasTusk) {
        super(name);
        this.hasTusk = hasTusk;
    }

    public boolean isHasTusk() {
        return hasTusk;
    }

    public Elephant setHasTusk(boolean hasTusk) {
        this.hasTusk = hasTusk;
        return this;
    }

    public void breakThings() {
        System.out.println("I will break something!");
    }
}
class Owl extends Animal {
    private double weight;

    public Owl(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public Owl setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public void makeSound() {
        System.out.println("Ouuuuu ouuu");
    }
}

class RunMain {
    public static void main(String[] args) {
        Animal myLittlePet = new Owl("Sovaaaa", 18.9);
        Owl sova = new Owl("Pigioto", 14.5);

        Elephant myBigPet = new Elephant("Slon", false);
        Elephant myBigPets = new Elephant("Slonic", false);

        // Owl myLittlePetVol2 = new Animal("Some animal"); // NOT ALLOWED!

        shoutYouAnimal(sova);
        shoutYouAnimalDowncast(myBigPet);

        System.out.println(myBigPet.equals(myBigPets));
    }

    public static void shoutYouAnimal(Animal animal) {
        animal.makeSound();
    }

    public static void shoutYouAnimalDowncast(Animal animal) {
        // animal.breakThings();
        if(animal instanceof Elephant) {
            Elephant elephant = (Elephant) animal;
            elephant.breakThings();
        }
    }
}