package week15.lectures.generics;

import java.util.ArrayList;
import java.util.List;

// Base class
class Publication {
    private int isbn;
    private String title;

    public Publication(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }
}

// Subclass 1
class Book extends Publication {
    public Book(int isbn, String title) {
        super(isbn, title);
    }
}

// Subclass 2
class Magazine extends Publication {
    public Magazine(int isbn, String title) {
        super(isbn, title);
    }
}

// Generic Library class
class Library<T extends Publication> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> filterByTitle(String title) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                result.add(item);
            }
        }
        return result;
    }

    public T getByIsbn(int isbn) {
        for (T item : items) {
            if (item.getIsbn() == isbn) {
                return item;
            }
        }
        return null;
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        Library<Publication> library = new Library<>();
        library.addItem(new Book(123, "Java Programming"));
        library.addItem(new Magazine(456, "Tech Monthly"));
        library.addItem(new Book(789, "Java Programming"));

        List<Publication> filtered = library.filterByTitle("Java Programming");
        System.out.println("Filtered Publications:");
        for (Publication p : filtered) {
            System.out.println("- " + p.getTitle() + " (ISBN: " + p.getIsbn() + ")");
        }

        Publication found = library.getByIsbn(456);
        if (found != null) {
            System.out.println("Found Publication: " + found.getTitle() + " (ISBN: " + found.getIsbn() + ")");
        }
    }
}

