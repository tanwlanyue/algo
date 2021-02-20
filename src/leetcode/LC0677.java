package leetcode;

public class LC0677 {
}

class MapSum {

    class Node{
        Node[] child=new Node[26];
        boolean isLeaf;
        int val=0;
    }

    private Node root=new Node();

    private int indexForChar(char c) {
        return c - 'a';
    }

    public MapSum() {

    }

    public void insert(String key, int val) {
        Node parent=root;
        for (char c : key.toCharArray()) {
            int index = indexForChar(c);
            if(parent.child[index]==null){
                parent.child[index]=new Node();
            }
            parent=parent.child[index];
        }
        parent.isLeaf=true;
        parent.val=val;
    }

    public int sum(String prefix) {
        return sum(lastNode(prefix));
    }

    public Node lastNode(String prefix) {
        Node cur = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (cur.child[index] == null) {
                return null;
            }
            cur = cur.child[index];
        }
        return cur;
    }

    public int sum(Node node) {
        if (node == null) {
            return 0;
        }

        int sum = 0;
        if (node.isLeaf) {
            sum += node.val;
        }

        for (Node child : node.child) {
            sum += sum(child);
        }

        return sum;
    }
}
