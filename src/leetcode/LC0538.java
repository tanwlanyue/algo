package leetcode;

import util.TreeNode;

/**
 * 83.70%
 * 97.45%
 */
public class LC0538 {

    int plusSum=0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return null;
        }
        convertBST(root.right);
        int val = root.val;
        root.val=val+plusSum;
        plusSum=root.val;
        convertBST(root.left);
        return root;
    }
}
