package week12.labs.task3;

import java.io.*;

public class SafeFileReader {

    public void printFirstLine(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }

    public void printLength(String input) {
        try {
            System.out.println("Length: " + input.length());
        } catch (NullPointerException e) {
            System.out.println("Input string is null.");
        }
    }

}