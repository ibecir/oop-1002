package week6.lectures.polymorphism.readable;

import java.util.ArrayList;

public class ReadableExample {
    public static void main(String[] args) {
        SMS sms = new SMS("Becir", "Hello guys!");
        System.out.println(sms.read());

        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("NA", "I'm learning OOP!"));

        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints.", pages);
        for (int page = 0; page < book.numOfPages(); page++) {
            System.out.println(book.read());
        }

        ArrayList<Readable> numberList = new ArrayList<>();
        numberList.add(new SMS("teacher", "never been programming before..."));
        numberList.add(new SMS("teacher", "gonna love it i think!"));
        numberList.add(new SMS("teacher", "give me something more challenging! :)"));
        numberList.add(new SMS("teacher", "you think i can do it?"));
        numberList.add(new SMS("teacher", "up here we send several messages each day"));

        ArrayList<String> bookPages = new ArrayList<>();
        bookPages.add("this is the first page");
        bookPages.add("this is the second page");

        numberList.add(new EBook("name", bookPages));

        for (Readable readable : numberList)
            System.out.println(readable.read());
    }
}




