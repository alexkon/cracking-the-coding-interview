package chapter3.stacks.and.queues;

import java.util.Stack;

public class Task4TowersOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        Tower[] towers = new Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower(i);
        }
        for (int i = n; i > 0; i--) {
            towers[0].add(i);
        }
        towers[0].moveDisks(n, towers[2], towers[1]);
    }

}

class Tower {
    private int index;
    private Stack<Integer> disks;

    public Tower (int index) {
        this.index = index;
        disks = new Stack<>();
    }

    public int index() {
        return index;
    }

    public void add(int d) {
        if (!disks.empty() && disks.peek() < d) {
            System.err.println("Error placing disk " + d);
        } else {
            disks.push(d);
        }
    }

    public void moveTopTo(Tower t) {

        int top = disks.pop();
        t.add(top);
        System.out.println(String.format("Move disk %d from %d Tower to %d Tower", top, index(), t.index()));
    }

    public void moveDisks(int n, Tower destination, Tower buffer) {
        if (n > 0) {
            moveDisks(n - 1, buffer, destination);
            moveTopTo(destination);
            buffer.moveDisks(n - 1, destination, this);
        }
    }
}
