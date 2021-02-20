package offer;

import util.TreeNode;

/**
 * 剑指 Offer 26. 树的子结构
 */
public class OF26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null){
            return false;
        }
        return recur(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    private boolean recur(TreeNode a, TreeNode b) {
        if(b==null){
            return true;
        }
        if(a==null){
            return false;
        }
        if(a.val!=b.val){
            return false;
        }
        return recur(a.left,b.left)&&recur(a.right,b.right);
    }
}
