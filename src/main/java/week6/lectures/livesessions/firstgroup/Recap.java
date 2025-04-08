package week6.lectures.livesessions.firstgroup;

import java.util.Calendar;

class Person {
    private String name;
    private int age;
    private int height;
    private MyCustomDate dateOfBirth;

    public Person(String name, int age){
        this(name, age, 170); // Which line of code, which method we are calling? Line 18
    }

    public Person(int height, String name) {
        this(name, 18, height); // Line 18
    }

    public Person(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
        this.dateOfBirth = new MyCustomDate(25, 7, 1994);
    }

    public void becomeOlder() {
        this.age += 1; // this.age++
    }

    public void becomeOlder(int years) {
        this.age += years;
    }

    public MyCustomDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Person setDateOfBirth(MyCustomDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Person setHeight(int height) {
        this.height = height;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public boolean olderThen(Person person) {
        return this.getAge() > person.getAge();
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", age: " + this.getAge();
    }
}

class MyCustomDate {
    private int day;
    private int month;
    private int year;

    public boolean earlier(MyCustomDate comparedDate) {
        if(this.getYear() < comparedDate.getYear())
            return false;
        else if (this.getMonth() < comparedDate.getMonth())
            return false;
        else if (this.getDay() < comparedDate.getDay())
            return false;

        return true;
    }

    public MyCustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public MyCustomDate setDay(int day) {
        this.day = day;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public MyCustomDate setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getYear() {
        return year;
    }

    public MyCustomDate setYear(int year) {
        this.year = year;
        return this;
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("Becir", 31);
        Person secondPerson = new Person("Enis", 20, 180);

        if(person.getAge() > secondPerson.getAge())
            System.out.println("The first person is older");

        if(person.olderThen(secondPerson))
            System.out.println("The first person is older");

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add 1
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Today is " + day + "." + month + "." + year );

        System.out.println(person);
    }
}
