package leetcode;

import java.util.ArrayDeque;
import java.util.HashSet;

/**
 * 入度表+后继set
 */
public class LC0207 {


//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        int[] inDegree = new int[numCourses];
//        HashSet<Integer>[] sets = new HashSet[numCourses];
//        for (int i = 0; i < sets.length; i++) {
//            sets[i]=new HashSet<>();
//        }
//        for (int[] p : prerequisites) {
//            inDegree[p[0]]++;
//            sets[p[1]].add(p[0]);
//        }
//        ArrayDeque<Integer> queue = new ArrayDeque<>();
//        for (int i = 0; i < inDegree.length; i++) {
//            if(inDegree[i]==0){
//                queue.add(i);
//            }
//        }
//        int count = 0;
//        while (!queue.isEmpty()) {
//            Integer pre = queue.poll();
//            count++;
//            for (int successor : sets[pre]) {
//                inDegree[successor]--;
//                if (inDegree[successor] == 0) {
//                    queue.add(successor);
//                }
//            }
//        }
//        return count==numCourses;
//    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
                queue.offer(i);
            }
        }
        int count=0;
        while (!queue.isEmpty()){
            HashSet<Integer> set = sets[queue.poll()];
            count++;
            for (Integer course : set) {
                inDegree[course]--;
                if(inDegree[course]==0){
                    queue.offer(course);
                }
            }

        }
        return count==numCourses;
    }
}
