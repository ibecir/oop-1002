package week6.lectures.lecturematerials;

import java.util.ArrayList;
import java.util.Calendar;

class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private MyDate dateOfBirth;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.dateOfBirth = new MyDate(day, month, year);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public static void main(String[] args) {
        Person becir = new Person("Becir", 30);
        Person mirza = new Person("Mirza", 25);

        if (becir.getAge() > mirza.getAge()) {
            System.out.println(becir.getName() + " is older than " + mirza.getName());
        }
    }

    @Override
    public String toString() {
        return this.name + ", born " + this.dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void becomeOlder() {
        this.age = this.age + 1;
    }

    public void becomeOlder(int years) {
        this.age = this.age + years;
    }

    public boolean olderThan(Person comparedPerson) {
        if (this.age > comparedPerson.getAge()) {
            return true;
        }
        return false;
        // return this.age > comparedPerson.age;
    }
}

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.getYear())
            return true;

        if (this.year == compared.getYear() && this.month < compared.getMonth())
            return true;

        if (this.year == compared.getYear() && this.month == compared.getMonth() && this.day < compared.getDay())
            return true;

        return false;
    }
}

class ListOperations {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("Becir", 25, 7, 1994));
        personArrayList.add(new Person("Mirza", 1, 1, 2000));

        for (Person person : personArrayList) {
            System.out.println(person);
        }

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add 1
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Today is " + day + "." + month + "." + year);
    }
}

class FootballClub {
    private String name;
    private int yearOfFoundation;
    private ArrayList<Person> players;

    public FootballClub(String name, int yearOfFoundation) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.players = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public ArrayList<Person> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Person> players) {
        this.players = players;
    }

    private boolean isAcceptedAsPlayer(Person player) {
        return player.getAge() > 18;
    }

    public void addPlayer(Person player) {
        if (isAcceptedAsPlayer(player))
            this.players.add(player);
    }

    @Override
    public String toString() {
        String playersString = "";

        for (Person player : players) {
            playersString += player.toString() + "\n";
        }
        return playersString;
    }

    public Person oldestPlayer() {
        Person oldest = players.get(0);
        for (Person player : players) {
            if (oldest.getAge() > player.getAge()) {
                oldest = player;
            }
        }
        return oldest;
    }
}

class Counter {
    private int value;

    public Counter() {
        this(0);
    }

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void grow() {
        this.value++;
    }

    public String toString() {
        return "value: " + this.value;
    }

    public Counter clone() {
        // lets create a new counter object, that gets as its initial value
        // the value of the counter that is being cloned
        Counter clone = new Counter(this.value);

        // return the clone to the caller
        return clone;
    }
}

class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.author + ", " + this.title;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Book) {
            Book otherBook = (Book) obj;
            if (
                this.author.equals(otherBook.getAuthor()) &&
                this.title.equals(otherBook.getTitle())
            ) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Book book = new Book("J. K. Rowling", "Harry Potter and the Philosopher's Stone");
        Book book2 = new Book("J. K. Rowling", "Harry Potter and the Philosopher's Stone");;
        Book book3 = new Book("J. K. Rowling", "Harry Potter and the Philosopher's Stone");;

        if(book.equals(book2)) {
            System.out.println("The books are the same");
        } else {
            System.out.println("The books are not the same");
        }

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        if(books.contains(book3))
            System.out.println(book3);
    }
}