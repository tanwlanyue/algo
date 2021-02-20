package leetcode;

import util.ListNode;

public class LC0142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast==null){
                return null;
            }
            fast=fast.next;
            if(fast==slow){
                fast=head;
                while (fast!=null&&slow!=null){
                    if(slow==fast){
                        return fast;
                    }
                    fast=fast.next;
                    slow=slow.next;
                }
            }

        }
        return null;
    }

}
