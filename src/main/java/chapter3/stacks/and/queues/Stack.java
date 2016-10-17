package chapter3.stacks.and.queues;

public class Stack {
    
    private LinkedNode top;
    
    public void push(Object data) {
        LinkedNode node = new LinkedNode(data);
        
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }
    
    public Object pop() {
        if (top == null) return null;
        
        Object item = top.data;
        top = top.next;
        return item;
    }

    public Object peek() {
        return top != null ? top.data : null;
    }
    
    class LinkedNode {
        Object data;
        LinkedNode next;
        
        public LinkedNode (Object data) {
            this.data = data;
        }
    }
}
