package offer;

import util.TreeNode;

/**
 * 99.94%
 * 58.38%
 */
public class OF68_2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if(leftNode!=null&&rightNode!=null){
            return root;
        }
        return leftNode==null?rightNode:leftNode;
    }
}
