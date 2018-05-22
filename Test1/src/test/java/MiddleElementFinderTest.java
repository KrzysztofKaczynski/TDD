import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MiddleElementFinderTest {

    @Test
    public void shouldReturnNegativeOneWhenArrayEmpty() {
        int[] emptyArray = new int[0];
        assertEquals(-1, MiddleElementFinder.find(emptyArray));
    }

    @Test
    public void shouldReturnNegativeOneWhenArrayNull() {
        assertEquals(-1, MiddleElementFinder.find(null));
    }

    @Test
    public void shouldReturnElementWhenOnlyOneElement() {
        int[] oneElementArray = {123};
        assertEquals(123, MiddleElementFinder.find(oneElementArray));
    }

    @Test
    public void shouldReturnMiddleElementWhenOddArray() {
        int[] oddArray = {1, 2, 3, 4, 5};
        assertEquals(3, MiddleElementFinder.find(oddArray));
    }

    @Test
    public void shouldReturnMiddleElementWhenEvenArray() {
        int[] evenArray = {1, 2, 3, 4, 5, 6};
        assertEquals(3, MiddleElementFinder.find(evenArray));
    }

    @Test
    public void shouldReturnMiddleElementWhenUnsortedArray() {
        int[] unsortedArray = {4, 2, 5, 1, 3};
        assertEquals(3, MiddleElementFinder.find(unsortedArray));
    }

    @Test
    public void shouldReturnMiddleElementWhenNegativeValues() {
        int[] negativeValueArray = {-1, -2, -5, -1, -3};
        assertEquals(-2, MiddleElementFinder.find(negativeValueArray));
    }
}