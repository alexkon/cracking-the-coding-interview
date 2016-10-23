package chapter2.linked.lists.task7;

import chapter2.linked.lists.LinkedListNode;
import chapter2.linked.lists.task7.IsPalindromeIterative;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class IsPalindromeIterativeTest {

    @Test
    public void testIsPalindromeMethod() {
        LinkedListNode node1 = new LinkedListNode(0, null);
        LinkedListNode node2 = new LinkedListNode(1, node1);
        LinkedListNode node3 = new LinkedListNode(2, node2);
        LinkedListNode node4 = new LinkedListNode(3, node3);
        LinkedListNode node5 = new LinkedListNode(2, node4);
        LinkedListNode node6 = new LinkedListNode(1, node5);
        LinkedListNode node7 = new LinkedListNode(0, node6);

        LinkedListNode head = node7;

        IsPalindromeIterative palindromeUtil = new IsPalindromeIterative();

        // test good palindrome Linked List
        assertThat(palindromeUtil.isPalindrome(head), is(true));

        // test bad palindrome Linked List
        assertThat(palindromeUtil.isPalindrome(node6), not(true));

        // test one node Linked List
        assertThat(palindromeUtil.isPalindrome(node1), is(true));

        // test empty Linked List
        assertThat(palindromeUtil.isPalindrome(null), is(true));
    }
}
