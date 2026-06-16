package test;

import com.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(8, Calculator.calculate(5, 3, "+"));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, Calculator.calculate(5, 3, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, Calculator.calculate(5, 3, "×"));
    }

    @Test
    void testDivision() {
        assertEquals(2, Calculator.calculate(6, 3, "÷"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> Calculator.calculate(5, 0, "÷")
        );
    }
}