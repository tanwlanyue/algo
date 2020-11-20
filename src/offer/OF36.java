package offer;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class OF36 {
    Node pre,head=null;
    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        dfs(root);
        head.left=pre;
        pre.right=head;
        return head;
    }

    private void dfs(Node cur) {
        if(cur==null) return;
        dfs(cur.left);
        if(pre!=null) pre.right=cur;
        if(head==null) head=cur;
        cur.left=pre;
        pre=cur;
        dfs(cur.right);
    }
}