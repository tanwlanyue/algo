package offer;

import java.util.PriorityQueue;

public class OF40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : arr) {
            heap.add(i);
        }
        int[] ints = new int[k];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=heap.poll();
        }
        return ints;
    }
}
