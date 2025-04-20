package week5.labs.Task3;
public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String id, String title, int year, String director, int duration) {
        super(id, title, year);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getSummary() {
        return super.getSummary() + ", Director: " + director + ", Duration: " + duration + " mins";
    }
}