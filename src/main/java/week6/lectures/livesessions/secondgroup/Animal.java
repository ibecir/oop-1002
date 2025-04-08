package week6.lectures.livesessions.secondgroup;

class Animal {
    private String name;

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

    public void shout() {
        System.out.println("I'm an animal");
    }

    @Override
    public boolean equals(Object object) {
        if(object == null)
            return false;

        if(object instanceof Animal) {
            Animal animal = (Animal) object;
            return this.getName().equals(animal.getName());
        }

        return false;
    }
}

class Turtle extends Animal {
    private int shellStrength;

    public Turtle(String name, int shellStrength) {
        super(name);
        this.shellStrength = shellStrength;
    }

    public int getShellStrength() {
        return shellStrength;
    }
    public Turtle setShellStrength(int shellStrength) {
        this.shellStrength = shellStrength;
        return this;
    }

    @Override
    public void shout() {
        System.out.println("Trrrr");
    }
}
class Horse extends Animal {
    private double hp;

    public Horse(String name, double hp){
        super(name);
        this.hp = hp;
    }

    public double getHp() {
        return hp;
    }
    public Horse setHp(double hp) {
        this.hp = hp;
        return this;
    }

    public void rideMe() {
        System.out.println("You can ride a horse!");
    }
}

class MyMain {
    public static void main(String[] args) {
        Turtle turtle = new Turtle("My turtle", 9);

        Animal same = new Animal("My turtle vol 2");
        Animal notsame = new Animal("My turtle vol 3");

        System.out.println(same.equals(notsame));

        Horse horse = new Horse("My turtle vol 2", 120);

        // Will not work!
        // Turtle kornjacica = new Animal("Kornjacaaaaaaa");

        Object obj = new String();

        shoutMyLittleAnimal(turtle);
        shoutMyLittleAnimal(same);
        shoutMyLittleAnimal(horse);

        int a = (int)3.15; // typecasting
    }

    public static void shoutMyLittleAnimal(Animal animal) {
        animal.shout();

        if(animal != null) {
            if(animal instanceof Horse) {
                Horse horse = (Horse) animal;
                horse.rideMe();
            }
        }
    }
}
