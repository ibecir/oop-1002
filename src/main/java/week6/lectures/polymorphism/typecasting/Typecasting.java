package week6.lectures.polymorphism.typecasting;

class Animal {
    public static void eat() {
        System.out.println("Animal is eating");
    }
}

class Turtle extends Animal { }

class Tiger extends Animal {
    public static void eatMyLittleTiger() {
        System.out.println("My little tiger is eating");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        Tiger tiger = new Tiger();
        Turtle turtle = new Turtle();
        doSomeAnimalStuff(tiger);
        doSomeAnimalStuff(animal);

        doSomeAnimalStuffDowncasting(animal);
        doSomeAnimalStuffDowncasting(turtle);
    }

    public static void doSomeAnimalStuff(Animal animal) {
        animal.eat();
    }

    public static void doSomeAnimalStuffDowncasting(Animal animal) {
        if(animal instanceof Tiger) {
            Tiger myLocalTiger = (Tiger) animal;
            myLocalTiger.eatMyLittleTiger();
        }
    }
}
