package week15.lectures.livesessionv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

class Magazine extends Publication {
    public Magazine(int isbn, String title) {
        super(isbn, title);
    }
}

class Book extends Publication {
    public Book(int isbn, String title) {
        super(isbn, title);
    }
}

class Library<T extends Publication> {
    private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addToLibrary(T item) {
        this.items.add(item);
    }

    public List<T> filterByTitle(String title) {
        List<T> results = new ArrayList<>();
        for (T item : this.items){
            if(item.getTitle().toLowerCase().contains(title.toLowerCase()))
                results.add(item);
        }
        return results;
    }

    Optional<T> getByIsbn(int isbn) {
        for (T item : this.items){
            if(item.getIsbn() == isbn)
                return Optional.of(item);
        }
        return Optional.empty();
    }
}

class RunMePlease {
    public static void main(String[] args) {
        Library library = new Library();
        library.addToLibrary(new Magazine(1234, "5 plus"));
        library.addToLibrary(new Book(2345, "Dervis i smrt"));
        library.addToLibrary(new Book(2345, "Dervis i zivot"));
        library.addToLibrary(new Book(2345, "Tvrdjava"));

        List<Publication> publications = library.filterByTitle("dervis");
        for (Publication p : publications)
            System.out.println(p.getTitle());

        Optional<Publication> publication = library.getByIsbn(12346666);
        if(publication.isPresent())
            System.out.println(publication.get().getTitle());
    }
}
