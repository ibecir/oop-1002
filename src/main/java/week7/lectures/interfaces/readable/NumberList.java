package week7.lectures.interfaces.readable;

import java.util.ArrayList;

class NumberList implements Readable {
    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<Readable>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int howManyReadables() {
        return this.readables.size();
    }

    public String read() {
        String read = "";
        for (Readable readable : this.readables) {
            read += readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }

    public static void main(String[] args) {
        NumberList joelList = new NumberList();
        joelList.add(new SMS("matti", "have you already written the tests?"));
        joelList.add(new SMS("matti", "did you have a look at the submissions?"));

        System.out.println("Joel has " + joelList.howManyReadables() + " messages to read");
    }
}
