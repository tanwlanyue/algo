package leetcode;

public class LC0066 {

    public int[] plusOne(int[] digits) {
        boolean isNeed=true;
        for (int digit : digits) {
            if(digit!=9){
                isNeed=false;
                break;
            }
        }
        if(isNeed){
            int[] ret = new int[digits.length + 1];
            ret[0]=1;
            for (int i = 1; i < ret.length; i++) {
                ret[i]=0;
            }
            return ret;
        }
        int plus=0;
        for (int i = digits.length-1; i >= 0; i--) {
            int sum=i==digits.length-1?digits[i]+1+plus:digits[i]+plus;
            plus=sum>=10?1:0;
            digits[i]=sum%10;
        }
        return digits;
    }
}
