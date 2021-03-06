package leetcode;

public class LC0260 {

    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int diff=0;
        for (int num : nums) {
            diff^=num;
        }
        int div=1;
        while ((diff&div)==0){
            div=div<<1;
        }
        for (int num : nums) {
            if((num&div)==0){
                res[0]^=num;
            }else {
                res[1]^=num;
            }
        }
        return res;
    }
}
