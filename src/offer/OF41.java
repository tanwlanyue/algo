package offer;

import java.util.PriorityQueue;

/**
 * 96.32%
 * 88.40%
 */
public class OF41 {
}
class MedianFinder {
    PriorityQueue<Integer> lHeap;
    PriorityQueue<Integer> rHeap;
    /** initialize your data structure here. */
    public MedianFinder() {
        lHeap = new PriorityQueue<>((x, y) -> (y - x));// 记录比较小的数字 大根堆
        rHeap = new PriorityQueue<>();// 记录比较大的数字 小根堆  保持左边的size 与右边的size差不多
    }

    public void addNum(int num) {
        if(lHeap.size()==rHeap.size()){
            if(lHeap.isEmpty()){
                lHeap.add(num);
            }else {
                if(num<=rHeap.peek()){
                    lHeap.add(num);
                }else {
                    lHeap.add(rHeap.poll());
                    rHeap.add(num);
                }
            }
        }else {
            if(num<lHeap.peek()){
                rHeap.add(lHeap.poll());
                lHeap.add(num);
            }else {
                rHeap.add(num);
            }
        }
    }

    public double findMedian() {
        return lHeap.size()==rHeap.size()?(lHeap.peek()+rHeap.peek())/2d:lHeap.peek();
    }
}