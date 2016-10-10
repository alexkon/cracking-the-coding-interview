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

    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode(0, null);
        LinkedListNode node2 = new LinkedListNode(1, node1);
        LinkedListNode node3 = new LinkedListNode(2, node2);
        LinkedListNode node4 = new LinkedListNode(3, node3);
        LinkedListNode node5 = new LinkedListNode(2, node4);
        LinkedListNode node6 = new LinkedListNode(1, node5);
        LinkedListNode node7 = new LinkedListNode(0, node6);

        LinkedListNode head = node7;

        System.out.println("Is Palindrome: " + new Task7IsPalindromeIterative().isPalindrome(node7));

    }
}
