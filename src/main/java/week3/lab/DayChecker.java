package week3.lab;

public class DayChecker {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static boolean isWeekend(Day day) {
        return day == Day.SATURDAY || day == Day.SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println("Is Saturday weekend? " + isWeekend(Day.SATURDAY));
        System.out.println("Is Monday weekend? " + isWeekend(Day.MONDAY));
    }
}