package leetcode;

/**
 * 100.00%
 * 17.10%
 */
public class LC0557 {

    public String reverseWords(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int length = s.length();
        while (i < length) {
            int start = i;
            while (i < length && array[i] != ' ') {
                i++;
            }
            int left = start, right = i-1;
            while (left < right) {
                char tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
            while (i < length && array[i] == ' ') {
                i++;
            }
        }
        return new String(array);
    }
}
