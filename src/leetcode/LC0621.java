package leetcode;

public class LC0621 {

    public int leastInterval(char[] tasks, int n) {
        int[] sleep = new int[26];
        for (char task : tasks) {
            sleep[task - 'A']=n;
            for (char t : tasks) {
                if(t - task!=0){
                    sleep[t-'A']--;
                }
            }
        }
        return sleep.length;
    }
}
