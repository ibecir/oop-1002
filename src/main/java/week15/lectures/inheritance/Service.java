package week15.lectures.inheritance;

// Base class
class Service {
    private String name;
    private int baseFee;

    public Service(String name, int baseFee) {
        this.name = name;
        this.baseFee = baseFee;
    }

    public String getName() {
        return name;
    }

    public int getBaseFee() {
        return baseFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseFee(int baseFee) {
        this.baseFee = baseFee;
    }

    public double calculateFee() {
        return 0.0;
    }
}

// Subclass for streaming service
class StreamingService extends Service {
    private int subscriptionLength;

    public StreamingService(String name, int baseFee, int subscriptionLength) {
        super(name, baseFee);
        this.subscriptionLength = subscriptionLength;
    }

    @Override
    public double calculateFee() {
        return getBaseFee() * subscriptionLength * 1.05;
    }
}

// Subclass for consulting service
class ConsultingService extends Service {
    private int hoursWorked;

    public ConsultingService(String name, int baseFee, int hoursWorked) {
        super(name, baseFee);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateFee() {
        return getBaseFee() * hoursWorked * 1.20;
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        StreamingService netflix = new StreamingService("Netflix", 10, 6);  // 6 months
        ConsultingService techConsult = new ConsultingService("TechAdvisor", 50, 8);  // 8 hours

        System.out.println(netflix.getName() + " Fee: $" + netflix.calculateFee());  // Should show base × 6 × 1.05
        System.out.println(techConsult.getName() + " Fee: $" + techConsult.calculateFee());  // Should show base × 8 × 1.20
    }
}

