package week10.lectures.hashmaps;

import java.util.HashMap;
import java.util.Objects;

class StudentMap {
    public static void main(String[] args) {
        // Similar as the List<T >, it is using the templates (generics)
        // The diamond operator has to be used even as it is empty
        // because it is the legacy of older Java versions
        // (the types are inferred from the left-hand sand)
        HashMap<Integer, Student> students = new HashMap<>();

        students.put(123, new Student(123, 15, "Becir"));
        students.put(456, new Student(456, 13, "Mirza"));

        // It is not necessarily maintaining an order
        System.out.println(students);

        // Get the value by the key
        System.out.println(students.get(123));

        System.out.println(students.containsKey(123));
        System.out.println(students.containsKey(234));

        System.out.println(students.containsValue(new Student(456, 13, "Mirza")));
        System.out.println(students.containsValue(new Student(888, 13, "Mirza")));

        // Key is what is important, and if you redeclare it is going to override
        // the old value under that certain key
        students.put(456, new Student(666, 99, "Amila"));
        System.out.println(students);

        // replace() method will only replace the value under the key if the
        // key exists and neglect it otherwise, while the put will replace it
        // or add it if it does not exist
        students.replace(456, new Student(666, 99, "Becir"));

        // This value will not be added
        students.replace(999, new Student(666, 99, "Becir"));
        System.out.println(students);

        // The putIfAbsent is only used to insert into the map if the value
        // does not exist, it will not override the value if it exists in the map already
        students.putIfAbsent(9898, new Student(666, 99, "Becir"));
        System.out.println(students);

        students.remove(9898);
        System.out.println(students);

        for(Integer i : students.keySet()){
            System.out.println(students.get(i));
        }

        for(Student s : students.values()){
            System.out.println(s);
        }
    }
}

class Student {
    private final int id;
    private final String name;
    private final int age;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student class -> " + this.id + " " + this.name + " " + this.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.id == student.id && this.name.equals(student.name) && this.age == student.age;
        }
        return false;
    }
}

record StudentR(int id, String name, int age) {
}
