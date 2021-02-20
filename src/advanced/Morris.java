package advanced;

import util.TreeNode;

/**
 * 如果cur无左孩子，cur向右移动（cur=cur.right）
 * 如果cur有左孩子，找到cur左子树上最右的节点，记为mostright
 *      如果mostright的right指针指向空，让其指向cur，cur向左移动（cur=cur.left）
 *      如果mostright的right指针指向cur，让其指向空，cur向右移动（cur=cur.right）
 */
public class Morris {

    public static void morrisPre(TreeNode head) {
        if(head == null){
            return;
        }
        TreeNode cur = head;
        TreeNode mostRight = null;
        while (cur != null){
            mostRight = cur.left;
            if(mostRight != null){
                while (mostRight.right !=null && mostRight.right != cur){
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null){
                    mostRight.right = cur;
                    System.out.print(cur.val+" ");
                    cur = cur.left;
                    continue;
                }else {
                    mostRight.right = null;
                }
            }else {
                System.out.print(cur.val + " ");
            }
            cur = cur.right;
        }
        System.out.println();
    }

    public static void morrisIn(TreeNode head) {
        if(head == null){
            return;
        }
        TreeNode cur = head;
        TreeNode mostRight = null;
        while (cur != null){
            mostRight = cur.left;
            if(mostRight != null){
                while (mostRight.right !=null && mostRight.right != cur){
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null){
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                }else {
                    mostRight.right = null;
                }
            }
            System.out.print(cur.val+" ");
            cur = cur.right;
        }
        System.out.println();
    }

    public static void morrisPos(TreeNode head) {
        if(head == null){
            return;
        }
        TreeNode cur = head;
        TreeNode mostRight = null;
        while (cur != null){
            mostRight = cur.left;
            if(mostRight != null){
                while (mostRight.right !=null && mostRight.right != cur){
                    mostRight = mostRight.right;
                }
                if(mostRight.right == null){
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                }else {
                    mostRight.right = null;
                    printEdge(cur.left);
                }
            }
            cur = cur.right;
        }
        printEdge(head);
        System.out.println();
    }
    public static void printEdge(TreeNode node){
        TreeNode tail =reverseEdge(node);
        TreeNode cur = tail;
        while (cur != null ){
            System.out.print(cur.val+" ");
            cur =cur.right;
        }
        reverseEdge(tail);
    }
    public static TreeNode reverseEdge(TreeNode node){
        TreeNode pre = null;
        TreeNode next = null;
        while (node != null){
            next = node.right;
            node.right = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}
