package leetcode;

import util.TreeNode;

/**
 * 75.37%
 * 80.86%
 */
public class LC0530 {

    TreeNode preNode=null;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (preNode != null) {
            min = Math.min(min, Math.abs(preNode.val - root.val));
        }
        preNode = root;
        inOrder(root.right);
    }
}
