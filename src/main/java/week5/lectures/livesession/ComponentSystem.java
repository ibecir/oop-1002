package week5.lectures.livesession;

// A base, super or parent class
class Component {
    private int serialNo;
    private String producer;
    private String description;

    public Component() {}

    public Component(int serialNo, String producer, String description) {
        this.serialNo = serialNo;
        this.producer = producer;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Component setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getProducer() {
        return producer;
    }

    public Component setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public Component setSerialNo(int serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    public void sayWhoYouAre() {
        System.out.println("I'm some kind of a component");
    }

    @Override
    public String toString() {
        return "Serial No: " + this.serialNo + ", producer: " + this.producer + ", description: " + this.description;
    }
}

enum MyFuelType {
    PETROL, ELECTRIC, DIESEL
}

// Child, subclass, or a derived class
class MyEngine extends Component{
    private MyFuelType fuelType;

    public MyEngine(int serialNo, String producer, String description, MyFuelType fuelType) {
        super(serialNo, producer, description); // Call a parent class constructor
        this.fuelType = fuelType;
    }

    public MyFuelType getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(MyFuelType fuelType) {
        this.fuelType = fuelType;
    }
}

enum MyGearboxType {
    MANUAL, AUTOMATIC
}

// Child, subclass, or a derived class
class MyGearBox extends Component {
    private MyGearboxType gearboxType;

    public MyGearBox(int serialNo, String producer, String description, MyGearboxType gearboxType) {
        // Instead of setting individual values, we will use a super class constructor
        // this.setSerialNo(serialNo);
        // this.setProducer(producer);
        // this.setDescription(description);
        super(serialNo, producer, description); // Call a parent class constructor
        this.gearboxType = gearboxType;
    }

    public MyGearboxType getGearboxType() {
        return gearboxType;
    }

    public MyGearBox setGearboxType(MyGearboxType gearboxType) {
        this.gearboxType = gearboxType;
        return this;
    }

    @Override
    public void sayWhoYouAre() {
        super.sayWhoYouAre();
        System.out.println("I'm the Gearbox");
    }

    @Override
    public String toString() {
        return super.toString() + ", gearbox type: " + this.gearboxType;
    }
}

class MyStart {
    public static void main(String[] args) {
        MyGearBox gearBox = new MyGearBox(123, "BMW", "Good gearbox", MyGearboxType.AUTOMATIC);
        MyEngine engin = new MyEngine(123, "VW", "Good engine", MyFuelType.DIESEL);

        System.out.println(gearBox.getProducer());

        // TOTALLY WRONG! super keyword can only be used in the inheritance spirit
        // gearBox.super.sayWhoYouAre();
        gearBox.sayWhoYouAre();
        System.out.println(engin);
    }
}
