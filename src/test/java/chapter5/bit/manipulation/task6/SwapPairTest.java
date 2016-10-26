package chapter5.bit.manipulation.task6;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SwapPairTest {

    @Test
    public void swapMethodNormalTest() {
        int a = 0b11001001;
        int aSwaped = 0b11000110;
        assertThat(aSwaped, is(SwapPair.swap(a)));
    }

    @Test
    public void swapMethodZeroTest() {
        int a = 0;
        assertThat(a, is(SwapPair.swap(a)));
    }

    @Test
    public void swapMethodOneTest() {
        int a = 0b1;
        int aSwaped = 0b10;
        assertThat(aSwaped, is(SwapPair.swap(a)));
    }
}
