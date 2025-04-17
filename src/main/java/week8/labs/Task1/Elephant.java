package week8.labs.Task1;

public class Elephant extends Animal implements Comparable<Elephant> {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " trumpets!");
    }

    @Override
    public int compareTo(Elephant other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}
