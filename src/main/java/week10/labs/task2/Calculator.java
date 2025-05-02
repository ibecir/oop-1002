package week10.labs.task2;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static int calculate(int a, int b, Operation op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation mul = (x, y) -> x * y;
        Operation div = (x, y) -> x / y;

        System.out.println("Add: " + calculate(6, 3, add));
        System.out.println("Sub: " + calculate(6, 3, sub));

        Map<String, Operation> operations = new HashMap<>();
        operations.put("add", add);
        operations.put("multiply", mul);

        System.out.println("Mapped multiply: " + operations.get("multiply").apply(4, 2));
    }
}