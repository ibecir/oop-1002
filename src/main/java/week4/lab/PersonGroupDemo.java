package week4.lab;

public class PersonGroupDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob", 25);

        System.out.println(p1);
        System.out.println(p2);

        p1.setAge(20);
        p1.increaseAge();
        p1.increaseAge();
        System.out.println(p1);

        System.out.println(p2.isAdult());
        p2.setAge(-5);

        Group group = new Group();
        group.addPerson(p1);
        group.addPerson(p2);
        group.addPerson(new Person("Charlie", 17));

        group.listPeople();

        group.removePerson("Bob");
        group.listPeople();
    }
}
