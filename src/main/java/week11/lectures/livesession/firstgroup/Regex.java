package week11.lectures.livesession.firstgroup;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String string = "1";
        if(string.matches("11111{7,}")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }

    }
}
