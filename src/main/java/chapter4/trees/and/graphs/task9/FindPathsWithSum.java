package chapter4.trees.and.graphs.task9;

public class FindPathsWithSum {

    private static void findSum(TreeNode node, int sum, int[] path, int level) {
        if (node == null) {
            return;
        }

        path[level] = node.data;

        int newSum = 0;
        for (int i = level; i >= 0; i--) {
            newSum += path[i];
            if (newSum == sum) {
                printPath(path, i, level);
            }
        }

        findSum(node.left, sum, path, level + 1);
        findSum(node.right, sum, path, level + 1);

        path[level] = Integer.MIN_VALUE;
    }

    private static void printPath(int[] path, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", path[i]);
        }
        System.out.println();
    }

    private static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return Math.max(depth(node.left), depth(node.right)) + 1;
        }
    }

    public static void findSum(TreeNode node, int sum) {
        int depth = depth(node);
        int[] path = new int[depth];
        findSum(node, sum, path, 0);
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int v) {
        this.data = v;
    }
}
