package chapter3.stacks.and.queues;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StackTest {

    @Test
    public void testStack() {

        // initialize a stack
        Stack stack = new Stack();

        // null test
        stack.push(1);
        stack.push(2);
        stack.push(3);


        assertThat(3, is(stack.peek()));
        assertThat(3, is(stack.pop()));
        assertThat(2, is(stack.pop()));
        assertThat(1, is(stack.pop()));
        assertThat(null, is(stack.pop()));
        assertThat(null, is(stack.peek()));
    }
}
