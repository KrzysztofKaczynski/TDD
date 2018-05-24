import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParamsTest {
    private Calculator calculator;

    /**
     * // private int number;
     * //public CalculatorTestParams(int number){
     * //  this.number = number;
     * }
     * <p>
     * // @Parameterized.Parameters(name = "{index}: isOdd {0}")
     * //  public static Iterable<? extends Object> data(){
     * //     return Arrays.asList(-1, 1, 3, 5, 7, 9, 11);
     * }
     */
    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    @Parameters({"-1, 5, 4",
            "1, 12, 13",
            "3, 3, 6"})
    public void testAdd(int a, int b, int expected) {
        int result = calculator.add(a, b);
        assertEquals(expected, result);

    }
    @Test
    @Parameters({"-2, 3, -5",
            "22, 33, -11",
            "55, 66, -11"})
    public void testSubtract(int a, int b, int expected) {
        int result = calculator.subtract(a, b);
        assertEquals(expected, result);
    }
    @Test
    @Parameters({"4, 2, 2",
            "200, 100, 2",
            "36, 3, 12"})
    public void testDivide(int a, int b, int expected) {
        int result = calculator.divide(a, b);
        assertEquals(expected, result);
    }
    @Test
    @Parameters({"2, 4, 8",
            "3, 3, 9",
            "4, 4, 16"})
    public void testMultiply(int a, int b, int expected) {
        int result = calculator.multiply(a, b);
        assertEquals(expected, result);
    }
}

