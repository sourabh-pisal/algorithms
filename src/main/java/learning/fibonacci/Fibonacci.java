package learning.fibonacci;

import java.util.HashMap;
import java.util.Map;

class Fibonacci {

    private static final String INPUT_ERR_MSG = "The Input Value Must Be Greater Than Or Equal To Zero";

    static int fibRecursiveWithoutCache(int n) {
        validateInput(n);

        if (n <= 1) {
            return n;
        }

        return fibRecursiveWithoutCache(n - 1) + fibRecursiveWithoutCache(n - 2);
    }

    static int fibRecursiveWithCache(int n) {
        validateInput(n);

        final Map<Integer, Integer> fibCache = new HashMap<>();
        fibCache.put(0, 0);
        fibCache.put(1, 1);

        return recursiveCachedFibN(fibCache, n);
    }

    private static int recursiveCachedFibN(Map<Integer, Integer> fibCache, int n) {

        Integer value = fibCache.get(n);

        if (value != null) {
            return value;
        }

        value = recursiveCachedFibN(fibCache, (n - 1))
                + recursiveCachedFibN(fibCache, (n - 2));

        fibCache.put(n, value);

        return value;
    }

    private static void validateInput(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(INPUT_ERR_MSG);
        }
    }
}
