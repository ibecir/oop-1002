package week8.lectures.livesession;

enum MyTicketPrices {
    SINGLE_TICKET_ADULT(2.5),
    TRAM_TICKET_ADULT(2.5);

    MyTicketPrices(double value) {}
}

class TicketPrices {
    public static final double SINGLE_TICKET_ADULT = 2.50;
    public static final double TRAM_TICKET_ADULT = 2.50;

    public static double getSingleTicketAdult() {
        return TicketPrices.SINGLE_TICKET_ADULT;
    }
}

class MyPerson {
    private String name;
    private double money;

    // constructor
    public MyPerson(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }
    public double getMoney() {
        return this.money;
    }

    public void addMoney(double amount) {
        if(amount > 0) {
            this.money += amount;
        }
    }

    public boolean enoughMoneyForSingleTicket() {
        if(this.money >= TicketPrices.getSingleTicketAdult()) {
            return true;
        }
        return false;
    }
}

