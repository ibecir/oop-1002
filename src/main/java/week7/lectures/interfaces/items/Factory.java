package week7.lectures.interfaces.items;

import java.util.Random;

public class Factory {

    public static void main(String[] args) {
        Factory factory = new Factory();
    }

    public Item produceNew(){
        Random random = new Random();
        int num = random.nextInt(4);
        if ( num==0 ) {
            return new CD("Pink Floyd", 1973);
        } else if ( num==1 ) {
            return new CD("Wigwam", 1975);
        } else if ( num==2 ) {
            return new Book("Robert Martin", 1 );
        } else {
            return new Book("Kent Beck", 182);
        }
    }
}
