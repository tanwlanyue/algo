package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class LC0406 {

    public int[][] reconstructQueue(int[][] people) {
        // [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
        Arrays.sort(people, (p1, p2) -> p1[0] == p2[0] ? p1[1] - p2[1] : p2[0] - p1[0]);
        // [[7,0],[7,1],[6,1],[5,0],[5,2],[4,4]]
        LinkedList<int[]> list = new LinkedList<>();
        // 再一个一个插入。
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]
        for (int[] person : people) {
            list.add(person[1], person);
        }
        return list.toArray(new int[people.length][2]);
    }
}
