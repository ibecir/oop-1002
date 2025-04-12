package week7.lectures.lecturematerials.abstracclass;

// In Java, you can extend only a single class
abstract class Animal {
    private String name;
    private int age;

    public abstract String makeNoise();

    public void sayYourName() {
        System.out.println("My name is " + this.getName());
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public Animal setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }
    public Animal setName(String name) {
        this.name = name;
        return this;
    }
}

class Cat extends Animal {
    private int furType;

    public Cat(int age, String name, int furType) {
        super(age, name);
        this.furType = furType;
    }

    public int getFurType() {
        return furType;
    }
    public Cat setFurType(int furType) {
        this.furType = furType;
        return this;
    }

    @Override
    public String makeNoise() {
        return "";
    }
}
