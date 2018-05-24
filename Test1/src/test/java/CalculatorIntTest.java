import org.junit.Before;
import org.junit.Test;

public class CalculatorIntTest {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test

            (expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExcep() {
        calculator.divideJ(2, 0);
    }

}
