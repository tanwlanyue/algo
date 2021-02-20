package leetcode;

import util.ListNode;

/**
 * 100%
 * 98.64%
 */
public class LC0328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode oddHead=head;
        ListNode evenHead=head.next;
        ListNode odd=oddHead;
        ListNode even=evenHead;
        while (even!=null&&even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return oddHead;
    }
}
