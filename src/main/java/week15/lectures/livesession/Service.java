package week15.lectures.livesession;

class Service {
    private String name;
    private int baseFee;

    public Service(String name, int baseService) {
        this.name = name;
        this.baseFee = baseService;
    }

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
}

class StreamingService extends Service {
    private int subscriptionLength;

    public StreamingService(String name, int baseService, int subscriptionLength) {
        super(name, baseService);
        this.subscriptionLength = subscriptionLength;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() * this.subscriptionLength * 1.05;
    }
}

class ConsultingService extends Service {
    private int hoursWorked;

    public ConsultingService(String name, int baseService, int hoursWorked) {
        super(name, baseService);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateFee() {
        return this.getBaseFee() * this.hoursWorked * 1.20;
    }
}

class MainIsRunning {
    public static void main(String[] args) {
        ConsultingService financeConsulting = new ConsultingService("Finances", 500, 3);
        StreamingService netflix = new StreamingService("Netflix", 9, 10);

        System.out.println(financeConsulting.calculateFee());
        System.out.println(netflix.calculateFee());
    }
}