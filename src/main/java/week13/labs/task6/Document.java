package week13.labs.task6;

public class Document {
    private DocumentState state;
    private boolean admin;

    public Document(boolean isAdmin) {
        this.admin = isAdmin;
        this.state = new DraftState();
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void publish() {
        state.publish(this);
    }
}
