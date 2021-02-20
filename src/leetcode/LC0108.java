package leetcode;

import util.TreeNode;

/**
 * 100.00%
 * 90.94%
 */
public class LC0108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if(left>right){
            return null;
        }
        int mid=(left+right)>>1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left=sortedArrayToBST(nums, left, mid-1);
        node.right=sortedArrayToBST(nums, mid+1, right);
        return node;
    }
}
