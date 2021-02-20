package leetcode;

import util.TreeNode;

public class LC105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int left=0,right=preorder.length-1;
        TreeNode root = buildTree(preorder, inorder, left, right,left,right);
        return root;
    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int preLeft, int preRight,int inLeft, int inRight) {
        if(preLeft>preRight||inLeft>inRight){
            return null;
        }
        int rootVal = preorder[preLeft];
        TreeNode node = new TreeNode(rootVal);
        int rootIndexInOrder=-1;
        for (int i = inLeft; i <=inRight ; i++) {
            if(inorder[i]==rootVal){
                rootIndexInOrder=i;
            }
        }
        int leftNodeCount=rootIndexInOrder-inLeft;
        int rightNodeCount=inRight-rootIndexInOrder;
        node.left=buildTree(preorder,inorder,preLeft+1,preLeft+leftNodeCount,inLeft,rootIndexInOrder-1);
        node.right=buildTree(preorder,inorder,preLeft+leftNodeCount+1,preRight,rootIndexInOrder+1,inRight);
        return node;
    }
}
