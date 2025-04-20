package week7.labs.Task2;

public class Piano implements Playable {
    private String brand;

    public Piano(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Playing the piano!");
    }

    public String getBrand() {
        return brand;
    }
}
