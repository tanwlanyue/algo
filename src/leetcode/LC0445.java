package leetcode;

import util.ListNode;

import java.util.ArrayDeque;

public class LC0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayDeque<Integer> stack1=build(l1);
        ArrayDeque<Integer> stack2=build(l2);
        int carry=0;
        ListNode head = new ListNode(-1);
        while (!stack1.isEmpty()||!stack2.isEmpty()||carry!=0){
            int l1Val=stack1.isEmpty()?0:stack1.pop();
            int l2Val=stack2.isEmpty()?0:stack2.pop();
            int sum=l1Val+l2Val+carry;
            carry=sum>=10?1:0;
            ListNode node = new ListNode(sum % 10);
            node.next=head.next;
            head.next=node;
        }
        return head.next;
    }

    private ArrayDeque<Integer> build(ListNode listNode){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        return stack;
    }
}
