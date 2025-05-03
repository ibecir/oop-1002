package week11.lectures.livesession.lastgroup;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileManipulation {
    public static void main(String[] args) throws IOException {
        readFromFile();
    }

    public static void writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/becir/Desktop/ray.txt")
        );

        writer.write("Ray ray\n");
        writer.write("Satara 70%");
        writer.close();
    }

    public static void readFromFile() throws IOException {
        String line = "";
        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/becir/Desktop/ray.txt")
        );

        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }

    public static void readFromFileUsingLists() throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/becir/Desktop/ray.txt")
        );

        List<String> lines = reader.lines().collect(Collectors.toList());
        for(String line : lines){
            System.out.println(line);
        }
        reader.close();
    }
}
