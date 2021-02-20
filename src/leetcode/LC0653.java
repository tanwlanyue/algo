package leetcode;

import util.TreeNode;

/**
 * 99.67%
 * 52.54%
 */
public class LC0653 {
    TreeNode origin;
    boolean flag=false;
    public boolean findTarget(TreeNode root, int k) {
        this.origin=root;
        dfs(root,k);
        return flag;
    }

    private void dfs(TreeNode root, int k) {
        if(root==null){
            return;
        }
        dfs(root.left,k);
        if (search(root,k-root.val)) {
            flag=true;
            return;
        }
        dfs(root.right,k);
    }

    private boolean search(TreeNode root, int target) {
        TreeNode node=origin;
        while (node!=null){
            if(target==node.val&&root!=node){
                return true;
            }else if(target>node.val){
                node=node.right;
            }else {
                node=node.left;
            }
        }
        return false;
    }
}
