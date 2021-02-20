package leetcode;

import util.TreeNode;

/**
 * 100.00%
 * 55.39%
 */
public class LC0513 {

    int ret=-1;
    int maxDepth=-1;
    public int findBottomLeftValue(TreeNode root) {
        depth(root,0);
        return ret;
    }

    private void depth(TreeNode root, int depth) {
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            if(depth>maxDepth){
                maxDepth=depth;
                ret=root.val;
            }
        }
        depth(root.left,depth+1);
        depth(root.right,depth+1);
    }
}
