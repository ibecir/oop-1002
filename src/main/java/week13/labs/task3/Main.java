package week13.labs.task3;

public class Main {
    public static void main(String[] args) {
        Transport truck = TransportFactory.createTransport("truck");
        truck.deliver();

        Transport ship = TransportFactory.createTransport("ship");
        ship.deliver();
    }
}
