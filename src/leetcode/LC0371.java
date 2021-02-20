package leetcode;

/**
 * 100.00%
 * 92.77%
 */
public class LC0371 {

//    public int getSum(int a, int b) {
//        while (b != 0) {
//            int temp = a ^ b;
//            b = (a & b) << 1;
//            a = temp;
//        }
//        return a;
//    }


    public int getSum(int a, int b) {
        while (b!=0){
            int temp=a^b;
            b=(a&b)<<1;
            a=temp;
        }
        return a;
    }
}
