package week12.lectures.livesession;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.InvalidParameterException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            System.out.println(finallyExample());
            int a = Integer.parseInt(null);
            readData();
        } catch (FileNotFoundException e){
            System.out.println("Error happened in line 13 and its message is " + e.getMessage());
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Error happened in line 16 and its message is " + e.getMessage());
        } finally {
            System.out.println("I will be written");
        }
    }

    public static void readData() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(
                new FileReader("oop.txt")
        );
    }

    public static int finallyExample(){
        try {
            return 1;
        } catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }

}
