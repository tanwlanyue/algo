package leetcode;

/**
 * 100.00%
 * 59.67%
 */
public class LC0344 {

    public void reverseString(char[] s) {
        int length = s.length;
        char tmp;
        for (int i = 0; i < length/2; i++) {
            tmp=s[i];
            s[i]=s[length-i-1];
            s[length-i-1]=tmp;
        }
    }
}
