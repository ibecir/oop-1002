package week4.lab;

import java.util.ArrayList;

public class Group {
    private ArrayList<Person> people;

    public Group() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void listPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public void removePerson(String name) {
        people.removeIf(person -> person.getName().equalsIgnoreCase(name));
    }
}
