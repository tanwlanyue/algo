package advanced;

import java.util.HashMap;

class LRUCache {

    class Node{
        Node prev;
        Node next;
        Integer key;
        Integer value;

        public Node(Integer key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }

    class NodeList{
        Node head;
        Node tail;

        void addNode(Node node){
            if(head==null){
                head=node;
                tail=node;
            }else {
                node.prev=tail;
                tail.next=node;
                tail=node;
            }
        }

        void moveNodeToTail(Node node){
            if(tail==node){
                return;
            }
            if(head==node){
                head=head.next;
                head.prev=null;
                node.next=null;
                node.prev=tail;
                tail.next=node;
                tail=node;
            }else {
                node.next.prev=node.prev;
                node.prev.next=node.next;
                node.prev=tail;
                tail.next=node;
                tail=node;
            }


        }

        Node deleteHead(){
            if(head==null){
                return null;
            }
            Node ret=head;
            if(head==tail){
                head=null;
                tail=null;
            }else {
                head=head.next;
                head.prev=null;
                ret.next=null;
            }
            return ret;
        }


    }

    HashMap<Integer, Node> keyNodeMap;
    NodeList nodeList;
    int capacity;

    public LRUCache(int capacity) {
        this.keyNodeMap = new HashMap<>();
        this.capacity=capacity;
        this.nodeList=new NodeList();
    }

    public int get(int key) {
        if(keyNodeMap.containsKey(key)){
            Node node = keyNodeMap.get(key);
            nodeList.moveNodeToTail(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(keyNodeMap.containsKey(key)){
            Node node = keyNodeMap.get(key);
            node.value=value;
            nodeList.moveNodeToTail(node);
        }else {
            Node node = new Node(key,value);
            nodeList.addNode(node);
            keyNodeMap.put(key,node);
            if(keyNodeMap.size()==capacity+1){
                removeRecentUnused();
            }
        }
    }

    void removeRecentUnused(){
        Node node = nodeList.deleteHead();
        keyNodeMap.remove(node.key);
    }
}
