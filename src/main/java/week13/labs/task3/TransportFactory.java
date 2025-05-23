package week13.labs.task3;

public class TransportFactory {
    public static Transport createTransport(String type) {
        if ("truck".equalsIgnoreCase(type)) {
            return new Truck();
        } else if ("ship".equalsIgnoreCase(type)) {
            return new Ship();
        }
        throw new IllegalArgumentException("Unknown transport type.");
    }
}
