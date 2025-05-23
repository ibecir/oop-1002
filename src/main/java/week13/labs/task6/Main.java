package week13.labs.task6;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document(true);
        doc.publish();
        doc.publish();

        Document doc2 = new Document(false);
        doc2.publish();
        doc2.publish();
    }
}
