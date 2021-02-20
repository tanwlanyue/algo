package leetcode;

public class LC0079 {
    private final int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]==word.charAt(0)){
                    if (dfs(board,i,j,word,0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word,int index) {
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(index++)){
            return false;
        }
        if(index==word.length()){
            return true;
        }
        char tmp = board[i][j];
        board[i][j]='.';
        for (int[] d : direction) {
            if(dfs(board,i+d[0],j+d[1],word,index)){
                return true;
            }
        }
        board[i][j]=tmp;
        return false;
    }


}
