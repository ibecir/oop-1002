package week13.labs.task6;

public class ModerationState implements DocumentState {
    public void publish(Document doc) {
        if (doc.isAdmin()) {
            System.out.println("Publishing document.");
            doc.setState(new PublishedState());
        } else {
            System.out.println("Only admin can publish the document.");
        }
    }
}
