public class Main {
    public static void main(String[] args) {
        Playable[] instruments = new Playable[] {
            new Guitar("Fender"),
            new Piano("Yamaha"),
            new Drum("Pearl")
        };

        for (Playable p : instruments) {
            p.play();
            if (p instanceof Guitar) {
                System.out.println("Brand: " + ((Guitar) p).getBrand());
            } else if (p instanceof Piano) {
                System.out.println("Brand: " + ((Piano) p).getBrand());
            } else if (p instanceof Drum) {
                System.out.println("Brand: " + ((Drum) p).getBrand());
            }
        }
    }
}