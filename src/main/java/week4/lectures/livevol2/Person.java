package week4.lectures.livevol2;

class Person {
    private String fullName;
    private Gender gender;
    private int age;

    public boolean isAdult() {
        return this.age > 18;
    }

    public Person(
            String fullName,
            Gender gender,
            int age
    ){
        this.fullName = fullName;
        this.gender = gender;
        this.age = age;
    }

    public Person(
            String fullName,
            int age
    ){
        this.fullName = fullName;
        this.age = age;
    }

    public Person(
            int age,
            String fullName
    ){
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return this.fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if(age < 0 || age > 130)
            throw new IllegalArgumentException("Age must be between 0 and 130");
        this.age = age;
    }

    public void printPerson(){
        System.out.println();
    }

    public String toString() {
        return "Name is : " + this.fullName + ", age is: " + this.age + ", gender is: " + this.gender;
    }
}

class Main {
    public static void main(String[] args) {
        Person becir = new Person("Becir", Gender.MALE, 31);
        System.out.println(becir.getGender());
        Person hare = new Person("Haris Skeledzija", 19);
        System.out.println(hare.getAge());
        hare.setAge(20);

        becir.setAge(45);
        System.out.println(becir.getAge());
        System.out.println(becir);
    }
}

enum Gender {
    MALE, FEMALE
}
