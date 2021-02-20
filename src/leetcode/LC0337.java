package leetcode;

import util.TreeNode;

import java.util.HashMap;

/**
 * FIXME
 * 慢
 */
public class LC0337 {

    HashMap<TreeNode, Integer> map = new HashMap<>();
    public int rob(TreeNode root) {
        return Math.max(rob(root,true),rob(root,false));
    }

    private int rob(TreeNode root, boolean rob) {
        if(root==null){
            return 0;
        }
        if(!rob){
            int robLeft=map.containsKey(root.left)?map.get(root.left):rob(root.left,true);
            int robRight=map.containsKey(root.right)?map.get(root.right):rob(root.right,true);
            return Math.max(robLeft,rob(root.left,false))+Math.max(robRight,rob(root.right,false));
        }else {
            int maxSum=rob(root.left,false)+rob(root.right,false)+root.val;
            map.put(root,maxSum);
            return maxSum;
        }
    }
}
