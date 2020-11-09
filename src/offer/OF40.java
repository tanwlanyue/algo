package offer;

import java.util.PriorityQueue;

public class OF40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i : arr) {
            minHeap.offer(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        int j=0;
        while (j<k){
            res[j++]=minHeap.poll();
        }
        return res;
    }
}
