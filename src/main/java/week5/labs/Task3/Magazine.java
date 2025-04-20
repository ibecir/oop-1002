package week5.labs.Task3;
public class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;

    public Magazine(String id, String title, int year, int issueNumber, String month) {
        super(id, title, year);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + ", Issue: " + issueNumber + ", Month: " + month;
    }
}