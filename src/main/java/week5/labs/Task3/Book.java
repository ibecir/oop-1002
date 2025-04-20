package week5.labs.Task3;
public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String id, String title, int year, String author, String genre) {
        super(id, title, year);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + ", Author: " + author + ", Genre: " + genre;
    }
}