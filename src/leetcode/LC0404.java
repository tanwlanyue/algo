package leetcode;

import util.TreeNode;

public class LC0404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int val= root.left!=null&&root.left.left==null&&root.left.right==null?root.left.val:0;
        int left = sumOfLeftLeaves(root.left)+val;
        int right = sumOfLeftLeaves(root.right);
        return left+right;
    }
}
