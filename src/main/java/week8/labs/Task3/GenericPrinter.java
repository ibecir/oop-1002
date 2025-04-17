package week8.labs.Task3;

public class GenericPrinter {
    public static <T, E> E printAndReturn(T input, E output) {
        System.out.println("Input: " + input);
        return output;
    }

    public static void main(String[] args) {
        String result = printAndReturn(100, "Returned Value");
        System.out.println("Output: " + result);
    }
}

