package week7.labs.Task2;

public class Guitar implements Playable {
    private String brand;

    public Guitar(String brand) {
        this.brand = brand;
    }

    public void play() {
        System.out.println("Strumming the guitar!");
    }

    public String getBrand() {
        return brand;
    }
}
