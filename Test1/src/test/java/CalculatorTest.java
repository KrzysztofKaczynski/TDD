
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {                          // Klasa testowa

    private Calculator calculator;                     // Testowany obiekt

    @Before                                            // metoda adnotowana @Before
    public void setup() {                              // zostanie wywołana przed każdym testem
        calculator = new Calculator();
    }

    @Test                                              // Metoda Testująca
    public void shouldAddTwoNumbers() {
        int result = calculator.add(2, 3);

        assertEquals(5, result);              // Asercja sprawdzająca poprawność działania
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        int result = calculator.subtract(12, 4);

        assertEquals(8, result);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        int result = calculator.multiply(12, 4);

        assertEquals(48, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        int result1 = calculator.divide(12, 4);
        int result2 = calculator.divide(13, 4);
        int result3 = calculator.divide(14, 4);

        assertEquals(3, result1);
        assertEquals(3, result2);
        assertEquals(3, result3);
    }
}

