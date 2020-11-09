package offer;

import util.TreeNode;

public class OF27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode node = new TreeNode(root.val);
        node.left=mirrorTree(root.right);
        node.right=mirrorTree(root.left);
        return node;
    }
}
