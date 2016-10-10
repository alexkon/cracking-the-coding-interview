package chapter2.linked.lists;

public class RecursionFactorial {
    public static void main(String[] args) {
        int n = 10;
        long value = factorial(n);
        System.out.println(String.format("%d! = %d", n, value));
    }

    private static long factorial(int n) {
        if (n < 1) return 0;
        if (n == 1 ) return 1;
        return n * factorial(n - 1);
    }
}
