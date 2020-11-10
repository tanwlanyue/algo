package leetcode;

import util.TreeNode;

public class LC0124 {

    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftGain=Math.max(maxGain(root.left),0);
        int rightGain=Math.max(maxGain(root.right),0);

        int total=root.val+leftGain+rightGain;
        maxSum=Math.max(maxSum,total);
        return root.val+Math.max(leftGain,rightGain);
    }
}
