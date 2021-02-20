package leetcode;

public class LC0696 {

    public int countBinarySubstrings(String s) {
        int count=0;
        int preLen=0,curLen=1;
        char[] array = s.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if(array[i]==array[i-1]){
                curLen++;
            }else {
                preLen=curLen;
                curLen=1;
            }
            if(preLen>curLen){
                count++;
            }
        }
        return count;
    }
}
