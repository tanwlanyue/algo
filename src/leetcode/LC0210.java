package leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;

public class LC0210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ret = new int[numCourses];
        int[] inDegree = new int[numCourses];
        HashSet<Integer>[] sets = new HashSet[numCourses];
        for (int i = 0; i < sets.length; i++) {
            sets[i]=new HashSet<>();
        }
        for (int[] p : prerequisites) {
            inDegree[p[0]]++;
            sets[p[1]].add(p[0]);
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < inDegree.length; i++) {
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        int cnt=0;
        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            ret[cnt++]=poll;
            for (Integer successor : sets[poll]) {
                inDegree[successor]--;
                if(inDegree[successor]==0){
                    queue.add(successor);
                }
            }
        }
        return cnt==numCourses?ret:new int[0];
    }
}
