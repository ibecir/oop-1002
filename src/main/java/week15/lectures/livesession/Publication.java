package week15.lectures.livesession;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Publication {
    private int isbn;
    private String title;

    public Publication (int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getIsbn() {
        return this.isbn;
    }
}

class Book extends Publication {
    public Book(int isbn, String title) {
        super(isbn, title);
    }
}

class Magazine extends Publication {
    public Magazine(int isbn, String title) {
        super(isbn, title);
    }
}

class Library<T extends Publication> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public List<T> filterByTitle(String title) {
        List<T> response = new ArrayList<>();
        for (T item : this.items) {
            if(item.getTitle().equalsIgnoreCase(title))
                response.add(item);
        }
        return response;
    }

    public Optional<T> filterByIsbn (int isbn) {
        for (T item : this.items) {
            if(item.getIsbn() == isbn)
                return Optional.of(item);
        }
        return Optional.empty();
    }
}

class RunTheMain {
    public static void main(String[] args) {
        Library l = new Library();
        l.addItem(new Book(1234, "Na Drini cuprija"));
        l.addItem(new Book(2345, "Tvrdjava"));
        l.addItem(new Book(9999, "Tvrdjava"));
        l.addItem(new Magazine(3456, "5 plus"));

        Optional<Publication> p = l.filterByIsbn(1234);
        if(p.isPresent())
            System.out.println(p.get().getTitle());

        List<Publication> books = l.filterByTitle("tvrdjava");
        for (Publication publication : books) {
            System.out.println(publication.getTitle() + " - " + publication.getIsbn());
        }
    }
}
