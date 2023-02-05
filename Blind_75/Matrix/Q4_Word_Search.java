package Blind_75.Matrix;

public class Q4_Word_Search {

    class Solution {
        private boolean DFS(char[][] board, int r, int c, String word, int index,
                            boolean[][] visited) {
            if (isInvalidPosition(board, r, c, word, index, visited)) {
                return false;
            }
            if (index == word.length() - 1) {
                return true;
            }

            visited[r][c] = true;
            boolean down = DFS(board, r + 1, c, word, index + 1, visited);
            boolean right = DFS(board, r, c + 1, word, index + 1, visited);
            boolean up = DFS(board, r - 1, c, word, index + 1, visited);
            boolean left = DFS(board, r, c - 1, word, index + 1, visited);
            visited[r][c] = false;

            return left || right || down || up;
        }

        private boolean isInvalidPosition(char[][] board, int r, int c, String word,
                                          int index, boolean[][] visited) {
            if (r < 0 || r >= board.length || c < 0 || c >= board[0].length
                    || board[r][c] != word.charAt(index) || visited[r][c]) {
                return true;
            }
            return false;
        }

        public boolean exist(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        boolean[][] visited = new boolean[board.length][board[0].length];
                        boolean found = DFS(board, i, j, word, 0, visited);
                        if (found) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}
