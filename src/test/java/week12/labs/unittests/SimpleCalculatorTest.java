package week12.labs.unittests;

import org.junit.jupiter.api.Test;
import week12.labs.task5.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testDivisionException() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(4, 0);
        });
    }
}