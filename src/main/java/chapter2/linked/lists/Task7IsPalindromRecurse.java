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

    static int listSize(LinkedListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
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
