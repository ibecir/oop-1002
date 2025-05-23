package week13.labs.task5;

public class Main {
    public static void main(String[] args) {
        USPlug usPlug = new USPlug();
        EuropeanSocket adapter = new SocketAdapter(usPlug);
        adapter.provideElectricity();
    }
}
