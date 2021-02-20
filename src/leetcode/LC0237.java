package leetcode;

import util.ListNode;

/**
 * 100.00%
 * 86.29%
 */
public class LC0237 {

    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
