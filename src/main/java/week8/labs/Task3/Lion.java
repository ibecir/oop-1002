package week8.labs.Task1;

public class Lion extends Animal implements Comparable<Lion> {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println(getName() + " roars!");
    }

    @Override
    public int compareTo(Lion other) {
        return Integer.compare(this.getAge(), other.getAge());
    }
}