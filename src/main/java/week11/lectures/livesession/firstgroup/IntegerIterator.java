package week11.lectures.livesession.firstgroup;

import java.util.Iterator;
import java.util.NoSuchElementException;

class OddNumbersIterator implements Iterator<Integer> {
    public static void main(String[] args) {
        int[] elements = {1,2,3,4,5,6,7,8,9};
        OddNumbersIterator iterator = new OddNumbersIterator(elements);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private int[] values;
    private int index = 0;

    public OddNumbersIterator(int[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        // It is not an odd integer
        if(this.index < this.values.length && this.values[this.index] % 2 == 0)
            this.index++;
        return this.index < this.values.length;
    }

    @Override
    public Integer next() {
        if(!this.hasNext())
            throw new NoSuchElementException();
        return this.values[this.index++];
    }
}
