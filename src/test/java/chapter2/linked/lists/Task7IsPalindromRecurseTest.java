package chapter2.linked.lists;


import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class Task7IsPalindromRecurseTest {

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

        Task7IsPalindromRecurse palindromeUtil = new Task7IsPalindromRecurse();

        // test good palindrome Linked List
        assertThat(palindromeUtil.isPalindrome(head), is(true));

        // test bad palindrome Linked List
        assertThat(palindromeUtil.isPalindrome(node6), not(true));

        // test one node Linked List
        assertThat(palindromeUtil.isPalindrome(node1), is(true));

        // test empty Linked List
        assertThat(palindromeUtil.isPalindrome(null), is(true));
    }

    @Test
    public void testListSizeMethod() {
        LinkedListNode node1 = new LinkedListNode(0, null);
        LinkedListNode node2 = new LinkedListNode(1, node1);
        LinkedListNode node3 = new LinkedListNode(2, node2);

        // test normal Linked List
        assertThat(Task7IsPalindromRecurse.listSize(node3), is(3));

        // test one node Linked List
        assertThat(Task7IsPalindromRecurse.listSize(node1), is(1));

        // test empty Linked List
        assertThat(Task7IsPalindromRecurse.listSize(null), is(0));
    }

}
