package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0089 {

    public List<Integer> grayCode(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int head=1;
        for (int i = 0; i < n; i++) {
            for (int j = list.size()-1; j >= 0; j--) {
                list.add(head+list.get(j));
            }
            head=head<<1;
        }
        return list;
    }
}
