package week5.labs.Task3;
public class LibraryItem {
    private String id;
    private String title;
    private int year;

    public LibraryItem(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getYear() { return year; }

    public String getSummary() {
        return "[" + id + "] " + title + " (" + year + ")";
    }
}