package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0118 {

    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ret = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0||j==i-1){
                    list.add(1);
                }else {
                    List<Integer> upList = ret.get(i - 2);
                    list.add(upList.get(j-1)+upList.get(j));
                }
            }
            ret.add(list);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new LC0118().generate(5));
    }
}
