package leetcode;

import util.TreeNode;

public class LC0543 {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return res;
    }

    private int getHeight(TreeNode node) {
        if(node==null){
            return 0;
        }
        int leftH = getHeight(node.left);
        int rightH = getHeight(node.right);
        res=Math.max(res,leftH+rightH);
        return Math.max(leftH,rightH)+1;
    }
}
