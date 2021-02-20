package offer;

import java.util.Arrays;

public class OF50 {

    public char firstUniqChar(String s) {
        if(s.length()==0){
            return ' ';
        }
        int[] table = new int[128];
        Arrays.fill(table,-1);
        for (int i = 0; i < s.toCharArray().length; i++) {
            if(table[s.charAt(i)]==-1){
                table[s.charAt(i)]=i;
            }else {
                table[s.charAt(i)]=s.length();
            }
        }
        int minIndex=s.length();
        for (int i = 0; i < table.length; i++) {
            if(table[i]>=0){
                minIndex=Math.min(minIndex,table[i]);
            }
        }
        return minIndex==s.length()?' ':s.charAt(minIndex);
    }

    public static void main(String[] args) {
        new OF50().firstUniqChar("loveleetcode");
    }
}
