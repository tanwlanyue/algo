package leetcode;

import java.util.HashSet;

public class LC0036 {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set;
        for (int i = 0; i < 9; i++) {
            set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c!='.'){
                    boolean add = set.add(c);
                    if(!add){
                        return false;
                    }
                }
            }
        }
        for (int j = 0; j< 9; j++) {
            set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if(c!='.'){
                    boolean add = set.add(c);
                    if(!add){
                        return false;
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                set = new HashSet<>();
                for (int k = i*3; k < i*3+3; k++) {
                    for (int m = j*3; m < j*3+3; m++) {
                        char c = board[k][m];
                        if(c!='.'){
                            boolean add = set.add(c);
                            if(!add){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
