package week7.lectures.interfaces.items;

public class Book implements Item {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String getBarcode() {
        return "BOOK";
    }
}
