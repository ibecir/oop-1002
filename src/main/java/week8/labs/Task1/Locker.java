package week8.labs.Task1;

public class Locker<T> {
    private int lockerNumber;
    private boolean isLocked;
    private T item;

    public Locker(int lockerNumber, T item) {
        this.lockerNumber = lockerNumber;
        this.item = item;
        this.isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void viewItem() {
        if (isLocked) {
            System.out.println("Locker " + lockerNumber + " is locked. Cannot view item.");
        } else {
            System.out.println("Locker " + lockerNumber + " contains: " + item);
        }
    }
}
