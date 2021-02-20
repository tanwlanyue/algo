package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0241 {

    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<>();
        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if(c=='+'||c=='-'||c=='*'){
                List<Integer> left = diffWaysToCompute(input.substring(0, i));
                List<Integer> right = diffWaysToCompute(input.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        switch (c) {
                            case '+':
                                ret.add(l + r);
                                break;
                            case '-':
                                ret.add(l - r);
                                break;
                            case '*':
                                ret.add(l * r);
                                break;
                        }
                    }
                }

            }
        }
        if (ret.size() == 0) {
            ret.add(Integer.valueOf(input));
        }
        return ret;
    }
}
