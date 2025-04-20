package week5.labs.Task3;
public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B002", "Advanced Java", 2023, "Author B", "Programming");
        items[1] = new DVD("D002", "Science Doc", 2019, "Director C", 90);
        items[2] = new Magazine("M002", "Nature World", 2024, 7, "July");

        for (LibraryItem item : items) {
            System.out.println(item.getSummary());
        }
    }
}