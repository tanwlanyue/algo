package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ret.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    while (j < k && nums[k] == nums[--k]) ;
                    while (j < k && nums[j] == nums[++j]) ;
                } else if (sum > 0) {
                    while (j < k && nums[k] == nums[--k]) ;
                } else {
                    while (j < k && nums[j] == nums[++j]) ;
                }
            }
        }
        return ret;
    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        ArrayList<List<Integer>> ret = new ArrayList<>();
//        Arrays.sort(nums);
//        for (int k = 0; k <nums.length-2 ; k++) {
//            if(nums[k]>0){
//                break;
//            }
//            if(k>0&&nums[k]==nums[k-1]){
//                continue;
//            }
//            int i=k+1,j=nums.length-1;
//            while (i<j){
//                int sum=nums[i]+nums[j]+nums[k];
//                if(sum==0){
//                    ret.add(Arrays.asList(nums[k],nums[i],nums[j]));
//                    while (i<j&&nums[j]==nums[--j]);
//                    while (i<j&&nums[i]==nums[++i]);
//                }else if(sum>0){
//                    while (i<j&&nums[j]==nums[--j]);
//                }else {
//                    while (i<j&&nums[i]==nums[++i]);
//                }
//            }
//
//        }
//        return ret;
//    }
}
