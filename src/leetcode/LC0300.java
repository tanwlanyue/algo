package leetcode;

/**
 * TODO
 */
public class LC0300 {

//    public int lengthOfLIS(int[] nums) {
//        int[] d = new int[nums.length+1];// 表示长度为i的最长上升子序列的末尾元素的最小值
//        int len=1;
//        d[len]=nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i]>d[len]){
//                d[++len]=nums[i];
//            }else {
//                int pos=0;
//                int left=1,right=len;
//                while (left<=right){
//                    int mid=left+(right-left)/2;
//                    if(nums[i]>d[mid]){
//                        pos=mid;
//                        left=mid+1;
//                    }else {
//                        right=mid-1;
//                    }
//                }
//                d[pos+1]=nums[i];
//            }
//
//        }
//        return len;
//    }

    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for(int num : nums) {
            int i = 0, j = res;
            while(i < j) {
                int m = (i + j) / 2;
                if(tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[i] = num;
            if(res == j) res++;
        }
        return res;
    }
}
