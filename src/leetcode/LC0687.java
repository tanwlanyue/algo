package leetcode;

import util.TreeNode;

public class LC687 {

    int maxLen=0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return maxLen;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int val=root.val;
        left=(root.left!=null&& root.left.val==val)?left+1:0;
        right=(root.right!=null&& root.right.val==val)?right+1:0;
        maxLen=Math.max(maxLen,left+right);
        return Math.max(left,right);
    }

}
