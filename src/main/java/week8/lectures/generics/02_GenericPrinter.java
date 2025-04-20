package week8.lectures.generics;

// T can be any letter or even a word, although
// we should follow the convention
class GenericPrinter<T> {
    T thingToPrint; // Totally unaware what T will become

    // Generic type, anything we want
    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}
