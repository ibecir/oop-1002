package week8.lectures.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Slot<T> {
    private T key;

    public void setValue(T key) {
        this.key = key;
    }

    public T getValue() {
        return key;
    }

    public static void main(String[] args) {
        Slot<String> string = new Slot<String>();
        string.setValue(":)");

        System.out.println(string.getValue());

        List<String> strings = new ArrayList<String>();
        Map<String, String> keyCouples = new HashMap<String, String>();
    }
}
