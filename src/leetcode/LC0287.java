package leetcode;

public class LC0287 {

    public int findDuplicate(int[] nums) {
        int ret=0;
        for (int i = 0; i < nums.length; i++) {
            int curNum=nums[i];
            while (curNum!=i+1){
                if(nums[curNum-1]==curNum){
                    ret=curNum;
                    break;
                }else {
                    int tmp=nums[curNum-1];
                    nums[curNum-1]=curNum;
                    nums[i]=tmp;
                    curNum=nums[i];
                }
            }
        }
        return ret;
    }
}
