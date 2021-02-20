package leetcode;

public class LC0318 {

    public int maxProduct(String[] words) {
        int[] marks = new int[words.length];
        for (int i = 0; i < marks.length; i++) {
            char[] array = words[i].toCharArray();
            for (char c : array) {
                marks[i]|=1<<c-'A';
            }
        }
        int max=0;
        int length = words.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if((marks[i]&marks[j])==0){
                    max=Math.max(words[i].length()*words[j].length(),max);
                }

            }
        }
        return max;
    }
}
