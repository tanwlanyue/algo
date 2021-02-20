package leetcode;

import util.TreeNode;

/**
 * 100.00%
 * 91.36%
 */
public class LC0104 {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
