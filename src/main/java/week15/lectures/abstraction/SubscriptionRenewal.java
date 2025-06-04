package week15.lectures.abstraction;

// Abstract class
abstract class SubscriptionManager {
    abstract void renewSubscription(int months);
}

// Concrete class
class OnlineSubscription extends SubscriptionManager {
    private int activeMonths;
    private String serviceName;

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.activeMonths = 0;
    }

    public int getActiveMonths() {
        return activeMonths;
    }

    @Override
    void renewSubscription(int months) {
        activeMonths += months;
        System.out.println("Subscription for " + serviceName + " renewed for " + months + " months.");
    }
}
class Main {
    public static void main(String[] args) {
        OnlineSubscription netflix = new OnlineSubscription("Netflix");
        netflix.renewSubscription(3);  // Output: Subscription for Netflix renewed for 3 months.
        System.out.println("Active Months: " + netflix.getActiveMonths());  // Output: Active Months: 3
    }
}
