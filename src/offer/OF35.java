package offer;

public class OF35 {

    public Node copyRandomList(Node head) {
        return null;
    }

//    public Node copyRandomList(Node head) {
//        if(head==null){
//            return null;
//        }
//        Node dummy=head;
//        while (dummy!=null){
//            Node copy = new Node(dummy.val);
//            copy.next=dummy.next;
//            dummy.next=copy;
//            dummy=copy.next;
//        }
//        dummy=head;
//        while (dummy!=null){
//            Node copy = dummy.next;
//            if(dummy.random!=null){
//                copy.random=dummy.random.next;
//            }
//            dummy=copy.next;
//        }
//        dummy=head;
//        Node res = head.next;
//        // TODO 拆分
//        while (dummy.next!=null){
//            Node copy = dummy.next;
//            dummy.next=copy.next;
//            dummy=copy;
//        }
//        return res;
//    }
}
