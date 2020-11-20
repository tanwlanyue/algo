package leetcode;

import util.ListNode;

public class LC0082 {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next = head.next;
        if(head.val==next.val){
            while (next!=null&&next.val==head.val){
                    next=next.next;
            }
            return deleteDuplicates(next);
        }else {
            head.next=deleteDuplicates(head.next);
            return head;
        }
    }
}
