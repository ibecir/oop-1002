package week8.lectures.generics;

class Animal {
    private int numOfLegs;

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void eat() {
        System.out.println("Animal Eating");
    }
}

class Dog extends Animal {
    private int name;

    public int getName() {
        return name;
    }

    public Dog setName(int name) {
        this.name = name;
        return this;
    }
}

class Cat extends Animal {
    private int name;

    public int getName() {
        return name;
    }

    public Cat setName(int name) {
        this.name = name;
        return this;
    }
}
