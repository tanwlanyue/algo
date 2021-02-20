package leetcode;

import util.TreeNode;

/**
 * 100.00%
 * 92.02%
 */
public class LC0098 {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root,Long min,Long max) {
        if(root==null){
            return true;
        }
        if(root.val<=min||root.val>=max){
            return false;
        }
        return isValidBST(root.left,min,(long)root.val)&&isValidBST(root.right,(long)root.val,max);
    }
}
