package chapter5.bit.manipulation.task6;

public class SwapPair {
    public static int swap(int n) {
        return (n & 0xAAAAAAAA) >> 1 | (n & 0x55555555) << 1;
    }
}
