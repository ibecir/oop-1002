package week11.lectures.livesession.lastgroup;

import java.util.Iterator;

class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0,8};
        EvenNumberIterator iterator = new EvenNumberIterator(a);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class EvenNumberIterator implements Iterator<Integer> {
    private int[] elements;
    private int index = 0;

    public EvenNumberIterator(int[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        if(this.index < this.elements.length && this.elements[this.index] % 2 != 0)
            this.index++;
        return this.index < this.elements.length;
    }

    @Override
    public Integer next() {
        return this.elements[this.index++];
    }
}
