package offer;

public class OF12 {

    int[][] ops = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, visited, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] visited, String word, int i, int j, int index) {
        int row = board.length;
        int col = board[0].length;
        if (i < 0 || i >= row || j < 0 || j >= col || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        if (word.length() - 1 == index) {
            return true;
        }
        visited[i][j] = true;
        for (int[] op : ops) {
            if (dfs(board, visited, word, i + op[0], j = op[1], index + 1)) {
                return true;
            }
        }
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(new OF12().exist(board, "ABCCED"));
    }
}
