package week8.lectures.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ClubMember implements Comparable<ClubMember> {
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }
    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(ClubMember clubMember) {
        if (this.height == clubMember.getHeight()) {
            return 0;
        } else if (this.height > clubMember.getHeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Run {
    public static void main(String[] args) {
        List<ClubMember> clubMembers = new ArrayList<ClubMember>();
        clubMembers.add(new ClubMember("mikael", 182));
        clubMembers.add(new ClubMember("matti", 187));
        clubMembers.add(new ClubMember("joel", 184));

        System.out.println(clubMembers);
        Collections.sort(clubMembers);
        System.out.println(clubMembers);

        Collections.sort(clubMembers);

        ClubMember wanted = new ClubMember("Name", 180);
        int index = Collections.binarySearch(clubMembers, wanted);
        if (index >= 0) {
            System.out.println("A person who is 180 centimeters tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        }

        wanted = new ClubMember("Name", 187);
        index = Collections.binarySearch(clubMembers, wanted);
        if (index >= 0) {
            System.out.println("A person who is 187 centimeters tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        }
    }
}

