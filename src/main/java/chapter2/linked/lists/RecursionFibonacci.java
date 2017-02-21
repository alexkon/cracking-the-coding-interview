package chapter2.linked.lists;

import java.util.stream.IntStream;

public class RecursionFibonacci {
    public static void main(String[] args) {
        int n = 45;
        printFibonacciNumbers(n);
    }

    private static void printFibonacciNumbers(int n) {
        IntStream.range(1, n + 1).forEach(i -> System.out.printf("%d) %d \n",i, fibonacci(i)));
    }

    private static int fibonacci(int n) {
        if (n < 0) {
            System.err.println("n should be greater or equals than 0");
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
