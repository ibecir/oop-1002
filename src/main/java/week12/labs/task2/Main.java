public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        OddNumberIterator iterator = new OddNumberIterator(data);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}