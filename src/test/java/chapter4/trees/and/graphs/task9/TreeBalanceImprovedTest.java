package chapter4.trees.and.graphs.task9;

import chapter4.trees.and.graphs.TreeNode;
import chapter4.trees.and.graphs.task1.TreeBalanceImproved;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TreeBalanceImprovedTest {

    @Test
    public void isBalancedTest() {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(7);
        TreeNode node7 = new TreeNode(-3);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node6.right = node7;

        assertThat(TreeBalanceImproved.isBalanced(root), is(true));
    }


}
