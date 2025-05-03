package week11.lectures.livesession.firstgroup;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class Files {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/becir/Desktop/edina.txt")
        );

        writer.write("Becir\n");
        writer.write("Edina");
        writer.close();

        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/becir/Desktop/edina.txt")
        );

        List<String> wholeFile = reader.lines().collect(Collectors.toList());

        for(String line : wholeFile){
            System.out.println(line);
        }

        reader.close();
    }
}
