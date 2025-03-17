package week3.lectures.livesession;

import java.util.*;

public class LiveSession {
    public static void main(String[] args) {
        Integer iObj = 15;
        Double dObj = 15.0;
        Float dFloat = 15.0F;
        Long dLong = 15L;
        Character dChar = 'A';
        Boolean dBool = true;

        Scanner scanner = new Scanner(System.in);

        String courseName = "OOP";
        String rightWay = new String("OOP");

        List<String> students = new ArrayList<>();
        ArrayList<String> studentsLegit = new ArrayList<>();
        // List<String> studentVol2 = new List<>(); // This is not allowed

        students.add("Becir");
        students.add("Emina");
        students.add("Ahmed");

        Collections.sort(students);
        Collections.reverse(students);

        students.remove(1);

        students.remove("Becir");

        for (String student : students) {
            System.out.println(student);
        }

        ArrayList<Integer> ints = new ArrayList<>();
        Collections.addAll(ints,4,5,1,2,3,4);
        ints.remove(Integer.valueOf(4));
        ints.remove(4);
        for (Integer number : ints) {
            System.out.println(number);
        }

        Student student = new Student("Becir Isakovic", 1994, Gender.FEMALE);
        System.out.println(Math.PI);
        System.out.println(Gender.MALE);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ahmed Our Brother", 2004,Gender.MALE));
        studentList.add(student);

        for (Student studentEntry : studentList) {
            System.out.println(studentEntry.fullName);
        }

        Random random = new Random();
        System.out.println(random.nextDouble());
        System.out.println(random.nextGaussian());

    }

    public static ArrayList<Integer> getIntegerArrayList() {
        ArrayList<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 1,2,3,4,5);
        return ints;
    }

    public static void printList(ArrayList<String> list) {
        for (String entry : list)
            System.out.println(entry);
    }
}
