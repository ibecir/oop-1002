package week7.lectures.madeupinterfaces;

import java.util.*;

public class MadeupInterfaces {
    public static void main(String[] args) {
        listOperations();
        mapOperations();
        setOperations();
        collectionOperations();
    }

    public static void listOperations() {
        List<String> names = new LinkedList<String>();
        names.add("Becir");

        List<String> names2 = new ArrayList<String>();
        names2.add("Mirza");
    }
    public static void mapOperations() {
        Map<String, String> translations = new HashMap<String, String>();
        translations.put("gambatte", "good luck");
        translations.put("hai", "yes");

        for(String key: translations.keySet()) {
            System.out.println(key + ": " + translations.get(key));
        }
    }
    public static void setOperations() {
        Set<String> set = new HashSet<String>();
        set.add("Becir");
        set.add("Mirza");
        set.add("Amila");

        for (String key : set) {
            System.out.println(key);
        }
    }
    public static void collectionOperations() {
        Map<String, String> translations = new HashMap<String, String>();
        translations.put("gambatte", "good luck");
        translations.put("hai", "yes");

        Map<Integer, String> translationsVol2 = new HashMap<Integer, String>();
        translationsVol2.put(1, "good luck");
        translationsVol2.put(2, "yes");

        Set<String> keys = translations.keySet();
        Collection<String> keySet = keys;

        System.out.println("Keys:");
        for(String key: keySet) {
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values:");
        Collection<String> values = translations.values();
        for(String value: values) {
            System.out.println(value);
        }
    }
}
