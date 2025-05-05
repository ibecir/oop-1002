package week10.lectures.livesession.firstgroup;

import week4.lab.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Student) {
            Student student = (Student) object;
            if(this.name.equals(student.getName()) && this.age == student.getAge())
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    public static void main(String[] args) {
        Student student = new Student("Anel", 20);
        Student studentTwo = new Student("Anel", 20);
        System.out.println(student.equals(studentTwo));

        StudentR studentR = new StudentR("Anel", 20);
        StudentR studentTwoR = new StudentR("Anelss", 20);
        System.out.println(studentR.equals(studentTwoR));
        System.out.println(studentR);
    }
}

record StudentR(String name, int age){
    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    @Override
    public boolean equals(Object object) {
        if(object instanceof Student) {
            StudentR student = (StudentR) object;
            if(this.name.equals(student.name()) && this.age == student.age())
                return true;
        }
        return false;
    }
}

class MainRunR {
    public static void main(String[] args) {
        Optional<StudentR> studentR = Optional.empty();
        if(studentR.isPresent())
            studentR.get().name();

        Optional<StudentR> optionalStudentR = getStudentByName("Becir");
        if(optionalStudentR.isPresent())
            System.out.println(optionalStudentR.get().name());
    }

    public static Optional<StudentR> getStudentByName(String name) {
        List<StudentR> students = Arrays.asList(
                new StudentR("Anel", 20),
                new StudentR("Fadil", 20)
        );

        for (StudentR studentR : students) {
            if(studentR.name().equals(name))
                return Optional.of(studentR);
        }
        return Optional.empty();
    }
}
