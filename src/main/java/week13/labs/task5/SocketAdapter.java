package week13.labs.task5;

public class SocketAdapter implements EuropeanSocket {
    private USPlug usPlug;

    public SocketAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    public void provideElectricity() {
        usPlug.connectToUSOutlet();
    }
}
