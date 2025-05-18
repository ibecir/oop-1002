package week12.labs.task1;

import java.io.*;

public class NoteManager {

    public void saveNote(String note) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt", true));
        writer.write(note);
        writer.newLine();
        writer.close();
    }

    public void saveAllNotes(String[] notes) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"));
        for (String note : notes) {
            writer.write(note);
            writer.newLine();
        }
        writer.close();
    }

    public void printAllNotes() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

}