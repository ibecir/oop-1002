package week12.labs.task3;

public class Main {
    public static void main(String[] args) {
        SafeFileReader reader = new SafeFileReader();
        reader.printFirstLine("notes.txt");
        reader.printLength(null);
    }
}
