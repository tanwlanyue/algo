package leetcode;

import java.util.HashMap;

/**
 * 98.85%
 * 85.18%
 */
public class LC0149 {

    public int maxPoints(int[][] points) {
        int length = points.length;
        if(length<=2){
            return length;
        }
        int maxPoints=0;
        for (int i = 0; i < length; i++) {
            maxPoints=Math.max(getPoints(points,i),maxPoints);
        }
        return maxPoints;
    }


    int getPoints(int[][] points,int index){
        int vertical=0;
        int dup=0;
        int max=0;
        int x1=points[index][0];
        int y1=points[index][1];
        HashMap<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            if(i==index){
                continue;
            }
            int x2=points[i][0];
            int y2=points[i][1];
            if(x1==x2){
                if(y1==y2){
                    dup++;
                }else {
                    vertical++;
                }
            }else {
                double key=(y1-y2)*1000.0/(x1-x2)+0.0;
                map.put(key,map.getOrDefault(key,0)+1);
            }
        }
        for (Integer value : map.values()) {
            max=Math.max(value,max);
        }
        max=Math.max(max,vertical);
        return max+dup+1;
    }

    public static void main(String[] args) {
        System.out.println(new LC0149().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }
}
