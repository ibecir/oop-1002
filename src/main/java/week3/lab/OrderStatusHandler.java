package week3.lab;

public class OrderStatusHandler {
    enum OrderStatus {
        PENDING, SHIPPED, DELIVERED, CANCELLED
    }

    public static void printOrderStatusMessage(OrderStatus status) {
        switch (status) {
            case PENDING:
                System.out.println("Your order is pending.");
                break;
            case SHIPPED:
                System.out.println("Your order has been shipped.");
                break;
            case DELIVERED:
                System.out.println("Your order has been delivered.");
                break;
            case CANCELLED:
                System.out.println("Your order was cancelled.");
                break;
        }
    }

    public static void main(String[] args) {
        printOrderStatusMessage(OrderStatus.SHIPPED);
    }
}