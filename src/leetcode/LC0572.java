package leetcode;

import util.TreeNode;

public class LC0572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){
            return false;
        }
        return isSubtreeStartRoot(s,t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }

    boolean isSubtreeStartRoot(TreeNode s, TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null||t==null){
            return false;
        }
        if(s.val!=t.val){
            return false;
        }
        return isSubtreeStartRoot(s.left,t.left) && isSubtreeStartRoot(s.right,t.right);
    }
}
