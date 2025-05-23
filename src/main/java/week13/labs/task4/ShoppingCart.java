package week13.labs.task4;

public class ShoppingCart {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        if (strategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            strategy.pay(amount);
        }
    }
}
