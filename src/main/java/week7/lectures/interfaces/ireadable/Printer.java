package week7.lectures.interfaces.ireadable;

import java.util.ArrayList;

public class Printer {
    public static void main(String[] args) {
        SMS message = new SMS("teacher", "Wow, this printer is able to print them, actually!");
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("{3, 5} are the numbers in common between {1, 3, 5} and {2, 3, 4, 5}.");

        EBook book = new EBook("Introduction to University Mathematics.", pages);

        Printer printer = new Printer();
        printer.print(message);
        printer.print(book);
    }

    public void print(Readable readable) {
        System.out.println(readable.read());
    }
}
