package week13.labs.task6;

public class DraftState implements DocumentState {
    public void publish(Document doc) {
        System.out.println("Moving document to moderation.");
        doc.setState(new ModerationState());
    }
}
