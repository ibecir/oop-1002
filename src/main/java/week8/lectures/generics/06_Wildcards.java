package week8.lectures.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Wildcards {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        // printAnyList(stringList); // Won't work as List<String> is not a subtype of List<Object>
        List<String> stringsList = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();

        printAnyListWithWildcard(stringsList);
        printAnyListWithWildcard(doubles);
    }

    public static void printAnyList(List<Object> anyList) {
        System.out.println(anyList);
    }

    public static void printAnyListWithWildcard(List<?> anyList) {
        System.out.println(anyList);
    }

    public static void printAnyListBoundedWithWildcard(List<? extends Animal> anyList) {
        System.out.println(anyList);
    }
}
