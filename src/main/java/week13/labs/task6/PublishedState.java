package week13.labs.task6;

public class PublishedState implements DocumentState {
    public void publish(Document doc) {
        System.out.println("Document is already published.");
    }
}
