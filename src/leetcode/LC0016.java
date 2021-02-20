package leetcode;

import java.util.Arrays;

public class LC0016 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ret=nums[0]+nums[1]+nums[2];
        int minDistance=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int j=i+1,k=nums.length-1;
            while (j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }
                int distance = Math.abs(sum - target);
                if(distance<minDistance){
                    ret=sum;
                    minDistance=distance;
                }
                if(sum>target){
                    k--;
                }else if(sum<target){
                    j++;
                }
            }
        }
        return ret;
    }

//    public int threeSumClosest(int[] nums, int target) {
//        Arrays.sort(nums);
//        int minDistance=Integer.MAX_VALUE;
//        int ret=nums[0]+nums[1]+nums[2];
//        for (int k = 0; k <nums.length-2 ; k++) {
//            int i=k+1,j=nums.length-1;
//            while (i<j){
//                int sum=nums[i]+nums[j]+nums[k];
//                int distance=Math.abs(target-sum);
//                if(distance==0){
//                    return target;
//                }
//                if(distance<minDistance){
//                    ret=sum;
//                    minDistance=distance;
//                }
//                if(target>sum){
//                    i++;
//                }else {
//                    j--;
//                }
//            }
//        }
//        return ret;
//    }

}
