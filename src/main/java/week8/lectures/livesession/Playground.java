package week8.lectures.livesession;

class Person {
    public static final int myStaticConstant = 180;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public static String sayHelloToMe(){
        // return "Hello " + this.getName(); // Won't work
        return "";
    }

    public static String sayHello() {
        return "Hello!";
    }
}

class MainRun {
    public static void main(String[] args) {
        Person person = new Person("Becir");
        person.getName();

        Person.sayHello();

        int a = Person.myStaticConstant;

        // Person.myStaticConstant = 123; // Not allowed as the attribute is constant
        // Person.getName(); // Not allows
    }
}
