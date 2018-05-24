import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

@RunWith(value = Parameterized.class)
public class Calculator2Test {
    private Calculator calculator;
    private int number;
    public Calculator2Test(int number){
        this.number = number;
    }

    @Parameterized.Parameters(name = "{index}: isOdd {0}")
    public static Iterable<? extends Object> data(){
        return Arrays.asList(-1, 1, 3, 5, 7, 9, 11);
    }

    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testIsOdd(){
        assertTrue(calculator.isOdd(number));
    }
}
