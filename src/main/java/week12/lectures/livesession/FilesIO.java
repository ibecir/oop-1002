package week12.lectures.livesession;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilesIO {
    public static void main(String[] args) throws IOException {
        String[] names = {"Becir", "Fadil", "Mirzoni"};

        BufferedWriter writer = new BufferedWriter(
                new FileWriter("oop.txt")
        );

        writer.write("Hello from my file!\n");

        for (String name : names)
            writer.write(name + "\n");

        writer.close(); // YOU HAVE TO DO THIS!!!

        BufferedReader reader = new BufferedReader(
                new FileReader("oop.txt")
        );

        /*
        String temp;
        while ((temp = reader.readLine()) != null)
            System.out.println(temp);
        */

        List<String> lines = reader.lines().collect(Collectors.toList());
        for (String line : lines)
            System.out.println(line);
    }
}
