package week5.lectures.lecturesmaterials;

class Component {
    private String id;
    private String producer;
    private String description;

    public Component(String id, String producer, String description) {
        this.id = id;
        this.producer = producer;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getProducer() {
        return producer;
    }
}

class Motor extends Component {
    private String motorType;

    public Motor(String motorType, String id, String producer, String description) {
        super(id, producer, description);
        this.motorType = motorType;
    }

    public String getMotorType() {
        return motorType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  And my personal message again!";
    }
}

class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("combustion engine", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(motor.getMotorType());
        System.out.println(motor.getProducer());
        System.out.println(motor.toString());
    }
}


