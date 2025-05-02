package week10.labs.task1;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("  The Hobbit ", "J.R.R. Tolkien", 1937));
        lib.addBook(new Book("1984", "George Orwell", 1949));

        Book found = lib.findByTitleStart("the");
        System.out.println(found);

        lib.removeBook("1984");
    }
}