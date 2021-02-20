package offer;

import java.util.LinkedList;

public class OF59_1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        int[] ret = new int[length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        return ret;
    }
}

//    public int[] maxSlidingWindow(int[] nums, int k) {
//        int[] maxTable = new int[nums.length - k + 1];
//        ArrayDeque<Integer> queue = new ArrayDeque<>();
//        for (int i = 0; i < nums.length; i++) {
//            while (!queue.isEmpty()&&nums[queue.peekLast()]<=nums[i]){
//                queue.pollLast();
//            }
//            queue.addLast(i);
//            if(i>=k){
//                if (queue.peekFirst()<=i-k) {
//                    queue.pollFirst();
//                }
//            }
//            if(i+1 >= k){
//                maxTable[i+1-k] = nums[queue.peekFirst()];
//            }
//        }
//        return maxTable;
//    }