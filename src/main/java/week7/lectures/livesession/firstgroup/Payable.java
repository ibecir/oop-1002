package week7.lectures.livesession.firstgroup;

import java.util.ArrayList;
import java.util.List;

interface Payable {
    boolean pay(double amount);
    // double currencyExchange(double amount);

    // Allowed but the usage is arguable!!!!!!!
    default String sayHelloYouUnusableMethod() {
        return "Hello, forget that you learned this!";
    }
}

class Paypal implements Payable {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paying with paypal");
        return true;
    }
}

class Stripe implements Payable {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paying with stripe");
        return true;
    }
}

class MainRun {
    public static void main(String[] args) {
        performPayment(new Stripe(), 12.3);
        performPayment(new Paypal(), 18.9);
        Payable payable = new Stripe();
        Payable payableSecond = new Paypal();

        List<Payable> payables = new ArrayList();
        payables.add(new Stripe());
        payables.add(new Paypal());
    }

    public static void performPayment(Payable payable, double amount) {
        payable.pay(amount);
    }
}