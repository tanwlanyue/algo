package offer;

import util.TreeNode;

public class OF55_2 {

    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return Math.abs(getDepth(root.left)-getDepth(root.right))<=1 && isBalanced(root.left) &&isBalanced(root.right);
    }

    int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getDepth(root.left),getDepth(root.right))+1;
    }

}
