package week8.labs.Task1;

public class Main {
    public static void main(String[] args) {
        Locker<String> locker1 = new Locker<>(101, "Confidential Agreement");
        Locker<Double> locker2 = new Locker<>(202, 2500.75);

        locker1.viewItem();
        locker2.viewItem();

        locker1.unlock();
        locker2.unlock();

        locker1.viewItem();
        locker2.viewItem();

        locker1.lock();
        locker2.lock();
    }
}
