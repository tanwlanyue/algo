package leetcode;

import java.util.LinkedList;

/**
 * FIXME 耗时长
 * 双端队列
 */
public class LC0239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] maxTable = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();
            }
            queue.addLast(i);
            if(i>=k){
                if (queue.peekFirst()<=i-k) {
                    queue.pollFirst();
                }
            }
            if(i+1 >= k){
                maxTable[i+1-k] = nums[queue.peekFirst()];
            }
        }
        return maxTable;
    }

}
