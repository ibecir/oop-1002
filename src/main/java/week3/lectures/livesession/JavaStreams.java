package week3.lectures.livesession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreams {
    private ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        JavaStreams js = new JavaStreams();
        Optional<Student> student = js.getStudentByAgeGt(15);
        if(student.isPresent())
            System.out.println(student.get().fullName);
        else
            System.out.println("I'm empty!");

        List<Student> studentsFiltered = js.getStudentsByGender(Gender.FEMALE);
        for (Student s : studentsFiltered){
            System.out.println(s.fullName);
        }
    }

    public JavaStreams() {
        Collections.addAll(
                students,
                new Student("Emina", 2006, Gender.FEMALE),
                new Student("Becir", 1994, Gender.MALE),
                new Student("Faris", 2005, Gender.MALE)
        );
    }

    public Optional<Student> getStudentByAgeGt(int age) {
        return students.
                stream().
                filter(student -> student.getAge() > age).
                findFirst();
    }

    public List<Student> getStudentsByGender (Gender gender) {
        return students.
                stream().
                filter(student -> student.gender.equals(gender)).
                collect(Collectors.toList());
    }
}
