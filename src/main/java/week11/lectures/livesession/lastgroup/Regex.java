package week11.lectures.livesession.lastgroup;

public class Regex {
    public static void main(String[] args) {
        String string = "You have accidentally the whole name";

        if(string.matches("You have accidentally(deleted )+ the whole name")) {
            System.out.println("The form is right.");
        } else {
            System.out.println("The form is wrong.");
        }
    }
}
