package week10.lectures.livesession.firstgroup;

import java.util.HashMap;

public class Playground {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Becir");
        map.put(2, "Anel");

        System.out.println(map);

        map.put(2, "Enis");
        System.out.println(map);

        map.replace(2, "Anel");
        System.out.println(map);

        map.putIfAbsent(3, "Anel");
        System.out.println(map);

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
