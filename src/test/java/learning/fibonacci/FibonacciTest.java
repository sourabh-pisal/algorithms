package learning.fibonacci;

import org.junit.Test;

import static java.lang.System.currentTimeMillis;
import static learning.fibonacci.Fibonacci.fibRecursiveWithCache;
import static learning.fibonacci.Fibonacci.fibRecursiveWithoutCache;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    private static final int VALUE_TO_BE_CALCULATED = 45;
    private static final int EXPECTED = 1134903170;
    private static final int ILLEGAL_VALUE = -1;

    private static final String OUTPUT_MSG = "Time Taken By %s Is %d ms\n";

    @Test
    public void fibRecursivePositiveTest() {
        final long startTime = currentTimeMillis();
        int actual = fibRecursiveWithoutCache(VALUE_TO_BE_CALCULATED);
        long stopTime = currentTimeMillis() - startTime;

        assertEquals(EXPECTED, actual);
        System.out.format(OUTPUT_MSG, "fibRecursiveWithoutCache", stopTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibRecursiveNegativeTest() {
        fibRecursiveWithoutCache(ILLEGAL_VALUE);
    }

    @Test
    public void fibCacheRecursivePositiveTest() {
        final long startTime = currentTimeMillis();
        int actual = fibRecursiveWithCache(VALUE_TO_BE_CALCULATED);
        long stopTime = currentTimeMillis() - startTime;

        assertEquals(EXPECTED, actual);
        System.out.format(OUTPUT_MSG, "fibRecursiveWithCache", stopTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibCacheRecursiveNegativeTest() {
        fibRecursiveWithoutCache(ILLEGAL_VALUE);
    }
}