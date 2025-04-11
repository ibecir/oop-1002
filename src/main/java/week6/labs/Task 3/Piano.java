public class Piano implements Playable {
    private String brand;

    public Piano(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void play() {
        System.out.println("Playing the piano!");
    }
}