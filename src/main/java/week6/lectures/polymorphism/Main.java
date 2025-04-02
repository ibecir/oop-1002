package week6.lectures.polymorphism;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        objectPolymorphism();

        List<String> words = new ArrayList<String>();
        words.add("polymorphism");
        words.add("inheritance");
        words.add("encapsulation");
        words.add("abstraction");

        printManyTimes("Becir", 5);
        printManyTimes(words, 5);

        printCharacters("Becir");
    }
    public static void objectPolymorphism() {
        String string = "string";
        Object string1 = "another string";

        // or

        String string2 = "characterString";
        Object string3 = string;

        /*
         Object string4 = "another string";
         String string5 = string4; // DOESN'T WORK as string4 is an Object
        */
    }
    public static void printManyTimes(Object object, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(object.toString());
        }
    }
    public static void polymorphicBehavior() {
        Serializable serializableString = new String("string");
        CharSequence charSequenceString = "string";
        Comparable<String> comparableString = "string";
    }
    public static void printCharacters(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            System.out.println(charSequence.charAt(i));
        }
    }
}
