package leetcode;

public class LC0387 {

    public int firstUniqChar(String s) {
        int[] table = new int[26];
        char[] array = s.toCharArray();
        for (char c : array) {
            table[c-'a']++;
        }
        for (int i=0; i < array.length; i++) {
            char c = s.charAt(i);
            if(table[c-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new LC0387().firstUniqChar("loveleetcode"));
    }
}
