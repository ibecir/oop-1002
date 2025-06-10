package week15.lectures.livesessionv2;

class Service {
    private String name;
    private int baseFee;

    public int getBaseFee() {
        return baseFee;
    }
    public void setBaseFee(int baseFee) {
        this.baseFee = baseFee;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double calculateFee() {
        return 0.0;
    }

    public Service(String name, int baseFee) {
        this.name = name;
        this.baseFee = baseFee;
    }
}

class ConsultingService extends Service {
    private int hoursWorked;

    public ConsultingService(String name, int baseFee, int hoursWorked) {
        super(name, baseFee);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() * this.hoursWorked * 1.20;
    }
}

class StreamingService extends Service {
    private int subscriptionLength;

    public StreamingService(String name, int baseFee, int subscriptionLength) {
        super(name, baseFee);
        this.subscriptionLength = subscriptionLength;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() * this.subscriptionLength * 1.05;
    }
}


class RunMe {
    public static void main(String[] args) {
        StreamingService netflix = new StreamingService("Netflix", 9, 3);
        ConsultingService finances = new ConsultingService("Finances", 100, 1);

        System.out.println(netflix.calculateFee());
        System.out.println(finances.calculateFee());
    }
}