package offer;

import util.ListNode;

public class OF25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode(-1);
        ListNode dummy=newhead;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                dummy.next=l1;
                dummy=l1;
                l1=l1.next;
            }else {
                dummy.next=l2;
                dummy=l2;
                l2=l2.next;
            }
        }
        if(l1!=null){
            dummy.next=l1;
        }
        if(l2!=null){
            dummy.next=l2;
        }
        return newhead.next;
    }
}
