package week6.lectures.livesessions.secondgroup;

class Person {
    private String name;
    private int age;
    private int height;
    private MyOwnCustomDate dateOfBirth;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age) {
        this(name, age, 175);
    }

    public Person (int height, String name) {
        this(name, 0, height);
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

    public boolean olderThen(Person comparedPerson) {
        return this.getAge() > comparedPerson.getAge();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", height: " + this.height;
    }
}

class MyOwnCustomDate {
    private int year;
    private int month;
    private int day;

    public MyOwnCustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean earlierThan(MyOwnCustomDate comparedDate) {
        if(this.getYear() < comparedDate.getYear())
            return true;
        else if (
                this.getYear() == comparedDate.getYear() &&
                this.getMonth() < comparedDate.getMonth()
        )
            return true;
        else if (
                this.getYear() == comparedDate.getYear() &&
                this.getMonth() == comparedDate.getMonth() &&
                this.getDay() < comparedDate.getDay()
        )
            return true;

        return false;
    }

    public int getDay() {
        return day;
    }
    public MyOwnCustomDate setDay(int day) {
        this.day = day;
        return this;
    }

    public int getMonth() {
        return month;
    }
    public MyOwnCustomDate setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getYear() {
        return year;
    }
    public MyOwnCustomDate setYear(int year) {
        this.year = year;
        return this;
    }
}

class MainRun {
    public static void main(String[] args) {
        Person becir = new Person("Becir", 31);
        Person merima = new Person("Merima", 20, 170);

        System.out.println(merima.toString());
    }
}
