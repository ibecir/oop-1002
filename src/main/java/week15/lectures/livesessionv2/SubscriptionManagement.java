package week15.lectures.livesessionv2;

import java.security.InvalidParameterException;

abstract class SubscriptionManager {
    public abstract void renewSubscription(int months);
}

class OnlineSubscription extends SubscriptionManager {
    private int months;
    private String serviceName;

    public int getMonths() {
        return this.months;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.months = 0;
    }

    @Override
    public void renewSubscription(int months) {
        if(months < 0)
            throw new InvalidParameterException("Months is not in the valid range");

        this.months += months;
        System.out.println("Subscription for "+ this.serviceName +" renewed for "+ months +" months.");
    }
}

class MainRun {
    public static void main(String[] args) {
        OnlineSubscription netflix = new OnlineSubscription("Netflix");
        netflix.renewSubscription(5);

        // Polymorphic behavior
        SubscriptionManager manager = new OnlineSubscription("OOP");

        System.out.println(netflix.getMonths());
    }
}