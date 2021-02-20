package leetcode;

import util.ListNode;

/**
 * 99.49%
 * 6.29%
 */
public class LC0203 {

    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        if(head.val==val){
            return removeElements(head.next,val);
        }
        head.next=removeElements(head.next,val);
        return head;
    }
}
