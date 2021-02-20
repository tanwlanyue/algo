package leetcode;

public class LC0038 {

    public String countAndSay(int n) {
        String begin="1";
        for (int j = 0; j < n; j++) {
            StringBuilder builder = new StringBuilder();
            char[] array = begin.toCharArray();
            char pre=array[0];
            int count=1;
            for (int i = 1; i < array.length; i++) {
                if (array[i]==array[i-1]) {
                    count++;
                }else {
                    builder.append(count);
                    builder.append(pre);
                    pre=array[i];
                    count=1;
                }
            }
            builder.append(count);
            builder.append(pre);
            begin=builder.toString();
        }
        return begin;
    }
}
