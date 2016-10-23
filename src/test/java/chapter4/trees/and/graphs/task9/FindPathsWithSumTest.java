package chapter4.trees.and.graphs.task9;

import org.junit.Before;
import org.junit.Test;

public class FindPathsWithSumTest {

    TreeNode tree;

    @Before
    public void createTree() {

        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(-3);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node7.left = node8;

        tree = root;
    }

    @Test
    public void findSumTest() {
        FindPathsWithSum.findSum(tree, 8);
    }
}
