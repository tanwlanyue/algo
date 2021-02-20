package offer;

import util.TreeNode;

public class OF07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode node = buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder,int preL,int preR,int inL,int inR) {
        if(preL>preR||inL>inR){
            return null;
        }
        int rootVal = preorder[preL];
        int inorderRootIndex=inL;
        for (int i = inL; i <= inR; i++) {
            if(rootVal==inorder[i]){
                inorderRootIndex=i;
            }
        }
        int leftNodeCount=inorderRootIndex-inL;
        TreeNode root = new TreeNode(rootVal);
        root.left=buildTree(preorder,inorder,preL+1,preL+leftNodeCount,inL,inorderRootIndex-1);
        root.right=buildTree(preorder,inorder,preL+leftNodeCount+1,preR,inorderRootIndex+1,inR);
        return root;
    }
}
