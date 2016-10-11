package chapter2.linked.lists;

import java.util.Stack;

public class Task7IsPalindromeIterative {

    public boolean isPalindrome(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        Stack<LinkedListNode> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Has odd number of elements, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            LinkedListNode top = stack.pop();
            if (slow.data != top.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}
