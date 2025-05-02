package week10.labs.task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ClubMember> members = new ArrayList<>();
        members.add(new ClubMember("Mikael", 182));
        members.add(new ClubMember("Matti", 187));
        members.add(new ClubMember("Joel", 184));

        Collections.sort(members);
        for (ClubMember m : members) System.out.println(m);

        ClubMember search = new ClubMember("Any", 187);
        int idx = Collections.binarySearch(members, search);
        System.out.println("Found at index: " + idx);
    }
}