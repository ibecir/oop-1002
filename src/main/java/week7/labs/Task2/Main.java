package week7.labs.Task2;

public class Main {
    public static void main(String[] args) {
        Playable[] instruments = {
            new Guitar("Fender"),
            new Piano("Yamaha"),
            new Drum("Pearl")
        };

        for (Playable p : instruments) {
            p.play();
            if (p instanceof Guitar) {
                System.out.println(((Guitar)p).getBrand());
            } else if (p instanceof Piano) {
                System.out.println(((Piano)p).getBrand());
            } else if (p instanceof Drum) {
                System.out.println(((Drum)p).getBrand());
            }
        }
    }
}
