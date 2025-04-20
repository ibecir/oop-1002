package week5.labs.Task1;

public class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, String email, int birthYear, String studentId, String major) {
        super(name, email, birthYear);
        this.studentId = studentId;
        this.major = major;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Student ID: " + studentId + ", Major: " + major;
    }
}