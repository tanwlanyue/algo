package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * FIXME
 * 耗时长
 */
public class LC0056 {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        LinkedList<int[]> ret = new LinkedList<>();
        ret.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] cur = intervals[i];
            int[] pre = ret.getLast();
            if (cur[0]>pre[1]) {
                ret.add(cur);
            }else if (cur[1]<pre[0]){
                ret.add(cur);
            }else {
                int left=Math.min(cur[0],pre[0]);
                int right=Math.max(cur[1],pre[1]);
                int[] newI = {left, right};
                ret.removeLast();
                ret.add(newI);
            }

        }
        int[][] ints = new int[ret.size()][2];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=ret.get(i);
        }
        return ints;
    }
}
