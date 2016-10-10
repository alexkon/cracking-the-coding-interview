package chapter2.linked.lists;

public class Task7IsPalindromRecurse {

    Result isPalindromeRecurse(LinkedListNode head, int length) {
        if (head == null || length == 0) {
            return new Result(null, true);
        } else if (length == 1) {
            return new Result(head.next, true);
        } else if (length == 2) {
            return new Result(head.next.next, head.data == head.next.data);
        }

        Result result = isPalindromeRecurse(head.next, length -2);
        if (!result.result || result.node == null) {
            return  result;
        } else {
            result.result = head.data == result.node.data;
            result.node = result.node.next;
            return result;
        }
    }

    boolean isPalindrome(LinkedListNode head) {
        Result r = isPalindromeRecurse(head, listSize(head));
        return r.result;
    }

    private static int listSize(LinkedListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
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

        System.out.println("Size of list: " + listSize(head));
        System.out.println("Is Palindrome: " + new Task7IsPalindromRecurse().isPalindrome(head));

    }
}

class Result {
    public boolean result;
    public LinkedListNode node;

    public Result (LinkedListNode node, boolean result) {
        this.result = result;
        this.node = node;
    }
}
