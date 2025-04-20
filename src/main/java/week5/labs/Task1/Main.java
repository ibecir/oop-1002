package week5.labs.Task1;
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student("Charlie", "charlie@uni.com", 2001, "S789", "Math");
        people[1] = new Professor("Dr. Eve", "eve@uni.com", 1980, "E789", "Physics");

        for (Person p : people) {
            System.out.println(p.getInfo());
        }
    }
}