package leetcode;

public class LC0208 {

}

class Trie {

    class Node{
        Node[] child=new Node[26];
        boolean isLeaf=false;
    }

    private Node root=new Node();

    private int indexForChar(char c) {
        return c - 'a';
    }

    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {

        insert(word,root);

    }

    private void insert(String word, Node node) {
        if(node==null){
            return;
        }
        Node parent=root;
        for (char c : word.toCharArray()) {
            int index = indexForChar(c);
            if(parent.child[index]==null){
                parent.child[index]=new Node();
            }
            parent=parent.child[index];
        }
        parent.isLeaf=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node parent=root;
        for (char c : word.toCharArray()) {
            int index = indexForChar(c);
            if(parent.child[index]==null){
                return false;
            }
            parent=parent.child[index];
        }
        return parent.isLeaf;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node parent=root;
        for (char c : prefix.toCharArray()) {
            int index = indexForChar(c);
            if(parent.child[index]==null){
                return false;
            }
            parent=parent.child[index];
        }
        return true;
    }
}
