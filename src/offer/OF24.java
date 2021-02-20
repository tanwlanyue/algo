package offer;

import util.ListNode;

public class OF24 {

    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }

//    public ListNode reverseList(ListNode head) {
//        return recur(head, null);
//    }
//
//    private ListNode recur(ListNode cur,ListNode pre){
//        if(cur==null){
//            return pre;
//        }
//        ListNode ret = recur(cur.next, cur);
//        ret.next=pre;
//        return ret;
//    }
}
