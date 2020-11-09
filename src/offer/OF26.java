package offer;

import util.TreeNode;

public class OF26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null){
            return false;
        }
        return isSubStructureWithRoot(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public boolean isSubStructureWithRoot(TreeNode A, TreeNode B) {
        if(B==null){
            return true;
        }
        if(A==null){
            return false;
        }
        if(A.val!=B.val){
            return false;
        }
        return isSubStructureWithRoot(A.left,B.left) && isSubStructureWithRoot(A.right,B.right);
    }
}
