package week15.lectures.livesession;

import java.security.InvalidParameterException;

abstract class SubscriptionManager {
    abstract void renewSubscription(int months);
}

class OnlineSubscription extends SubscriptionManager {
    private int activeMonths;
    private String serviceName;

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.activeMonths = 0;
    }

    public int getActiveMonths() {
        return this.activeMonths;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    @Override
    public void renewSubscription(int months) {
        if(months <= 0 || months > 10)
            throw new InvalidParameterException("Months is not in valid range");
        this.activeMonths += months;
        System.out.println("Subscription for " + this.serviceName + " renewed for " + this.activeMonths + " months.");
    }
}

class MainRun {
    public static void main(String[] args) {
        OnlineSubscription netflix = new OnlineSubscription("Netflix");
        netflix.renewSubscription(8);
        netflix.renewSubscription(-5);
        System.out.println(netflix.getActiveMonths());
    }
}
