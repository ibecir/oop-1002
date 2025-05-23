package week12.lectures.livesession.secondgroup;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class FilesManipulation {
    public static void main(String[] args) throws IOException{
        fileManipulation();
    }

    public static void fileManipulation() throws IOException {
        String[] courses = {"OOP", "FP", "DS"};
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("becir.txt")
        );

        writer.write("Haris je munja\n");

        for (String course : courses)
            writer.write(course + "\n");

        writer.close();

        BufferedReader reader = new BufferedReader(
                new FileReader("becir.txt")
        );

        List<String> lines = reader.lines().collect(Collectors.toList());

        for (String line : lines)
            System.out.println(line);

        reader.close();
    }
}
