package week13.lectures.adapter;

interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}

class Volt {
    private int volts;

    public Volt(int v) {
        this.volts = v;
    }

    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}

class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}

class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    // Does not have to extend Socket class, it can also use the Java composition
    // Using Composition for adapter pattern
//     private Socket sock = new Socket();
    @Override
    public Volt get120Volt() {
        // Or with Java composition
        // return sock.getVolt();
        return this.getVolt();
    }

    @Override
    public Volt get12Volt() {
        // Or with Java composition
        // Volt v = sock.getVolt();
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        // Or with Java composition
        // Volt v = sock.getVolt();
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}

class AdapterPatternTest {
    public static void main(String[] args) {
        testClassAdapter();
    }
    private static void testClassAdapter() {
        SocketAdapter sockAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(sockAdapter,3);
        Volt v12 = getVolt(sockAdapter,12);
        Volt v120 = getVolt(sockAdapter,120);
        System.out.println("v3 volts using Class Adapter="+v3.getVolts());
        System.out.println("v12 volts using Class Adapter="+v12.getVolts());
        System.out.println("v120 volts using Class Adapter="+v120.getVolts());
    }
    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i){
            case 3: return sockAdapter.get3Volt();
            case 12: return sockAdapter.get12Volt();
            case 120: return sockAdapter.get120Volt();
            default: return sockAdapter.get120Volt();
        }
    }
}
