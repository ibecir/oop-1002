package week10.labs.task4;

public class ClubMember implements Comparable<ClubMember> {
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() { return name; }
    public int getHeight() { return height; }

    @Override
    public int compareTo(ClubMember other) {
        return Integer.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return name + " (" + height + " cm)";
    }
}
