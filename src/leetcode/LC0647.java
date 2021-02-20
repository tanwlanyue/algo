package leetcode;

/**
 * 中心扩展，一种奇数个，一种偶数个
 */
public class LC0647 {

    public int countSubstrings(String s) {
        int count=0;
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            count+=count(array,i,i);
            count+=count(array,i,i+1);
        }
        return count;
    }

    private int count(char[] array, int left,int right) {
        int count=0;
        while (left>=0&&right<array.length){
            if(array[left]==array[right]){
                count++;
                left--;
                right++;
            }else {
                break;
            }
        }
        return count;
    }
}
