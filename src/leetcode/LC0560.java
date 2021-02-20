package leetcode;

import java.util.HashMap;

public class LC0560 {

    public int subarraySum(int[] nums, int k) {
        int count=0;
        int[] sumArray = new int[nums.length+1];
        sumArray[0]=0;
        HashMap<Integer, Integer> map = new HashMap<>();//和 次数
        for (int i = 0; i < nums.length; i++) {
            sumArray[i+1]=sumArray[i]+nums[i];
        }
        for (int i = 0; i < sumArray.length; i++) {
            Integer time = map.getOrDefault(sumArray[i]-k, 0);
            count+=time;
            map.put(sumArray[i],map.getOrDefault(sumArray[i],0)+1);
        }
        return count;
    }
}
