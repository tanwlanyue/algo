package leetcode;

import java.util.Arrays;

/**
 * 92.29%
 * 92.77%
 */
public class LC0128 {
//    public int longestConsecutive(int[] nums) {
//        Map<Integer, Integer> countForNum = new HashMap<>();
//        for (int num : nums) {
//            countForNum.put(num,1);
//        }
//        for (int num : nums) {
//            forward(countForNum,num);
//        }
//        Iterator<Integer> iterator = countForNum.values().iterator();
//        int res=0;
//        while (iterator.hasNext()) {
//            res=Math.max(iterator.next(),res);
//        }
//        return res;
//    }
//
//    private int forward(Map<Integer, Integer> countForNum, int num) {
//        if(!countForNum.containsKey(num)){
//            return 0;
//        }
//        int cnt = countForNum.get(num);
//        if(cnt>1){
//            return cnt;
//        }
//        cnt=forward(countForNum,num+1)+1;
//        countForNum.put(num,cnt);
//        return cnt;
//    }

    public int longestConsecutive(int[] nums) {
        int length = nums.length;
        if(length<=1){
            return length;
        }
        Arrays.sort(nums);
        int maxLen=1;
        int len=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]+1){
                len++;
            }else if (nums[i]>nums[i-1]+1){
                len=1;
            }
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}
