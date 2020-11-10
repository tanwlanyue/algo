package basic;

import static util.Method.print;
import static util.Method.swap;

/**
 * 为什么快速排序要比堆排序性能好
 * 1.堆排序数据访问的方式没有快速排序友好，对于快速排序来说，数据是顺序访问的。而对于堆排序来说，数据是跳着访问的
 * 2.对于同样的数据，在排序过程中，堆排序算法的数据交换次数要多于快速排序
 *
 */
public class HeapSort {

    public HeapSort() {
    }

    public HeapSort(int capacity) {
        this.nums = new int[capacity+1];
        this.n=capacity;
        this.count = 0;
    }

    private int[] nums;
    private int n;

    private int count;
    public void insert(int val){
        if(count>=n) return;
        ++count;
        nums[count]=val;
        shiftUp(count);
    }

    public int delete(){
        if(count==0){
            throw new RuntimeException("heap empty");
        }
        int res=nums[count];
        swap(nums,count,1);
        count--;
        shiftDown(1,n);
        return res;
    }

    private void shiftUp(int i) {
        while (i/2>0 && nums[i]>nums[i/2]){
            swap(nums,i,i/2);
            i=i/2;
        }
     }

    private void buildHeap(int[] nums) {
        this.nums=nums;
        this.n=nums.length-1;
        this.count=n;
        for (int i = n/2; i >= 1; i--) {
            shiftDown(i,n);
        }
    }

    public void sort(int[] nums){
        buildHeap(nums);
        for (int i = n; i >=1 ; i--) {
            swap(nums,1,i);
            shiftDown(1,i-1);
        }
    }

    private void shiftDown(int i,int n) {
        while (true){
            int maxPos=i;
            if (i*2 <= n && nums[i] < nums[i*2]) maxPos = i*2;
            if (i*2+1 <= n && nums[maxPos] < nums[i*2+1]) maxPos = i*2+1;
            if(maxPos==i) break;
            swap(nums,i,maxPos);
            i=maxPos;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,5,9,3,7,8,4,2,6};
        new HeapSort().sort(nums);
        print(nums);
    }

}
