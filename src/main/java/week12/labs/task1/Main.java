package week12.labs.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        NoteManager manager = new NoteManager();
        manager.saveNote("This is a single note.");
        String[] notes = { "Note one", "Note two", "Note three" };
        manager.saveAllNotes(notes);
        manager.printAllNotes();
    }
}
