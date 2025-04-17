package week7.lectures.livesession.secondgroup;

interface Payable {
    boolean pay(double amount);

    String createCard(String cardDetails);
}

interface Secureable {
    boolean areYouSecure();
}

class Stripe implements Payable, Secureable {
    @Override
    public boolean pay(double amount) {
        System.out.println("Performing a Stripe payment");
        return false;
    }

    @Override
    public String createCard(String cardDetails) {
        return "STRIPE CARD: 000012030201300";
    }

    @Override
    public boolean areYouSecure() {
        return false;
    }
}

class Paypal implements Payable {
    @Override
    public boolean pay(double amount) {
        System.out.println("Performing a PAYPAL payment");
        return false;
    }

    @Override
    public String createCard(String cardDetails) {
        return "PAYPAL CARD: 000012030201300";
    }
}

class Cache implements Payable {
    @Override
    public boolean pay(double amount) {
        System.out.println("Performing a PAYPAL payment");
        return false;
    }

    @Override
    public String createCard(String cardDetails) {
        return "PAYPAL CARD: 000012030201300";
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Payable payable = new Stripe();
        Stripe payable2 = new Stripe();

        // Nejla's payment
        makePayment(400, new Stripe());

        // Haris's payment
        makePayment(1000, new Paypal());

        // Haris's payment
        makePayment(40, new Cache());
    }

    public static void makePayment(int amount, Payable payable) {
        payable.pay(amount);
    }
}
