package chapter2.linked.lists;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class RecursionFibonacciCached {

    private static Map<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        int n = 45;
        printFibonacciNumbers(n);
    }

    private static void printFibonacciNumbers(int n) {
        IntStream.range(1, n + 1).forEach(i -> System.out.printf("%d) %d \n",i, fibonacci(i)));
    }

    private static int fibonacci(int n) {

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        if (n < 0) {
            System.err.println("n should be greater than 0");
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int result = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, result);
        return cache.get(n);

//        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
