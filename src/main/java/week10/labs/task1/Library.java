package week10.labs.task1;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> collection = new HashMap<>();

    public void addBook(Book book) {
        String key = clean(book.getTitle());
        collection.put(key, book);
    }

    public void removeBook(String title) {
        collection.remove(clean(title));
    }

    public Book findByTitleStart(String prefix) {
        prefix = clean(prefix);
        for (String key : collection.keySet()) {
            if (key.startsWith(prefix)) return collection.get(key);
        }
        return null;
    }

    private String clean(String input) {
        return input.toLowerCase().trim();
    }
}
