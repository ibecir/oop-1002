package week7.labs.Task2;

public class Drum implements Playable {
    private String brand;

    public Drum(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Beating the drum!");
    }

    public String getBrand() {
        return brand;
    }
}
